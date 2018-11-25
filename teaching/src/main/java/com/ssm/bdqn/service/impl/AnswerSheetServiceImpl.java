package com.ssm.bdqn.service.impl;

import com.ssm.bdqn.dao.AnswerSheetDao;
import com.ssm.bdqn.entity.AnswerSheet;
import com.ssm.bdqn.entity.Pager;
import com.ssm.bdqn.service.AnswerSheetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "answerSheetService")
public class AnswerSheetServiceImpl implements AnswerSheetService {
    @Resource
    private AnswerSheetDao answerSheetDao;
    //查询答题卡
    public Pager<AnswerSheet> queryAnswerSheet(AnswerSheet answerSheet, int pageNo, int pageSize) {
        Pager<AnswerSheet> pager = new Pager<AnswerSheet>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalCount(answerSheetDao.countAnswerSheet(answerSheet));
        pager.setTotalPager((pager.getTotalCount()+pageSize-1)/pageSize);
        List<AnswerSheet> list = answerSheetDao.queryAnswerSheet(answerSheet,(pageNo-1)*pageSize,pageSize);
        pager.setData(list);
        return pager;
    }
    //增加答题卡
    public int addAnswerSheet(AnswerSheet answerSheet) {
        return answerSheetDao.addAnswerSheet(answerSheet);
    }
    //修改答题卡
    public int updateAnswerSheet(AnswerSheet answerSheet) {
        return answerSheetDao.updateAnswerSheet(answerSheet);
    }
}
