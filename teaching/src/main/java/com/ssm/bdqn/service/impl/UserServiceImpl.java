package com.ssm.bdqn.service.impl;

import com.ssm.bdqn.Util.MD5;
import com.ssm.bdqn.dao.UserDao;
import com.ssm.bdqn.entity.Pager;
import com.ssm.bdqn.entity.User;
import com.ssm.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource()
    private UserDao userDao;
    //登录
    public User login(User user) {
        String password = MD5.MD5(user.getPassword());
        user.setPassword(password);
        return userDao.login(user);
    }
    //查询所有用户
    public Pager<User> queryUser(User user, int pageNo, int pageSize) {
        Pager<User> pager = new Pager<User>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalCount(userDao.countUser(user));
        pager.setTotalPager((pager.getTotalCount()+pageSize-1)/pageSize);
        List<User> list = userDao.queryUser(user,(pageNo-1)*pageSize,pageSize);
        pager.setData(list);
        return pager;
    }
    //修改用户
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
    //删除用户
    public int deleteUser(User user) {
        return userDao.deleteUser(user);
    }
    //增加用户
    public int addUser(User user) {
        return  userDao.addUser(user);
    }
    //修改密码
    public int updatePassword(User user) {
        String password = MD5.MD5(user.getPassword());
        user.setPassword(password);
        return userDao.updateUser(user);
    }
    //判断有没有token
    public boolean verifyToken(String token) {
        User user = userDao.verifyToken(token);
        if(user!=null){
            return true;
        }
        return false;
    }
    //替换token
    public int saveToken(String token, int id) {
        return userDao.saveToken(token,id);
    }

}
