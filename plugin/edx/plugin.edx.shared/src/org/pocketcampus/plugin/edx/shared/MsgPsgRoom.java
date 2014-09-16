/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.edx.shared;

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

public class MsgPsgRoom implements org.apache.thrift.TBase<MsgPsgRoom, MsgPsgRoom._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MsgPsgRoom");

  private static final org.apache.thrift.protocol.TField ROOM_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("roomRef", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OCCUPANCY_FIELD_DESC = new org.apache.thrift.protocol.TField("occupancy", org.apache.thrift.protocol.TType.I32, (short)2);

  private String roomRef; // required
  private int occupancy; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROOM_REF((short)1, "roomRef"),
    OCCUPANCY((short)2, "occupancy");

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
        case 1: // ROOM_REF
          return ROOM_REF;
        case 2: // OCCUPANCY
          return OCCUPANCY;
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
  private static final int __OCCUPANCY_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROOM_REF, new org.apache.thrift.meta_data.FieldMetaData("roomRef", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OCCUPANCY, new org.apache.thrift.meta_data.FieldMetaData("occupancy", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MsgPsgRoom.class, metaDataMap);
  }

  public MsgPsgRoom() {
  }

  public MsgPsgRoom(
    String roomRef,
    int occupancy)
  {
    this();
    this.roomRef = roomRef;
    this.occupancy = occupancy;
    setOccupancyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MsgPsgRoom(MsgPsgRoom other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetRoomRef()) {
      this.roomRef = other.roomRef;
    }
    this.occupancy = other.occupancy;
  }

  public MsgPsgRoom deepCopy() {
    return new MsgPsgRoom(this);
  }

  @Override
  public void clear() {
    this.roomRef = null;
    setOccupancyIsSet(false);
    this.occupancy = 0;
  }

  public String getRoomRef() {
    return this.roomRef;
  }

  public MsgPsgRoom setRoomRef(String roomRef) {
    this.roomRef = roomRef;
    return this;
  }

  public void unsetRoomRef() {
    this.roomRef = null;
  }

  /** Returns true if field roomRef is set (has been assigned a value) and false otherwise */
  public boolean isSetRoomRef() {
    return this.roomRef != null;
  }

  public void setRoomRefIsSet(boolean value) {
    if (!value) {
      this.roomRef = null;
    }
  }

  public int getOccupancy() {
    return this.occupancy;
  }

  public MsgPsgRoom setOccupancy(int occupancy) {
    this.occupancy = occupancy;
    setOccupancyIsSet(true);
    return this;
  }

  public void unsetOccupancy() {
    __isset_bit_vector.clear(__OCCUPANCY_ISSET_ID);
  }

  /** Returns true if field occupancy is set (has been assigned a value) and false otherwise */
  public boolean isSetOccupancy() {
    return __isset_bit_vector.get(__OCCUPANCY_ISSET_ID);
  }

  public void setOccupancyIsSet(boolean value) {
    __isset_bit_vector.set(__OCCUPANCY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROOM_REF:
      if (value == null) {
        unsetRoomRef();
      } else {
        setRoomRef((String)value);
      }
      break;

    case OCCUPANCY:
      if (value == null) {
        unsetOccupancy();
      } else {
        setOccupancy((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROOM_REF:
      return getRoomRef();

    case OCCUPANCY:
      return Integer.valueOf(getOccupancy());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROOM_REF:
      return isSetRoomRef();
    case OCCUPANCY:
      return isSetOccupancy();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MsgPsgRoom)
      return this.equals((MsgPsgRoom)that);
    return false;
  }

  public boolean equals(MsgPsgRoom that) {
    if (that == null)
      return false;

    boolean this_present_roomRef = true && this.isSetRoomRef();
    boolean that_present_roomRef = true && that.isSetRoomRef();
    if (this_present_roomRef || that_present_roomRef) {
      if (!(this_present_roomRef && that_present_roomRef))
        return false;
      if (!this.roomRef.equals(that.roomRef))
        return false;
    }

    boolean this_present_occupancy = true;
    boolean that_present_occupancy = true;
    if (this_present_occupancy || that_present_occupancy) {
      if (!(this_present_occupancy && that_present_occupancy))
        return false;
      if (this.occupancy != that.occupancy)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_roomRef = true && (isSetRoomRef());
    builder.append(present_roomRef);
    if (present_roomRef)
      builder.append(roomRef);

    boolean present_occupancy = true;
    builder.append(present_occupancy);
    if (present_occupancy)
      builder.append(occupancy);

    return builder.toHashCode();
  }

  public int compareTo(MsgPsgRoom other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MsgPsgRoom typedOther = (MsgPsgRoom)other;

    lastComparison = Boolean.valueOf(isSetRoomRef()).compareTo(typedOther.isSetRoomRef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoomRef()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roomRef, typedOther.roomRef);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOccupancy()).compareTo(typedOther.isSetOccupancy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOccupancy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.occupancy, typedOther.occupancy);
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
        case 1: // ROOM_REF
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.roomRef = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // OCCUPANCY
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.occupancy = iprot.readI32();
            setOccupancyIsSet(true);
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
    if (!isSetOccupancy()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'occupancy' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.roomRef != null) {
      oprot.writeFieldBegin(ROOM_REF_FIELD_DESC);
      oprot.writeString(this.roomRef);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(OCCUPANCY_FIELD_DESC);
    oprot.writeI32(this.occupancy);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MsgPsgRoom(");
    boolean first = true;

    sb.append("roomRef:");
    if (this.roomRef == null) {
      sb.append("null");
    } else {
      sb.append(this.roomRef);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("occupancy:");
    sb.append(this.occupancy);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (roomRef == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'roomRef' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'occupancy' because it's a primitive and you chose the non-beans generator.
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

