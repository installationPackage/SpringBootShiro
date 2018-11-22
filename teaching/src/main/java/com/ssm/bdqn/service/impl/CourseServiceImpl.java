package com.ssm.bdqn.service.impl;


import com.ssm.bdqn.dao.CourseDao;
import com.ssm.bdqn.entity.Course;
import com.ssm.bdqn.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;
    //查询课程类型
    public List<Course> queryCourse(Course course) {
        List<Course> list = courseDao.queryCourse(course);
        return list;
    }
    //增加课程类型
    public int addCourse(Course course) {

        int count = courseDao.addCourse(course);

        return count;
    }
    //删除课程类型
    public int deleteCourse(Course course) {

        int count = courseDao.deleteCourse(course);

        return count;
    }
    //修改课程类型
    public int updateCourse(Course course) {

        int count = courseDao.updateCourse(course);

        return count;
    }
}
