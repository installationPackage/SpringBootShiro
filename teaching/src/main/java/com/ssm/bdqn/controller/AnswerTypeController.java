package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.entity.AnswerType;
import com.ssm.bdqn.service.AnswerTypeService;
import com.ssm.bdqn.standard.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 题目类型
 */
@RequestMapping(value = "answerType")
@RestController
public class AnswerTypeController {
    @Resource(name = "answerTypeService")
    private AnswerTypeService answerTypeService;
    //添加题目类型
    @RequestMapping(value = "/addAnswerType")
    public String addAnswerType(AnswerType answerType){
        Resp<Object> resp = new Resp<Object>();
        if(answerTypeService.addAnswerType(answerType)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //删除题目类型
    @RequestMapping(value = "/deleteAnswerType")
    public String deleteAnswerType(AnswerType answerType){
        Resp<Object> resp = new Resp<Object>();
        if(answerTypeService.deleteAnswerType(answerType)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //修改题目类型
    @RequestMapping(value = "/updateAnswerType")
    public String updateAnswerType(AnswerType answerType){
        Resp<Object> resp = new Resp<Object>();
        if(answerTypeService.updateAnswerType(answerType)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //查询题目类型
    @RequestMapping(value = "/getAnswerType",method = RequestMethod.GET)
    public String queryAnswerType(AnswerType answerType){
        Resp<Object> resp = new Resp<Object>();
        resp.setData(answerTypeService.queryAnswerType(answerType));
        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
}
