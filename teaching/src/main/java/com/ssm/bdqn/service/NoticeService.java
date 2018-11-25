package com.ssm.bdqn.service;

import com.ssm.bdqn.entity.Notice;

import java.util.List;

public interface NoticeService {
    //增加通知
    int addNotice(Notice notice);
    //查询通知
    List<Notice> queryNotice(Notice notice);
}
