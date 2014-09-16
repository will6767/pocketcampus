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

public class MsgPsgSendBroadcastReq implements org.apache.thrift.TBase<MsgPsgSendBroadcastReq, MsgPsgSendBroadcastReq._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MsgPsgSendBroadcastReq");

  private static final org.apache.thrift.protocol.TField SENDER_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("senderRef", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ROOM_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("roomRef", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("messageHeader", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("messageType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TEXT_BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("textBody", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField BINARY_BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("binaryBody", org.apache.thrift.protocol.TType.STRING, (short)6);

  private String senderRef; // required
  private String roomRef; // required
  private String messageHeader; // required
  private MsgPsgMessageType messageType; // required
  private String textBody; // required
  private ByteBuffer binaryBody; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SENDER_REF((short)1, "senderRef"),
    ROOM_REF((short)2, "roomRef"),
    MESSAGE_HEADER((short)3, "messageHeader"),
    /**
     * 
     * @see MsgPsgMessageType
     */
    MESSAGE_TYPE((short)4, "messageType"),
    TEXT_BODY((short)5, "textBody"),
    BINARY_BODY((short)6, "binaryBody");

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
        case 1: // SENDER_REF
          return SENDER_REF;
        case 2: // ROOM_REF
          return ROOM_REF;
        case 3: // MESSAGE_HEADER
          return MESSAGE_HEADER;
        case 4: // MESSAGE_TYPE
          return MESSAGE_TYPE;
        case 5: // TEXT_BODY
          return TEXT_BODY;
        case 6: // BINARY_BODY
          return BINARY_BODY;
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
    tmpMap.put(_Fields.SENDER_REF, new org.apache.thrift.meta_data.FieldMetaData("senderRef", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROOM_REF, new org.apache.thrift.meta_data.FieldMetaData("roomRef", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_HEADER, new org.apache.thrift.meta_data.FieldMetaData("messageHeader", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("messageType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MsgPsgMessageType.class)));
    tmpMap.put(_Fields.TEXT_BODY, new org.apache.thrift.meta_data.FieldMetaData("textBody", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BINARY_BODY, new org.apache.thrift.meta_data.FieldMetaData("binaryBody", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MsgPsgSendBroadcastReq.class, metaDataMap);
  }

  public MsgPsgSendBroadcastReq() {
  }

  public MsgPsgSendBroadcastReq(
    String senderRef,
    String roomRef,
    String messageHeader,
    MsgPsgMessageType messageType)
  {
    this();
    this.senderRef = senderRef;
    this.roomRef = roomRef;
    this.messageHeader = messageHeader;
    this.messageType = messageType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MsgPsgSendBroadcastReq(MsgPsgSendBroadcastReq other) {
    if (other.isSetSenderRef()) {
      this.senderRef = other.senderRef;
    }
    if (other.isSetRoomRef()) {
      this.roomRef = other.roomRef;
    }
    if (other.isSetMessageHeader()) {
      this.messageHeader = other.messageHeader;
    }
    if (other.isSetMessageType()) {
      this.messageType = other.messageType;
    }
    if (other.isSetTextBody()) {
      this.textBody = other.textBody;
    }
    if (other.isSetBinaryBody()) {
      this.binaryBody = org.apache.thrift.TBaseHelper.copyBinary(other.binaryBody);
;
    }
  }

  public MsgPsgSendBroadcastReq deepCopy() {
    return new MsgPsgSendBroadcastReq(this);
  }

  @Override
  public void clear() {
    this.senderRef = null;
    this.roomRef = null;
    this.messageHeader = null;
    this.messageType = null;
    this.textBody = null;
    this.binaryBody = null;
  }

  public String getSenderRef() {
    return this.senderRef;
  }

  public MsgPsgSendBroadcastReq setSenderRef(String senderRef) {
    this.senderRef = senderRef;
    return this;
  }

  public void unsetSenderRef() {
    this.senderRef = null;
  }

  /** Returns true if field senderRef is set (has been assigned a value) and false otherwise */
  public boolean isSetSenderRef() {
    return this.senderRef != null;
  }

  public void setSenderRefIsSet(boolean value) {
    if (!value) {
      this.senderRef = null;
    }
  }

  public String getRoomRef() {
    return this.roomRef;
  }

  public MsgPsgSendBroadcastReq setRoomRef(String roomRef) {
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

  public String getMessageHeader() {
    return this.messageHeader;
  }

  public MsgPsgSendBroadcastReq setMessageHeader(String messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  public void unsetMessageHeader() {
    this.messageHeader = null;
  }

  /** Returns true if field messageHeader is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageHeader() {
    return this.messageHeader != null;
  }

  public void setMessageHeaderIsSet(boolean value) {
    if (!value) {
      this.messageHeader = null;
    }
  }

  /**
   * 
   * @see MsgPsgMessageType
   */
  public MsgPsgMessageType getMessageType() {
    return this.messageType;
  }

  /**
   * 
   * @see MsgPsgMessageType
   */
  public MsgPsgSendBroadcastReq setMessageType(MsgPsgMessageType messageType) {
    this.messageType = messageType;
    return this;
  }

  public void unsetMessageType() {
    this.messageType = null;
  }

  /** Returns true if field messageType is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageType() {
    return this.messageType != null;
  }

  public void setMessageTypeIsSet(boolean value) {
    if (!value) {
      this.messageType = null;
    }
  }

  public String getTextBody() {
    return this.textBody;
  }

  public MsgPsgSendBroadcastReq setTextBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

  public void unsetTextBody() {
    this.textBody = null;
  }

  /** Returns true if field textBody is set (has been assigned a value) and false otherwise */
  public boolean isSetTextBody() {
    return this.textBody != null;
  }

  public void setTextBodyIsSet(boolean value) {
    if (!value) {
      this.textBody = null;
    }
  }

  public byte[] getBinaryBody() {
    setBinaryBody(org.apache.thrift.TBaseHelper.rightSize(binaryBody));
    return binaryBody == null ? null : binaryBody.array();
  }

  public ByteBuffer bufferForBinaryBody() {
    return binaryBody;
  }

  public MsgPsgSendBroadcastReq setBinaryBody(byte[] binaryBody) {
    setBinaryBody(binaryBody == null ? (ByteBuffer)null : ByteBuffer.wrap(binaryBody));
    return this;
  }

  public MsgPsgSendBroadcastReq setBinaryBody(ByteBuffer binaryBody) {
    this.binaryBody = binaryBody;
    return this;
  }

  public void unsetBinaryBody() {
    this.binaryBody = null;
  }

  /** Returns true if field binaryBody is set (has been assigned a value) and false otherwise */
  public boolean isSetBinaryBody() {
    return this.binaryBody != null;
  }

  public void setBinaryBodyIsSet(boolean value) {
    if (!value) {
      this.binaryBody = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SENDER_REF:
      if (value == null) {
        unsetSenderRef();
      } else {
        setSenderRef((String)value);
      }
      break;

    case ROOM_REF:
      if (value == null) {
        unsetRoomRef();
      } else {
        setRoomRef((String)value);
      }
      break;

    case MESSAGE_HEADER:
      if (value == null) {
        unsetMessageHeader();
      } else {
        setMessageHeader((String)value);
      }
      break;

    case MESSAGE_TYPE:
      if (value == null) {
        unsetMessageType();
      } else {
        setMessageType((MsgPsgMessageType)value);
      }
      break;

    case TEXT_BODY:
      if (value == null) {
        unsetTextBody();
      } else {
        setTextBody((String)value);
      }
      break;

    case BINARY_BODY:
      if (value == null) {
        unsetBinaryBody();
      } else {
        setBinaryBody((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SENDER_REF:
      return getSenderRef();

    case ROOM_REF:
      return getRoomRef();

    case MESSAGE_HEADER:
      return getMessageHeader();

    case MESSAGE_TYPE:
      return getMessageType();

    case TEXT_BODY:
      return getTextBody();

    case BINARY_BODY:
      return getBinaryBody();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SENDER_REF:
      return isSetSenderRef();
    case ROOM_REF:
      return isSetRoomRef();
    case MESSAGE_HEADER:
      return isSetMessageHeader();
    case MESSAGE_TYPE:
      return isSetMessageType();
    case TEXT_BODY:
      return isSetTextBody();
    case BINARY_BODY:
      return isSetBinaryBody();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MsgPsgSendBroadcastReq)
      return this.equals((MsgPsgSendBroadcastReq)that);
    return false;
  }

  public boolean equals(MsgPsgSendBroadcastReq that) {
    if (that == null)
      return false;

    boolean this_present_senderRef = true && this.isSetSenderRef();
    boolean that_present_senderRef = true && that.isSetSenderRef();
    if (this_present_senderRef || that_present_senderRef) {
      if (!(this_present_senderRef && that_present_senderRef))
        return false;
      if (!this.senderRef.equals(that.senderRef))
        return false;
    }

    boolean this_present_roomRef = true && this.isSetRoomRef();
    boolean that_present_roomRef = true && that.isSetRoomRef();
    if (this_present_roomRef || that_present_roomRef) {
      if (!(this_present_roomRef && that_present_roomRef))
        return false;
      if (!this.roomRef.equals(that.roomRef))
        return false;
    }

    boolean this_present_messageHeader = true && this.isSetMessageHeader();
    boolean that_present_messageHeader = true && that.isSetMessageHeader();
    if (this_present_messageHeader || that_present_messageHeader) {
      if (!(this_present_messageHeader && that_present_messageHeader))
        return false;
      if (!this.messageHeader.equals(that.messageHeader))
        return false;
    }

    boolean this_present_messageType = true && this.isSetMessageType();
    boolean that_present_messageType = true && that.isSetMessageType();
    if (this_present_messageType || that_present_messageType) {
      if (!(this_present_messageType && that_present_messageType))
        return false;
      if (!this.messageType.equals(that.messageType))
        return false;
    }

    boolean this_present_textBody = true && this.isSetTextBody();
    boolean that_present_textBody = true && that.isSetTextBody();
    if (this_present_textBody || that_present_textBody) {
      if (!(this_present_textBody && that_present_textBody))
        return false;
      if (!this.textBody.equals(that.textBody))
        return false;
    }

    boolean this_present_binaryBody = true && this.isSetBinaryBody();
    boolean that_present_binaryBody = true && that.isSetBinaryBody();
    if (this_present_binaryBody || that_present_binaryBody) {
      if (!(this_present_binaryBody && that_present_binaryBody))
        return false;
      if (!this.binaryBody.equals(that.binaryBody))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_senderRef = true && (isSetSenderRef());
    builder.append(present_senderRef);
    if (present_senderRef)
      builder.append(senderRef);

    boolean present_roomRef = true && (isSetRoomRef());
    builder.append(present_roomRef);
    if (present_roomRef)
      builder.append(roomRef);

    boolean present_messageHeader = true && (isSetMessageHeader());
    builder.append(present_messageHeader);
    if (present_messageHeader)
      builder.append(messageHeader);

    boolean present_messageType = true && (isSetMessageType());
    builder.append(present_messageType);
    if (present_messageType)
      builder.append(messageType.getValue());

    boolean present_textBody = true && (isSetTextBody());
    builder.append(present_textBody);
    if (present_textBody)
      builder.append(textBody);

    boolean present_binaryBody = true && (isSetBinaryBody());
    builder.append(present_binaryBody);
    if (present_binaryBody)
      builder.append(binaryBody);

    return builder.toHashCode();
  }

  public int compareTo(MsgPsgSendBroadcastReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MsgPsgSendBroadcastReq typedOther = (MsgPsgSendBroadcastReq)other;

    lastComparison = Boolean.valueOf(isSetSenderRef()).compareTo(typedOther.isSetSenderRef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSenderRef()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.senderRef, typedOther.senderRef);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetMessageHeader()).compareTo(typedOther.isSetMessageHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageHeader, typedOther.messageHeader);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageType()).compareTo(typedOther.isSetMessageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageType, typedOther.messageType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTextBody()).compareTo(typedOther.isSetTextBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textBody, typedOther.textBody);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBinaryBody()).compareTo(typedOther.isSetBinaryBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinaryBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binaryBody, typedOther.binaryBody);
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
        case 1: // SENDER_REF
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.senderRef = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ROOM_REF
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.roomRef = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // MESSAGE_HEADER
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.messageHeader = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MESSAGE_TYPE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.messageType = MsgPsgMessageType.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TEXT_BODY
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.textBody = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // BINARY_BODY
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.binaryBody = iprot.readBinary();
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
    if (this.senderRef != null) {
      oprot.writeFieldBegin(SENDER_REF_FIELD_DESC);
      oprot.writeString(this.senderRef);
      oprot.writeFieldEnd();
    }
    if (this.roomRef != null) {
      oprot.writeFieldBegin(ROOM_REF_FIELD_DESC);
      oprot.writeString(this.roomRef);
      oprot.writeFieldEnd();
    }
    if (this.messageHeader != null) {
      oprot.writeFieldBegin(MESSAGE_HEADER_FIELD_DESC);
      oprot.writeString(this.messageHeader);
      oprot.writeFieldEnd();
    }
    if (this.messageType != null) {
      oprot.writeFieldBegin(MESSAGE_TYPE_FIELD_DESC);
      oprot.writeI32(this.messageType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.textBody != null) {
      if (isSetTextBody()) {
        oprot.writeFieldBegin(TEXT_BODY_FIELD_DESC);
        oprot.writeString(this.textBody);
        oprot.writeFieldEnd();
      }
    }
    if (this.binaryBody != null) {
      if (isSetBinaryBody()) {
        oprot.writeFieldBegin(BINARY_BODY_FIELD_DESC);
        oprot.writeBinary(this.binaryBody);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MsgPsgSendBroadcastReq(");
    boolean first = true;

    sb.append("senderRef:");
    if (this.senderRef == null) {
      sb.append("null");
    } else {
      sb.append(this.senderRef);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roomRef:");
    if (this.roomRef == null) {
      sb.append("null");
    } else {
      sb.append(this.roomRef);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageHeader:");
    if (this.messageHeader == null) {
      sb.append("null");
    } else {
      sb.append(this.messageHeader);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageType:");
    if (this.messageType == null) {
      sb.append("null");
    } else {
      sb.append(this.messageType);
    }
    first = false;
    if (isSetTextBody()) {
      if (!first) sb.append(", ");
      sb.append("textBody:");
      if (this.textBody == null) {
        sb.append("null");
      } else {
        sb.append(this.textBody);
      }
      first = false;
    }
    if (isSetBinaryBody()) {
      if (!first) sb.append(", ");
      sb.append("binaryBody:");
      if (this.binaryBody == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.binaryBody, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (senderRef == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'senderRef' was not present! Struct: " + toString());
    }
    if (roomRef == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'roomRef' was not present! Struct: " + toString());
    }
    if (messageHeader == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageHeader' was not present! Struct: " + toString());
    }
    if (messageType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageType' was not present! Struct: " + toString());
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
