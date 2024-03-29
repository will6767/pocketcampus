/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.cloudprint.shared;

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

public class CloudPrintMultiPageConfig implements org.apache.thrift.TBase<CloudPrintMultiPageConfig, CloudPrintMultiPageConfig._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CloudPrintMultiPageConfig");

  private static final org.apache.thrift.protocol.TField NB_PAGES_PER_SHEET_FIELD_DESC = new org.apache.thrift.protocol.TField("nbPagesPerSheet", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LAYOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("layout", org.apache.thrift.protocol.TType.I32, (short)2);

  private CloudPrintNbPagesPerSheet nbPagesPerSheet; // required
  private CloudPrintMultiPageLayout layout; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see CloudPrintNbPagesPerSheet
     */
    NB_PAGES_PER_SHEET((short)1, "nbPagesPerSheet"),
    /**
     * 
     * @see CloudPrintMultiPageLayout
     */
    LAYOUT((short)2, "layout");

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
        case 1: // NB_PAGES_PER_SHEET
          return NB_PAGES_PER_SHEET;
        case 2: // LAYOUT
          return LAYOUT;
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
    tmpMap.put(_Fields.NB_PAGES_PER_SHEET, new org.apache.thrift.meta_data.FieldMetaData("nbPagesPerSheet", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CloudPrintNbPagesPerSheet.class)));
    tmpMap.put(_Fields.LAYOUT, new org.apache.thrift.meta_data.FieldMetaData("layout", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CloudPrintMultiPageLayout.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CloudPrintMultiPageConfig.class, metaDataMap);
  }

  public CloudPrintMultiPageConfig() {
  }

  public CloudPrintMultiPageConfig(
    CloudPrintNbPagesPerSheet nbPagesPerSheet,
    CloudPrintMultiPageLayout layout)
  {
    this();
    this.nbPagesPerSheet = nbPagesPerSheet;
    this.layout = layout;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CloudPrintMultiPageConfig(CloudPrintMultiPageConfig other) {
    if (other.isSetNbPagesPerSheet()) {
      this.nbPagesPerSheet = other.nbPagesPerSheet;
    }
    if (other.isSetLayout()) {
      this.layout = other.layout;
    }
  }

  public CloudPrintMultiPageConfig deepCopy() {
    return new CloudPrintMultiPageConfig(this);
  }

  @Override
  public void clear() {
    this.nbPagesPerSheet = null;
    this.layout = null;
  }

  /**
   * 
   * @see CloudPrintNbPagesPerSheet
   */
  public CloudPrintNbPagesPerSheet getNbPagesPerSheet() {
    return this.nbPagesPerSheet;
  }

  /**
   * 
   * @see CloudPrintNbPagesPerSheet
   */
  public CloudPrintMultiPageConfig setNbPagesPerSheet(CloudPrintNbPagesPerSheet nbPagesPerSheet) {
    this.nbPagesPerSheet = nbPagesPerSheet;
    return this;
  }

  public void unsetNbPagesPerSheet() {
    this.nbPagesPerSheet = null;
  }

  /** Returns true if field nbPagesPerSheet is set (has been assigned a value) and false otherwise */
  public boolean isSetNbPagesPerSheet() {
    return this.nbPagesPerSheet != null;
  }

  public void setNbPagesPerSheetIsSet(boolean value) {
    if (!value) {
      this.nbPagesPerSheet = null;
    }
  }

  /**
   * 
   * @see CloudPrintMultiPageLayout
   */
  public CloudPrintMultiPageLayout getLayout() {
    return this.layout;
  }

  /**
   * 
   * @see CloudPrintMultiPageLayout
   */
  public CloudPrintMultiPageConfig setLayout(CloudPrintMultiPageLayout layout) {
    this.layout = layout;
    return this;
  }

  public void unsetLayout() {
    this.layout = null;
  }

  /** Returns true if field layout is set (has been assigned a value) and false otherwise */
  public boolean isSetLayout() {
    return this.layout != null;
  }

  public void setLayoutIsSet(boolean value) {
    if (!value) {
      this.layout = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NB_PAGES_PER_SHEET:
      if (value == null) {
        unsetNbPagesPerSheet();
      } else {
        setNbPagesPerSheet((CloudPrintNbPagesPerSheet)value);
      }
      break;

    case LAYOUT:
      if (value == null) {
        unsetLayout();
      } else {
        setLayout((CloudPrintMultiPageLayout)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NB_PAGES_PER_SHEET:
      return getNbPagesPerSheet();

    case LAYOUT:
      return getLayout();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NB_PAGES_PER_SHEET:
      return isSetNbPagesPerSheet();
    case LAYOUT:
      return isSetLayout();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CloudPrintMultiPageConfig)
      return this.equals((CloudPrintMultiPageConfig)that);
    return false;
  }

  public boolean equals(CloudPrintMultiPageConfig that) {
    if (that == null)
      return false;

    boolean this_present_nbPagesPerSheet = true && this.isSetNbPagesPerSheet();
    boolean that_present_nbPagesPerSheet = true && that.isSetNbPagesPerSheet();
    if (this_present_nbPagesPerSheet || that_present_nbPagesPerSheet) {
      if (!(this_present_nbPagesPerSheet && that_present_nbPagesPerSheet))
        return false;
      if (!this.nbPagesPerSheet.equals(that.nbPagesPerSheet))
        return false;
    }

    boolean this_present_layout = true && this.isSetLayout();
    boolean that_present_layout = true && that.isSetLayout();
    if (this_present_layout || that_present_layout) {
      if (!(this_present_layout && that_present_layout))
        return false;
      if (!this.layout.equals(that.layout))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_nbPagesPerSheet = true && (isSetNbPagesPerSheet());
    builder.append(present_nbPagesPerSheet);
    if (present_nbPagesPerSheet)
      builder.append(nbPagesPerSheet.getValue());

    boolean present_layout = true && (isSetLayout());
    builder.append(present_layout);
    if (present_layout)
      builder.append(layout.getValue());

    return builder.toHashCode();
  }

  public int compareTo(CloudPrintMultiPageConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CloudPrintMultiPageConfig typedOther = (CloudPrintMultiPageConfig)other;

    lastComparison = Boolean.valueOf(isSetNbPagesPerSheet()).compareTo(typedOther.isSetNbPagesPerSheet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNbPagesPerSheet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nbPagesPerSheet, typedOther.nbPagesPerSheet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLayout()).compareTo(typedOther.isSetLayout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLayout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.layout, typedOther.layout);
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
        case 1: // NB_PAGES_PER_SHEET
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.nbPagesPerSheet = CloudPrintNbPagesPerSheet.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // LAYOUT
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.layout = CloudPrintMultiPageLayout.findByValue(iprot.readI32());
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
    if (this.nbPagesPerSheet != null) {
      oprot.writeFieldBegin(NB_PAGES_PER_SHEET_FIELD_DESC);
      oprot.writeI32(this.nbPagesPerSheet.getValue());
      oprot.writeFieldEnd();
    }
    if (this.layout != null) {
      oprot.writeFieldBegin(LAYOUT_FIELD_DESC);
      oprot.writeI32(this.layout.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CloudPrintMultiPageConfig(");
    boolean first = true;

    sb.append("nbPagesPerSheet:");
    if (this.nbPagesPerSheet == null) {
      sb.append("null");
    } else {
      sb.append(this.nbPagesPerSheet);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("layout:");
    if (this.layout == null) {
      sb.append("null");
    } else {
      sb.append(this.layout);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (nbPagesPerSheet == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nbPagesPerSheet' was not present! Struct: " + toString());
    }
    if (layout == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'layout' was not present! Struct: " + toString());
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

