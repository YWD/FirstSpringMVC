package xyz.hasaki.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller {
    @Nullable
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        // 创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        // 向模型中添加数据
        modelAndView.addObject("msg", "这是我的第一个Spring MVC 程序");
        // 设置逻辑视图名
        modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
        // 返回ModelAndView对象
        return modelAndView;
    }
}
