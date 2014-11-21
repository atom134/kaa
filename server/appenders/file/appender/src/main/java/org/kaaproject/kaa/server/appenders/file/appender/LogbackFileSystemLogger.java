package org.kaaproject.kaa.server.appenders.file.appender;

import java.io.IOException;
import java.nio.file.Path;

import org.kaaproject.kaa.common.dto.logs.LogAppenderDto;
import org.kaaproject.kaa.server.appenders.file.config.FileConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;

public class LogbackFileSystemLogger implements FileSystemLogger {
    private static final Logger LOG = LoggerFactory.getLogger(LogbackFileSystemLogger.class);

    private ch.qos.logback.classic.Logger logger;
    private RollingFileAppender rfAppender;

    @Override
    public void close() throws IOException {
        if (rfAppender != null) {
            rfAppender.stop();
        }
    }

    @Override
    public void init(LogAppenderDto appenderDto, FileConfig config, Path filePath) {
        LOG.info(
                "[{}][{}][{}] Initializing with rollingFileNamePatern: {}, rollingMaxHistory: {}, triggerMaxFileSize: {}, encoderPattern: {}",
                appenderDto.getTenantId(), appenderDto.getApplicationId(), appenderDto.getSchemaVersion(),
                config.getRollingFileNamePatern(), config.getRollingMaxHistory(), config.getTriggerMaxFileSize(), config.getEncoderPattern());
        
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        rfAppender = new RollingFileAppender();
        rfAppender.setContext(loggerContext);
        rfAppender.setFile(filePath.toAbsolutePath().toString());
        TimeBasedRollingPolicy rollingPolicy = new TimeBasedRollingPolicy<>();
        rollingPolicy.setFileNamePattern(config.getRollingFileNamePatern());
        rollingPolicy.setMaxHistory(config.getRollingMaxHistory());
        rollingPolicy.setContext(loggerContext);
        rollingPolicy.setParent(rfAppender);
        rollingPolicy.start();

        SizeBasedTriggeringPolicy triggeringPolicy = new ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy();
        triggeringPolicy.setMaxFileSize(config.getTriggerMaxFileSize());
        triggeringPolicy.start();

        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern(config.getEncoderPattern());
        encoder.start();

        rfAppender.setEncoder(encoder);
        rfAppender.setRollingPolicy(rollingPolicy);
        rfAppender.setTriggeringPolicy(triggeringPolicy);
        rfAppender.start();

        logger = loggerContext.getLogger(appenderDto.getTenantId() + "." + appenderDto.getApplicationToken());
        logger.setLevel(Level.ALL);
        logger.addAppender(rfAppender);
        LOG.debug("[{}][{}][{}] Initialized with context {}", appenderDto.getTenantId(),
                appenderDto.getApplicationId(), appenderDto.getSchemaVersion(), loggerContext);
    }

    @Override
    public void append(String event) {
        logger.info(event);
    }
}
