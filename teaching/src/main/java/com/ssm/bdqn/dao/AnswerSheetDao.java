package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.AnswerSheet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerSheetDao {
    //查询答题卡
    List<AnswerSheet> queryAnswerSheet(@Param("answerSheet") AnswerSheet answerSheet,
                                       @Param("pageNo") int pageNo,
                                       @Param("pageSize") int pageSize);
    //增加答题卡
    int addAnswerSheet(AnswerSheet answerSheet);
    //修改答题卡
    int updateAnswerSheet(AnswerSheet answerSheet);
    //查询总记录数
    int countAnswerSheet(@Param("answerSheet") AnswerSheet answerSheet);
}
