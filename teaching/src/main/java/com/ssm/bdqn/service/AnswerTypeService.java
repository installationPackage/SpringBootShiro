package com.ssm.bdqn.service;

import com.ssm.bdqn.entity.AnswerType;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AnswerTypeService {
    //查询题目类型
    List<AnswerType> queryAnswerType(AnswerType answerType);
    //增加题目类型
    int addAnswerType(AnswerType answerType);
    //删除题目类型
    int deleteAnswerType(AnswerType answerType);
    //修改题目类型
    int updateAnswerType(AnswerType answerType);
}
