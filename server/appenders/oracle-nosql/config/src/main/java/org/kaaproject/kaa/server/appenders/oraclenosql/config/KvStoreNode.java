/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.oraclenosql.config;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class KvStoreNode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KvStoreNode\",\"namespace\":\"org.kaaproject.kaa.server.appenders.oraclenosql.config\",\"fields\":[{\"name\":\"host\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"localhost\",\"displayName\":\"Host\",\"weight\":0.75},{\"name\":\"port\",\"type\":\"int\",\"default\":5000,\"displayName\":\"Port\",\"weight\":0.25}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String host;
   private int port;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public KvStoreNode() {}

  /**
   * All-args constructor.
   */
  public KvStoreNode(java.lang.String host, java.lang.Integer port) {
    this.host = host;
    this.port = port;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return host;
    case 1: return port;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: host = (java.lang.String)value$; break;
    case 1: port = (java.lang.Integer)value$; break;
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

  /** Creates a new KvStoreNode RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder();
  }
  
  /** Creates a new KvStoreNode RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder newBuilder(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder other) {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder(other);
  }
  
  /** Creates a new KvStoreNode RecordBuilder by copying an existing KvStoreNode instance */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder newBuilder(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode other) {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder(other);
  }
  
  /**
   * RecordBuilder for KvStoreNode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KvStoreNode>
    implements org.apache.avro.data.RecordBuilder<KvStoreNode> {

    private java.lang.String host;
    private int port;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing KvStoreNode instance */
    private Builder(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode other) {
            super(org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.SCHEMA$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'host' field */
    public java.lang.String getHost() {
      return host;
    }
    
    /** Sets the value of the 'host' field */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder setHost(java.lang.String value) {
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
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'port' field */
    public java.lang.Integer getPort() {
      return port;
    }
    
    /** Sets the value of the 'port' field */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder setPort(int value) {
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
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.KvStoreNode.Builder clearPort() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public KvStoreNode build() {
      try {
        KvStoreNode record = new KvStoreNode();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.String) defaultValue(fields()[0]);
        record.port = fieldSetFlags()[1] ? this.port : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
