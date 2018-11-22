package com.ssm.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.bdqn.Util.JwtUtil;
import com.ssm.bdqn.entity.Pager;
import com.ssm.bdqn.entity.User;
import com.ssm.bdqn.service.UserService;
import com.ssm.bdqn.standard.Resp;
import com.ssm.bdqn.standard.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

      //登录
      @RequestMapping(value = "/login_check")
      public Object userLogin(User user){
         //登录验证生成token
         // 先的到数据库验证判断用户名和密码是否正确
          User login = userService.login(user);
          Resp<Object> resp = new Resp<Object>();
          if(login!=null){
             //生成一个token（用户名+用户密码+30分钟（60*1000sm*30））
             String token = JwtUtil.sign(user.getUserCode()+user.getPassword(),60L*1000L*30L);
             if(userService.saveToken(token,login.getId())>0){
                resp.setData(token);
             }
         }else {
            resp.setStatus(105);
            resp.setMessage("登录失败");
         }
         return resp;
      }

      //修改用户
      @RequestMapping(value = "/updateUser")
     public String updateUser(User user){
          Resp<Object> resp = new Resp<Object>();
          if(userService.updateUser(user)>0){
              resp.getStatus();
          }
          return JSON.toJSONString(resp);
      }
      //增加用户
    @RequestMapping(value = "/addUser")
    public String addUser(User user){
        Resp<Object> resp = new Resp<Object>();
        if(userService.addUser(user)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //删除用户
    @RequestMapping(value = "/deleteUser")
    public String deleteUser(User user){
        Resp<Object> resp = new Resp<Object>();
        if(userService.deleteUser(user)>0){
            resp.getStatus();
        }
        return JSON.toJSONString(resp);
    }
    //查询用户
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String queryUser(User user,
                            @RequestParam(required = false,defaultValue = "1")int pageNo,
                            @RequestParam(required = false,defaultValue = "5")int pageSize){
        Resp<Object> resp = new Resp<Object>();
        Pager<User> pager = userService.queryUser(user,pageNo,pageSize);
        resp.setData(pager.getData());
        return JSON.toJSONString(pager, SerializerFeature.DisableCircularReferenceDetect);
    }
    //修改密码
    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    public String updatePassword(User user){
        Resp<Object> resp = new Resp<Object>();
        if(userService.updatePassword(user)>0){
            resp.getStatus();
        }
          return JSON.toJSONString(resp);
    }

}
