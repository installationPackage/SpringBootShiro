package com.ssm.bdqn.interceptor;

import com.ssm.bdqn.util.JwtUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class TokenInterceptor extends HandlerInterceptorAdapter {
    /**
     * 在控制器执行之前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest req = (HttpServletRequest) request;
        String token =req.getParameter("token");
        if(token != null){
            Object obj = JwtUtil.unsign(token,Object.class);
            if(obj ==null){
                response.sendRedirect("/toLogin");
                return false;
            }
        }else {
            response.sendRedirect("/toLogin");
            return false;
        }
        return true;
    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        String name = request.getServletPath().toString();
        System.out.println("========"+name+"===>LoginInterceptor postHandle");
    }

    /**
     * Handler执行完成之后调用这个方法
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception exc)
            throws Exception {
        String name = request.getServletPath().toString();
        System.out.println("========"+name+"===>LoginInterceptor afterCompletion");
    }

}
