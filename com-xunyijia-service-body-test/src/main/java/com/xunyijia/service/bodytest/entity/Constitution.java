package com.xunyijia.service.bodytest.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName: Constitution.java
 * @Description: 体质报告实体类
 * @Author: 陈建业
 * @Date: 2017-06-28 21:19
 * @Modified By: Tony
 */
@Document(collection = "constitutions")
public class Constitution {

  @Id
  @Field("_id")
  private String id;
  @Field
  private String title;
  @Field
  private String type;
  @Field("student")
  private String studentId;
  @Field("class")
  private String classId;
  @Field("school")
  private String schoolId;
  @Field
  private Date time;
  @Field
  private int age;
  @Field
  private String createBy;
  @Field
  private Map<String, Object> data;
  @Field
  private Date createAt;
  @Field("_v")
  private String version;
  @Field
  private String schoolYear;
  @Field
  private String count;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public String getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(String schoolId) {
    this.schoolId = schoolId;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(String schoolYear) {
    this.schoolYear = schoolYear;
  }

  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "Constitution{"
        + "id='" + id + '\''
        + ", title='" + title + '\''
        + ", type='" + type + '\''
        + ", studentId='" + studentId + '\''
        + ", classId='" + classId + '\''
        + ", schoolId='" + schoolId + '\''
        + ", time=" + time
        + ", age=" + age
        + ", createBy='" + createBy + '\''
        + ", data=" + data
        + ", createAt=" + createAt
        + ", version='" + version + '\''
        + ", schoolYear='" + schoolYear + '\''
        + ", count='" + count + '\''
        + '}';
  }
}
