package com.ssm.bdqn.service.impl;

import com.ssm.bdqn.dao.AnswerDao;
import com.ssm.bdqn.entity.Answer;
import com.ssm.bdqn.service.AnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "answerService")
public class AnswerServiceImpl implements AnswerService {
    @Resource()
    private AnswerDao addAnswer;
    //添加面试题
    public int addAnswer(Answer answer) {

        return addAnswer.addAnswer(answer);
    }
    //查询面试题
    public List<Answer> queryAnswer(Answer answer) {
        List<Answer> list = addAnswer.queryAnswer(answer);
        return list;
    }
    //删除面试题
    public int deleteAnswer(Answer answer) {
        int count = addAnswer.deleteAnswer(answer);
        return count;
    }
}
