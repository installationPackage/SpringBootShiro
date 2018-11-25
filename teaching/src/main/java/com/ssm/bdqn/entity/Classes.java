package com.ssm.bdqn.entity;

/**
 * 班级表
 */

public class Classes {

    private Integer id;            //班级id
    private String classesName; //班级姓名


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }
}
