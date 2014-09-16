/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.isacademia.shared;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum StudyPeriodType implements org.apache.thrift.TEnum {
  LECTURE(0),
  EXERCISES(1),
  LAB(2),
  PROJECT(3),
  ORAL_EXAM(4),
  WRITTEN_EXAM(5);

  private final int value;

  private StudyPeriodType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StudyPeriodType findByValue(int value) { 
    switch (value) {
      case 0:
        return LECTURE;
      case 1:
        return EXERCISES;
      case 2:
        return LAB;
      case 3:
        return PROJECT;
      case 4:
        return ORAL_EXAM;
      case 5:
        return WRITTEN_EXAM;
      default:
        return null;
    }
  }
}