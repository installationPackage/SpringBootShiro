package com.ssm.bdqn.entity;

/**
 * 题目类型表
 */
public class AnswerType {

  private Integer id;          //题目类型id
  private String typeName;     //题目类型名称


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

}
