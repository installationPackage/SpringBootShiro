package com.ssm.bdqn.service.impl;


import com.ssm.bdqn.dao.ClassesDao;
import com.ssm.bdqn.entity.Classes;
import com.ssm.bdqn.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "classesService")
public class ClassesServiceImpl implements ClassesService {
    @Resource()
    private ClassesDao classesDao;
    //查询班级
    public List<Classes> queryClasses(Classes classes) {
        return classesDao.queryClasses(classes);
    }
    //增加班级
    public int addClasses(Classes classes) {
        return classesDao.addClasses(classes);
    }
    //删除班级
    public int deleteClasses(Classes classes) {
        return classesDao.deleteClasses(classes);
    }
    //修改班级
    public int updateClasses(Classes classes) {
        return classesDao.updateClasses(classes);
    }
}
