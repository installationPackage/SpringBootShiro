package com.ssm.bdqn.entity;

/**
 * 题目表
 */
public class Answer {

    private Integer id;           //题目id
    private String titleName;     //题目名称
    private String optionA;       //选项1
    private String optionB;       //选项2
    private String optionC;       //选项3
    private String optionD;       //选项4
    private Integer courseTypeId; //课程类型id
    private Integer answerTypeId; //题目类型id
    private String result;       //正确答案
    private Integer state;        //是否通过审核
    private Course course;        //课程类
    private AnswerType answertype;//题目类型


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public Integer getAnswerTypeId() {
        return answerTypeId;
    }

    public void setAnswerTypeId(Integer answerTypeId) {
        this.answerTypeId = answerTypeId;
    }

    public Integer getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Integer courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public AnswerType getAnswertype() {
        return answertype;
    }

    public void setAnswertype(AnswerType answertype) {
        this.answertype = answertype;
    }
}
