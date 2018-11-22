package com.ssm.bdqn.entity;

/**
 * 用户表
 */
public class User {

  private Integer id;
  private String userCode;   //用户名
  private String password;   //用户密码
  private String userName;       //姓名
  private Integer sex;       //性别
  private Integer classesId;  //班级id
  private Integer type;       //类型，教师还是学生
  private String phone;       //电话
  private String email;       //邮箱
  private String address;     //地址
  private String token;       //token令牌
  private Classes classes;    //班级类


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public Integer getClassesId() {
    return classesId;
  }

  public void setClassesId(Integer classesId) {
    this.classesId = classesId;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Classes getClasses() {
    return classes;
  }

  public void setClasses(Classes classes) {
    this.classes = classes;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
