package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.Course;

import java.util.List;

public interface CourseDao {
    //查询课程类型
    List<Course> queryCourse(Course course);
    //增加课程类型
    int addCourse(Course course);
    //删除课程类型
    int deleteCourse(Course course);
    //修改课程类型
    int updateCourse(Course course);
}
