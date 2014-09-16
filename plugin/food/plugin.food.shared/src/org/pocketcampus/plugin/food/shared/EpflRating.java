/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.food.shared;

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

public class EpflRating implements org.apache.thrift.TBase<EpflRating, EpflRating._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EpflRating");

  private static final org.apache.thrift.protocol.TField RATING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("ratingValue", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField VOTE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("voteCount", org.apache.thrift.protocol.TType.I32, (short)2);

  private double ratingValue; // required
  private int voteCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RATING_VALUE((short)1, "ratingValue"),
    VOTE_COUNT((short)2, "voteCount");

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
        case 1: // RATING_VALUE
          return RATING_VALUE;
        case 2: // VOTE_COUNT
          return VOTE_COUNT;
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
  private static final int __RATINGVALUE_ISSET_ID = 0;
  private static final int __VOTECOUNT_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RATING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("ratingValue", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.VOTE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("voteCount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EpflRating.class, metaDataMap);
  }

  public EpflRating() {
  }

  public EpflRating(
    double ratingValue,
    int voteCount)
  {
    this();
    this.ratingValue = ratingValue;
    setRatingValueIsSet(true);
    this.voteCount = voteCount;
    setVoteCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EpflRating(EpflRating other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.ratingValue = other.ratingValue;
    this.voteCount = other.voteCount;
  }

  public EpflRating deepCopy() {
    return new EpflRating(this);
  }

  @Override
  public void clear() {
    setRatingValueIsSet(false);
    this.ratingValue = 0.0;
    setVoteCountIsSet(false);
    this.voteCount = 0;
  }

  public double getRatingValue() {
    return this.ratingValue;
  }

  public EpflRating setRatingValue(double ratingValue) {
    this.ratingValue = ratingValue;
    setRatingValueIsSet(true);
    return this;
  }

  public void unsetRatingValue() {
    __isset_bit_vector.clear(__RATINGVALUE_ISSET_ID);
  }

  /** Returns true if field ratingValue is set (has been assigned a value) and false otherwise */
  public boolean isSetRatingValue() {
    return __isset_bit_vector.get(__RATINGVALUE_ISSET_ID);
  }

  public void setRatingValueIsSet(boolean value) {
    __isset_bit_vector.set(__RATINGVALUE_ISSET_ID, value);
  }

  public int getVoteCount() {
    return this.voteCount;
  }

  public EpflRating setVoteCount(int voteCount) {
    this.voteCount = voteCount;
    setVoteCountIsSet(true);
    return this;
  }

  public void unsetVoteCount() {
    __isset_bit_vector.clear(__VOTECOUNT_ISSET_ID);
  }

  /** Returns true if field voteCount is set (has been assigned a value) and false otherwise */
  public boolean isSetVoteCount() {
    return __isset_bit_vector.get(__VOTECOUNT_ISSET_ID);
  }

  public void setVoteCountIsSet(boolean value) {
    __isset_bit_vector.set(__VOTECOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RATING_VALUE:
      if (value == null) {
        unsetRatingValue();
      } else {
        setRatingValue((Double)value);
      }
      break;

    case VOTE_COUNT:
      if (value == null) {
        unsetVoteCount();
      } else {
        setVoteCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RATING_VALUE:
      return Double.valueOf(getRatingValue());

    case VOTE_COUNT:
      return Integer.valueOf(getVoteCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RATING_VALUE:
      return isSetRatingValue();
    case VOTE_COUNT:
      return isSetVoteCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EpflRating)
      return this.equals((EpflRating)that);
    return false;
  }

  public boolean equals(EpflRating that) {
    if (that == null)
      return false;

    boolean this_present_ratingValue = true;
    boolean that_present_ratingValue = true;
    if (this_present_ratingValue || that_present_ratingValue) {
      if (!(this_present_ratingValue && that_present_ratingValue))
        return false;
      if (this.ratingValue != that.ratingValue)
        return false;
    }

    boolean this_present_voteCount = true;
    boolean that_present_voteCount = true;
    if (this_present_voteCount || that_present_voteCount) {
      if (!(this_present_voteCount && that_present_voteCount))
        return false;
      if (this.voteCount != that.voteCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_ratingValue = true;
    builder.append(present_ratingValue);
    if (present_ratingValue)
      builder.append(ratingValue);

    boolean present_voteCount = true;
    builder.append(present_voteCount);
    if (present_voteCount)
      builder.append(voteCount);

    return builder.toHashCode();
  }

  public int compareTo(EpflRating other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    EpflRating typedOther = (EpflRating)other;

    lastComparison = Boolean.valueOf(isSetRatingValue()).compareTo(typedOther.isSetRatingValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRatingValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ratingValue, typedOther.ratingValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVoteCount()).compareTo(typedOther.isSetVoteCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVoteCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.voteCount, typedOther.voteCount);
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
        case 1: // RATING_VALUE
          if (field.type == org.apache.thrift.protocol.TType.DOUBLE) {
            this.ratingValue = iprot.readDouble();
            setRatingValueIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VOTE_COUNT
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.voteCount = iprot.readI32();
            setVoteCountIsSet(true);
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
    if (!isSetRatingValue()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ratingValue' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetVoteCount()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'voteCount' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(RATING_VALUE_FIELD_DESC);
    oprot.writeDouble(this.ratingValue);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(VOTE_COUNT_FIELD_DESC);
    oprot.writeI32(this.voteCount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EpflRating(");
    boolean first = true;

    sb.append("ratingValue:");
    sb.append(this.ratingValue);
    first = false;
    if (!first) sb.append(", ");
    sb.append("voteCount:");
    sb.append(this.voteCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'ratingValue' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'voteCount' because it's a primitive and you chose the non-beans generator.
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

