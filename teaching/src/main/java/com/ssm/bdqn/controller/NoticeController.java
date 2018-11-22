package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.entity.Notice;
import com.ssm.bdqn.service.NoticeService;
import com.ssm.bdqn.standard.Resp;
import com.ssm.bdqn.standard.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RequestMapping(value = "notice")
@RestController
public class NoticeController {
    @Resource(name = "noticeService")
    private NoticeService noticeService;
    //添加通知
    @RequestMapping("/addNotice")
    public String addNotice(Notice notice){
        //获取当前时间
        notice.setContentDate(new Date());
        Resp<Object> resp = new Resp<Object>();

                if(noticeService.addNotice(notice)>0){
                    resp.getStatus();
                }
        return JSON.toJSONString(resp);
    }
    //查询通知
    @RequestMapping(value = "/getNotice")
    public String queryNotice(Notice notice){
        Resp<Object> resp = new Resp<Object>();
        resp.setData(noticeService.queryNotice(notice));
        return JSON.toJSONString(resp, SerializerFeature.DisableCircularReferenceDetect);
    }
}
