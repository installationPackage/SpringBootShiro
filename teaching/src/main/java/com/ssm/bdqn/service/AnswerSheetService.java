package com.ssm.bdqn.service;

import com.ssm.bdqn.entity.AnswerSheet;
import com.ssm.bdqn.entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerSheetService {
    //查询答题卡
    Pager<AnswerSheet> queryAnswerSheet( AnswerSheet answerSheet,
                                        int pageNo,
                                         int pageSize);
    //增加答题卡
    int addAnswerSheet(AnswerSheet answerSheet);
    //修改答题卡
    int updateAnswerSheet(AnswerSheet answerSheet);

}
