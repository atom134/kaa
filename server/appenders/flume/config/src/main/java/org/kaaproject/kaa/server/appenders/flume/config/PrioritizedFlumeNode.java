/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.flume.config;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PrioritizedFlumeNode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PrioritizedFlumeNode\",\"namespace\":\"org.kaaproject.kaa.server.appenders.flume.config\",\"fields\":[{\"name\":\"host\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"localhost\",\"displayName\":\"Host\",\"weight\":0.8},{\"name\":\"port\",\"type\":\"int\",\"default\":7070,\"displayName\":\"Port\",\"weight\":0.1},{\"name\":\"priority\",\"type\":\"int\",\"default\":1,\"displayName\":\"Priority\",\"weight\":0.1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String host;
   private int port;
   private int priority;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public PrioritizedFlumeNode() {}

  /**
   * All-args constructor.
   */
  public PrioritizedFlumeNode(java.lang.String host, java.lang.Integer port, java.lang.Integer priority) {
    this.host = host;
    this.port = port;
    this.priority = priority;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return host;
    case 1: return port;
    case 2: return priority;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: host = (java.lang.String)value$; break;
    case 1: port = (java.lang.Integer)value$; break;
    case 2: priority = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'host' field.
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Sets the value of the 'host' field.
   * @param value the value to set.
   */
  public void setHost(java.lang.String value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'port' field.
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Sets the value of the 'port' field.
   * @param value the value to set.
   */
  public void setPort(java.lang.Integer value) {
    this.port = value;
  }

  /**
   * Gets the value of the 'priority' field.
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Sets the value of the 'priority' field.
   * @param value the value to set.
   */
  public void setPriority(java.lang.Integer value) {
    this.priority = value;
  }

  /** Creates a new PrioritizedFlumeNode RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder();
  }
  
  /** Creates a new PrioritizedFlumeNode RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder newBuilder(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder other) {
    return new org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder(other);
  }
  
  /** Creates a new PrioritizedFlumeNode RecordBuilder by copying an existing PrioritizedFlumeNode instance */
  public static org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder newBuilder(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode other) {
    return new org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder(other);
  }
  
  /**
   * RecordBuilder for PrioritizedFlumeNode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PrioritizedFlumeNode>
    implements org.apache.avro.data.RecordBuilder<PrioritizedFlumeNode> {

    private java.lang.String host;
    private int port;
    private int priority;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.priority)) {
        this.priority = data().deepCopy(fields()[2].schema(), other.priority);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PrioritizedFlumeNode instance */
    private Builder(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode other) {
            super(org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.SCHEMA$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.priority)) {
        this.priority = data().deepCopy(fields()[2].schema(), other.priority);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'host' field */
    public java.lang.String getHost() {
      return host;
    }
    
    /** Sets the value of the 'host' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder setHost(java.lang.String value) {
      validate(fields()[0], value);
      this.host = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'host' field has been set */
    public boolean hasHost() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'host' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'port' field */
    public java.lang.Integer getPort() {
      return port;
    }
    
    /** Sets the value of the 'port' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder setPort(int value) {
      validate(fields()[1], value);
      this.port = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'port' field has been set */
    public boolean hasPort() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'port' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder clearPort() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'priority' field */
    public java.lang.Integer getPriority() {
      return priority;
    }
    
    /** Sets the value of the 'priority' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder setPriority(int value) {
      validate(fields()[2], value);
      this.priority = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'priority' field has been set */
    public boolean hasPriority() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'priority' field */
    public org.kaaproject.kaa.server.appenders.flume.config.PrioritizedFlumeNode.Builder clearPriority() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PrioritizedFlumeNode build() {
      try {
        PrioritizedFlumeNode record = new PrioritizedFlumeNode();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.String) defaultValue(fields()[0]);
        record.port = fieldSetFlags()[1] ? this.port : (java.lang.Integer) defaultValue(fields()[1]);
        record.priority = fieldSetFlags()[2] ? this.priority : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
