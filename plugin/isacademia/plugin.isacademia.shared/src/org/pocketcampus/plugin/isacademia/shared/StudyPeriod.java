/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.isacademia.shared;

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

public class StudyPeriod implements org.apache.thrift.TBase<StudyPeriod, StudyPeriod._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StudyPeriod");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PERIOD_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("periodType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ROOMS_FIELD_DESC = new org.apache.thrift.protocol.TField("rooms", org.apache.thrift.protocol.TType.LIST, (short)5);

  private String name; // required
  private StudyPeriodType periodType; // required
  private long startTime; // required
  private long endTime; // required
  private List<String> rooms; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    /**
     * 
     * @see StudyPeriodType
     */
    PERIOD_TYPE((short)2, "periodType"),
    START_TIME((short)3, "startTime"),
    END_TIME((short)4, "endTime"),
    ROOMS((short)5, "rooms");

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
        case 1: // NAME
          return NAME;
        case 2: // PERIOD_TYPE
          return PERIOD_TYPE;
        case 3: // START_TIME
          return START_TIME;
        case 4: // END_TIME
          return END_TIME;
        case 5: // ROOMS
          return ROOMS;
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
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __ENDTIME_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERIOD_TYPE, new org.apache.thrift.meta_data.FieldMetaData("periodType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, StudyPeriodType.class)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "timestamp")));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "timestamp")));
    tmpMap.put(_Fields.ROOMS, new org.apache.thrift.meta_data.FieldMetaData("rooms", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StudyPeriod.class, metaDataMap);
  }

  public StudyPeriod() {
  }

  public StudyPeriod(
    String name,
    StudyPeriodType periodType,
    long startTime,
    long endTime,
    List<String> rooms)
  {
    this();
    this.name = name;
    this.periodType = periodType;
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.rooms = rooms;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StudyPeriod(StudyPeriod other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPeriodType()) {
      this.periodType = other.periodType;
    }
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    if (other.isSetRooms()) {
      List<String> __this__rooms = new ArrayList<String>();
      for (String other_element : other.rooms) {
        __this__rooms.add(other_element);
      }
      this.rooms = __this__rooms;
    }
  }

  public StudyPeriod deepCopy() {
    return new StudyPeriod(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.periodType = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    this.rooms = null;
  }

  public String getName() {
    return this.name;
  }

  public StudyPeriod setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see StudyPeriodType
   */
  public StudyPeriodType getPeriodType() {
    return this.periodType;
  }

  /**
   * 
   * @see StudyPeriodType
   */
  public StudyPeriod setPeriodType(StudyPeriodType periodType) {
    this.periodType = periodType;
    return this;
  }

  public void unsetPeriodType() {
    this.periodType = null;
  }

  /** Returns true if field periodType is set (has been assigned a value) and false otherwise */
  public boolean isSetPeriodType() {
    return this.periodType != null;
  }

  public void setPeriodTypeIsSet(boolean value) {
    if (!value) {
      this.periodType = null;
    }
  }

  public long getStartTime() {
    return this.startTime;
  }

  public StudyPeriod setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bit_vector.clear(__STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return __isset_bit_vector.get(__STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bit_vector.set(__STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public StudyPeriod setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bit_vector.clear(__ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return __isset_bit_vector.get(__ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bit_vector.set(__ENDTIME_ISSET_ID, value);
  }

  public int getRoomsSize() {
    return (this.rooms == null) ? 0 : this.rooms.size();
  }

  public java.util.Iterator<String> getRoomsIterator() {
    return (this.rooms == null) ? null : this.rooms.iterator();
  }

  public void addToRooms(String elem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<String>();
    }
    this.rooms.add(elem);
  }

  public List<String> getRooms() {
    return this.rooms;
  }

  public StudyPeriod setRooms(List<String> rooms) {
    this.rooms = rooms;
    return this;
  }

  public void unsetRooms() {
    this.rooms = null;
  }

  /** Returns true if field rooms is set (has been assigned a value) and false otherwise */
  public boolean isSetRooms() {
    return this.rooms != null;
  }

  public void setRoomsIsSet(boolean value) {
    if (!value) {
      this.rooms = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PERIOD_TYPE:
      if (value == null) {
        unsetPeriodType();
      } else {
        setPeriodType((StudyPeriodType)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Long)value);
      }
      break;

    case ROOMS:
      if (value == null) {
        unsetRooms();
      } else {
        setRooms((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case PERIOD_TYPE:
      return getPeriodType();

    case START_TIME:
      return Long.valueOf(getStartTime());

    case END_TIME:
      return Long.valueOf(getEndTime());

    case ROOMS:
      return getRooms();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case PERIOD_TYPE:
      return isSetPeriodType();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case ROOMS:
      return isSetRooms();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StudyPeriod)
      return this.equals((StudyPeriod)that);
    return false;
  }

  public boolean equals(StudyPeriod that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_periodType = true && this.isSetPeriodType();
    boolean that_present_periodType = true && that.isSetPeriodType();
    if (this_present_periodType || that_present_periodType) {
      if (!(this_present_periodType && that_present_periodType))
        return false;
      if (!this.periodType.equals(that.periodType))
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_rooms = true && this.isSetRooms();
    boolean that_present_rooms = true && that.isSetRooms();
    if (this_present_rooms || that_present_rooms) {
      if (!(this_present_rooms && that_present_rooms))
        return false;
      if (!this.rooms.equals(that.rooms))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_periodType = true && (isSetPeriodType());
    builder.append(present_periodType);
    if (present_periodType)
      builder.append(periodType.getValue());

    boolean present_startTime = true;
    builder.append(present_startTime);
    if (present_startTime)
      builder.append(startTime);

    boolean present_endTime = true;
    builder.append(present_endTime);
    if (present_endTime)
      builder.append(endTime);

    boolean present_rooms = true && (isSetRooms());
    builder.append(present_rooms);
    if (present_rooms)
      builder.append(rooms);

    return builder.toHashCode();
  }

  public int compareTo(StudyPeriod other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StudyPeriod typedOther = (StudyPeriod)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeriodType()).compareTo(typedOther.isSetPeriodType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeriodType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.periodType, typedOther.periodType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(typedOther.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, typedOther.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(typedOther.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, typedOther.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRooms()).compareTo(typedOther.isSetRooms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRooms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rooms, typedOther.rooms);
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
        case 1: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PERIOD_TYPE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.periodType = StudyPeriodType.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // START_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.startTime = iprot.readI64();
            setStartTimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // END_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.endTime = iprot.readI64();
            setEndTimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // ROOMS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.rooms = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2; // required
                _elem2 = iprot.readString();
                this.rooms.add(_elem2);
              }
              iprot.readListEnd();
            }
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
    if (!isSetStartTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'startTime' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetEndTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'endTime' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.periodType != null) {
      oprot.writeFieldBegin(PERIOD_TYPE_FIELD_DESC);
      oprot.writeI32(this.periodType.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.startTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(END_TIME_FIELD_DESC);
    oprot.writeI64(this.endTime);
    oprot.writeFieldEnd();
    if (this.rooms != null) {
      oprot.writeFieldBegin(ROOMS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.rooms.size()));
        for (String _iter3 : this.rooms)
        {
          oprot.writeString(_iter3);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StudyPeriod(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("periodType:");
    if (this.periodType == null) {
      sb.append("null");
    } else {
      sb.append(this.periodType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rooms:");
    if (this.rooms == null) {
      sb.append("null");
    } else {
      sb.append(this.rooms);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (periodType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'periodType' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'startTime' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'endTime' because it's a primitive and you chose the non-beans generator.
    if (rooms == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rooms' was not present! Struct: " + toString());
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
