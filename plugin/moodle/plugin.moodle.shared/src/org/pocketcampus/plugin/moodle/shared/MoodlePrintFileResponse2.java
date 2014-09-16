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

public class MoodlePrintFileResponse2 implements org.apache.thrift.TBase<MoodlePrintFileResponse2, MoodlePrintFileResponse2._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MoodlePrintFileResponse2");

  private static final org.apache.thrift.protocol.TField STATUS_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PRINT_JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("printJobId", org.apache.thrift.protocol.TType.I64, (short)2);

  private MoodleStatusCode2 statusCode; // required
  private long printJobId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see MoodleStatusCode2
     */
    STATUS_CODE((short)1, "statusCode"),
    PRINT_JOB_ID((short)2, "printJobId");

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
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // PRINT_JOB_ID
          return PRINT_JOB_ID;
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
  private static final int __PRINTJOBID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS_CODE, new org.apache.thrift.meta_data.FieldMetaData("statusCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MoodleStatusCode2.class)));
    tmpMap.put(_Fields.PRINT_JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("printJobId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MoodlePrintFileResponse2.class, metaDataMap);
  }

  public MoodlePrintFileResponse2() {
  }

  public MoodlePrintFileResponse2(
    MoodleStatusCode2 statusCode)
  {
    this();
    this.statusCode = statusCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoodlePrintFileResponse2(MoodlePrintFileResponse2 other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetStatusCode()) {
      this.statusCode = other.statusCode;
    }
    this.printJobId = other.printJobId;
  }

  public MoodlePrintFileResponse2 deepCopy() {
    return new MoodlePrintFileResponse2(this);
  }

  @Override
  public void clear() {
    this.statusCode = null;
    setPrintJobIdIsSet(false);
    this.printJobId = 0;
  }

  /**
   * 
   * @see MoodleStatusCode2
   */
  public MoodleStatusCode2 getStatusCode() {
    return this.statusCode;
  }

  /**
   * 
   * @see MoodleStatusCode2
   */
  public MoodlePrintFileResponse2 setStatusCode(MoodleStatusCode2 statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public void unsetStatusCode() {
    this.statusCode = null;
  }

  /** Returns true if field statusCode is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusCode() {
    return this.statusCode != null;
  }

  public void setStatusCodeIsSet(boolean value) {
    if (!value) {
      this.statusCode = null;
    }
  }

  public long getPrintJobId() {
    return this.printJobId;
  }

  public MoodlePrintFileResponse2 setPrintJobId(long printJobId) {
    this.printJobId = printJobId;
    setPrintJobIdIsSet(true);
    return this;
  }

  public void unsetPrintJobId() {
    __isset_bit_vector.clear(__PRINTJOBID_ISSET_ID);
  }

  /** Returns true if field printJobId is set (has been assigned a value) and false otherwise */
  public boolean isSetPrintJobId() {
    return __isset_bit_vector.get(__PRINTJOBID_ISSET_ID);
  }

  public void setPrintJobIdIsSet(boolean value) {
    __isset_bit_vector.set(__PRINTJOBID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        unsetStatusCode();
      } else {
        setStatusCode((MoodleStatusCode2)value);
      }
      break;

    case PRINT_JOB_ID:
      if (value == null) {
        unsetPrintJobId();
      } else {
        setPrintJobId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return getStatusCode();

    case PRINT_JOB_ID:
      return Long.valueOf(getPrintJobId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS_CODE:
      return isSetStatusCode();
    case PRINT_JOB_ID:
      return isSetPrintJobId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MoodlePrintFileResponse2)
      return this.equals((MoodlePrintFileResponse2)that);
    return false;
  }

  public boolean equals(MoodlePrintFileResponse2 that) {
    if (that == null)
      return false;

    boolean this_present_statusCode = true && this.isSetStatusCode();
    boolean that_present_statusCode = true && that.isSetStatusCode();
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (!this.statusCode.equals(that.statusCode))
        return false;
    }

    boolean this_present_printJobId = true && this.isSetPrintJobId();
    boolean that_present_printJobId = true && that.isSetPrintJobId();
    if (this_present_printJobId || that_present_printJobId) {
      if (!(this_present_printJobId && that_present_printJobId))
        return false;
      if (this.printJobId != that.printJobId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_statusCode = true && (isSetStatusCode());
    builder.append(present_statusCode);
    if (present_statusCode)
      builder.append(statusCode.getValue());

    boolean present_printJobId = true && (isSetPrintJobId());
    builder.append(present_printJobId);
    if (present_printJobId)
      builder.append(printJobId);

    return builder.toHashCode();
  }

  public int compareTo(MoodlePrintFileResponse2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MoodlePrintFileResponse2 typedOther = (MoodlePrintFileResponse2)other;

    lastComparison = Boolean.valueOf(isSetStatusCode()).compareTo(typedOther.isSetStatusCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusCode, typedOther.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrintJobId()).compareTo(typedOther.isSetPrintJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrintJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.printJobId, typedOther.printJobId);
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
        case 1: // STATUS_CODE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.statusCode = MoodleStatusCode2.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PRINT_JOB_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.printJobId = iprot.readI64();
            setPrintJobIdIsSet(true);
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
    if (this.statusCode != null) {
      oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
      oprot.writeI32(this.statusCode.getValue());
      oprot.writeFieldEnd();
    }
    if (isSetPrintJobId()) {
      oprot.writeFieldBegin(PRINT_JOB_ID_FIELD_DESC);
      oprot.writeI64(this.printJobId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MoodlePrintFileResponse2(");
    boolean first = true;

    sb.append("statusCode:");
    if (this.statusCode == null) {
      sb.append("null");
    } else {
      sb.append(this.statusCode);
    }
    first = false;
    if (isSetPrintJobId()) {
      if (!first) sb.append(", ");
      sb.append("printJobId:");
      sb.append(this.printJobId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (statusCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statusCode' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
