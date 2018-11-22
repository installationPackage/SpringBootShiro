package com.ssm.bdqn.entity;

import java.util.Date;

/**
 * 通知表
 */
public class Notice {

  private Integer id;       //通知id
  private Integer userId;   //通知人id
  private String content;   //通知内容
  private Date contentDate; //通知时间
  private User user;        //用户类


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getContentDate() {
    return contentDate;
  }

  public void setContentDate(Date contentDate) {
    this.contentDate = contentDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
