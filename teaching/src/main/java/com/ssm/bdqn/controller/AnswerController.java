package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.entity.Answer;
import com.ssm.bdqn.service.AnswerService;
import com.ssm.bdqn.standard.Resp;
import com.ssm.bdqn.standard.ResponseData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RequestMapping(value = "answer")
@RestController
public class AnswerController {
    @Resource(name = "answerService")
    private AnswerService answerService;
    /**
     * 增加题目
     */
    @RequestMapping(value = "/addAnswer")
    public String addAnswer(Answer answer) {
        Resp<Object> resp = new Resp<Object>();
        if(answerService.addAnswer(answer)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    /**
     * 查询题目
     * @param answer
     * @return
     */
    @RequestMapping(value = "/getAnswer",method = RequestMethod.GET)
    public String queryAnswer(Answer answer) {
        Resp<Object> resp = new Resp<Object>();
        resp.setData(answerService.queryAnswer(answer));
        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
    /**
     * 删除题目
     */
    @RequestMapping(value = "/deleteAnswer")
    public String deleteAnswer(Answer answer) {
        Resp<Object> resp = new Resp<Object>();
        if(answerService.deleteAnswer(answer)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
}
