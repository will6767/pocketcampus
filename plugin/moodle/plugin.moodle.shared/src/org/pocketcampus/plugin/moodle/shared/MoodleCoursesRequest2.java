/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.moodle.shared;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoodleCoursesRequest2 implements org.apache.thrift.TBase<MoodleCoursesRequest2, MoodleCoursesRequest2._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MoodleCoursesRequest2");

  private static final org.apache.thrift.protocol.TField LANGUAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("language", org.apache.thrift.protocol.TType.STRING, (short)1);

  private String language; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LANGUAGE((short)1, "language");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LANGUAGE
          return LANGUAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LANGUAGE, new org.apache.thrift.meta_data.FieldMetaData("language", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MoodleCoursesRequest2.class, metaDataMap);
  }

  public MoodleCoursesRequest2() {
  }

  public MoodleCoursesRequest2(
    String language)
  {
    this();
    this.language = language;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoodleCoursesRequest2(MoodleCoursesRequest2 other) {
    if (other.isSetLanguage()) {
      this.language = other.language;
    }
  }

  public MoodleCoursesRequest2 deepCopy() {
    return new MoodleCoursesRequest2(this);
  }

  @Override
  public void clear() {
    this.language = null;
  }

  public String getLanguage() {
    return this.language;
  }

  public MoodleCoursesRequest2 setLanguage(String language) {
    this.language = language;
    return this;
  }

  public void unsetLanguage() {
    this.language = null;
  }

  /** Returns true if field language is set (has been assigned a value) and false otherwise */
  public boolean isSetLanguage() {
    return this.language != null;
  }

  public void setLanguageIsSet(boolean value) {
    if (!value) {
      this.language = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LANGUAGE:
      if (value == null) {
        unsetLanguage();
      } else {
        setLanguage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LANGUAGE:
      return getLanguage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LANGUAGE:
      return isSetLanguage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MoodleCoursesRequest2)
      return this.equals((MoodleCoursesRequest2)that);
    return false;
  }

  public boolean equals(MoodleCoursesRequest2 that) {
    if (that == null)
      return false;

    boolean this_present_language = true && this.isSetLanguage();
    boolean that_present_language = true && that.isSetLanguage();
    if (this_present_language || that_present_language) {
      if (!(this_present_language && that_present_language))
        return false;
      if (!this.language.equals(that.language))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_language = true && (isSetLanguage());
    builder.append(present_language);
    if (present_language)
      builder.append(language);

    return builder.toHashCode();
  }

  public int compareTo(MoodleCoursesRequest2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MoodleCoursesRequest2 typedOther = (MoodleCoursesRequest2)other;

    lastComparison = Boolean.valueOf(isSetLanguage()).compareTo(typedOther.isSetLanguage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLanguage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.language, typedOther.language);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // LANGUAGE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.language = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.language != null) {
      oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
      oprot.writeString(this.language);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MoodleCoursesRequest2(");
    boolean first = true;

    sb.append("language:");
    if (this.language == null) {
      sb.append("null");
    } else {
      sb.append(this.language);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (language == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'language' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

