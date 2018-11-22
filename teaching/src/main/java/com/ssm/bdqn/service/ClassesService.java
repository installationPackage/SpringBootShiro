package com.ssm.bdqn.service;

import com.ssm.bdqn.entity.Classes;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClassesService {
    //查询班级
    List<Classes> queryClasses(Classes classes);
    //增加班级
    int addClasses(Classes classes);
    //删除班级
    int deleteClasses(Classes classes);
    //修改班级
    int updateClasses(Classes classes);
}
