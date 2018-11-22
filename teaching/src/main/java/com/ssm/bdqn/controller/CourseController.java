package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.entity.Course;
import com.ssm.bdqn.service.CourseService;
import com.ssm.bdqn.standard.Resp;
import com.ssm.bdqn.standard.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RequestMapping(value = "course")
@RestController
public class CourseController {
    @Resource(name = "courseService")
    private CourseService courseService;
    //添加课程类型
    @RequestMapping(value = "/addCourse")
    public String addCourse(Course course){
        Resp<Object> resp = new Resp<Object>();
        if(courseService.addCourse(course)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //删除课程类型
    @RequestMapping(value = "/deleteCourse")
    public String deleteCourse(Course course){
        Resp<Object> resp = new Resp<Object>();
        if(courseService.deleteCourse(course)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //修改课程类型
    @RequestMapping(value = "/updateCourse")
    public String updateCourse(Course course,String token){
        Resp<Object> resp = new Resp<Object>();
        if(courseService.updateCourse(course)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //查询课程类型
    @RequestMapping(value = "/getCourse")
    public String queryCourse(Course course){
        Resp<Object> resp = new Resp<Object>();
        resp.setData(courseService.queryCourse(course));
        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
}
