package com.ssm.bdqn.dao;

import com.ssm.bdqn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserDao {
    //登录
    User login(User user);
    //查询总记录数
    int countUser(@Param("user") User user);
    //查询所有用户
    List<User> queryUser(@Param("user") User user,
                         @Param("pageNo") int pageNo,
                         @Param("pageSize") int pageSize);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(User user);
    //增加用户
    int addUser(User user);
    //判断有没有token
    User verifyToken(String token);
    //储存token
    int saveToken(@Param("token") String token,@Param("id") int id);
}
