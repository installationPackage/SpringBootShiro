package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.AnswerType;

import java.util.List;

public interface AnswerTypeDao {
    //查询题目类型
    List<AnswerType> queryAnswerType(AnswerType answerType);
    //增加题目类型
    int addAnswerType(AnswerType answerType);
    //删除题目类型
    int deleteAnswerType(AnswerType answerType);
    //修改题目类型
    int updateAnswerType(AnswerType answerType);
}
