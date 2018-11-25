package com.ssm.bdqn.entity;

/**
 * 课程表
 */
public class Course {

    private Integer id;              //课程id
    private String courseName;   //课程名称


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}