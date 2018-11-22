package com.ssm.bdqn.service;

import com.ssm.bdqn.entity.Pager;
import com.ssm.bdqn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //登录
    User login(User user);
    //查询所有用户
    Pager<User> queryUser(User user,
                          int pageNo,
                          int pageSize);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(User user);
    //增加用户
    int addUser(User user);
    //修改密码
    int updatePassword(User user);
    //判断有没有token
    boolean verifyToken(String token);
    //储存token
    int saveToken(String token,int id);
}
