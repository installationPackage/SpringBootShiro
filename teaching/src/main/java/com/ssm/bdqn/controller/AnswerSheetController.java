package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.entity.AnswerSheet;
import com.ssm.bdqn.entity.Pager;
import com.ssm.bdqn.service.AnswerSheetService;
import com.ssm.bdqn.standard.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RequestMapping(value = "answerSheet")
@RestController
public class AnswerSheetController {
    @Resource(name = "answerSheetService")
    private AnswerSheetService answerSheetService;

    //查询答题卡
    @RequestMapping(value = "/getAnswerSheet",method = RequestMethod.GET)
    public String queryAnswerSheet(AnswerSheet answerSheet,
                                   @RequestParam(required = false,defaultValue = "1")int pageNo,
                                   @RequestParam(required = false,defaultValue = "5")int pageSize){
        Resp<Object> resp = new Resp<Object>();
        Pager<AnswerSheet> pager = answerSheetService.queryAnswerSheet(answerSheet, pageNo, pageSize);
        resp.setData(pager.getData());
        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
    //添加答题卡
    @RequestMapping(value = "/addAnswerSheet")
    public String addAnswerSheet(AnswerSheet answerSheet){
        Resp<Object> resp = new Resp<Object>();
        answerSheet.setReplyDate(new Date());
        if(answerSheetService.addAnswerSheet(answerSheet)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //修改答题卡
    @RequestMapping(value = "/updateAnswerSheet")
    public String updateAnswerSheet(AnswerSheet answerSheet){
        Resp<Object> resp = new Resp<Object>();
        answerSheet.setStateDate(new Date());
        if(answerSheetService.updateAnswerSheet(answerSheet)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }

}
