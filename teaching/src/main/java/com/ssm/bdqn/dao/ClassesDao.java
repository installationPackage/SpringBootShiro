package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.Classes;

import java.util.List;

public interface ClassesDao {
    //查询班级
    List<Classes> queryClasses(Classes classes);
    //增加班级
    int addClasses(Classes classes);
    //删除班级
    int deleteClasses(Classes classes);
    //修改班级
    int updateClasses(Classes classes);
}
