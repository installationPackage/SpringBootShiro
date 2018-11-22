package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.Answer;

import java.util.List;

public interface AnswerDao {
    //添加面试题
    int addAnswer(Answer answer);
    //查询面试题
    List<Answer> queryAnswer(Answer answer);
    //删除面试题
    int deleteAnswer(Answer answer);
}
