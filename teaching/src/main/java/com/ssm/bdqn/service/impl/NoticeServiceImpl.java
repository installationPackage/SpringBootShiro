package com.ssm.bdqn.service.impl;

import com.ssm.bdqn.dao.NoticeDao;
import com.ssm.bdqn.entity.Notice;
import com.ssm.bdqn.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "noticeService")
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeDao noticeDao;
    //增加通知
    public int addNotice(Notice notice) {
        return noticeDao.addNotice(notice);
    }
    //查询通知
    public List<Notice> queryNotice(Notice notice) {
        return noticeDao.queryNotice(notice);
    }
}
