package com.ssm.bdqn.service.impl;

import com.ssm.bdqn.dao.AnswerTypeDao;
import com.ssm.bdqn.entity.AnswerType;
import com.ssm.bdqn.service.AnswerTypeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service(value = "answerTypeService")
public class AnswerTypeServiceImpl implements AnswerTypeService {
    @Resource
    private AnswerTypeDao answerTypeDao;
    //查询题目类型
    public List<AnswerType> queryAnswerType(AnswerType answerType) {
        List<AnswerType> list = answerTypeDao.queryAnswerType(answerType);
        return list;
    }
    //增加题目类型
    public int addAnswerType(AnswerType answerType) {
        int count = answerTypeDao.addAnswerType(answerType);
        return count;
    }
    //删除题目类型
    public int deleteAnswerType(AnswerType answerType) {
        return answerTypeDao.deleteAnswerType(answerType);
    }
    //修改题目类型
    public int updateAnswerType(AnswerType answerType) {
        return answerTypeDao.updateAnswerType(answerType);
    }
}
