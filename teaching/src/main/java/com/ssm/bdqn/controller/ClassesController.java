package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.entity.Classes;
import com.ssm.bdqn.service.ClassesService;
import com.ssm.bdqn.standard.Resp;
import com.ssm.bdqn.standard.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping(value = "classes")
@RestController
public class ClassesController {
    @Resource(name = "classesService")
    private ClassesService classesService;
    //查询班级
    @RequestMapping(value = "/getClasses",method = RequestMethod.GET)
    public String queryClasses(Classes classes){
        Resp<Object> resp = new Resp<Object>();

                  resp.setData(classesService.queryClasses(classes));

        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
    //增加班级
    @RequestMapping(value = "/addClasses")
    public String addClasses(Classes classes){
        Resp<Object> resp = new Resp<Object>();

               if(classesService.addClasses(classes)>0){
                   resp.getStatus();
               }

        return JSON.toJSONString(resp);
    }
    //删除班级
    @RequestMapping(value = "/deleteClasses")
    public String deleteClasses(Classes classes){
        Resp<Object> resp = new Resp<Object>();

               if(classesService.deleteClasses(classes)>0){
                   resp.getStatus();
               }

        return JSON.toJSONString(resp);
    }
    //修改班级
    @RequestMapping("/updateClasses")
    public String updateClasses(Classes classes){
        Resp<Object> resp = new Resp<Object>();

                if(classesService.updateClasses(classes)>0){
                    resp.getStatus();
                }

        return JSON.toJSONString(resp);
    }

}
