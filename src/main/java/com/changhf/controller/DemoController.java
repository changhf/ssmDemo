package com.changhf.controller;

import com.changhf.entity.User;
import com.changhf.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/1
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        User user = new User("changhf", "13598933878");
        demoService.insert(user);
        return "ok";
    }
}

