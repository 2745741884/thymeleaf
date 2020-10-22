package com.offcn.controller;


import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MyController {

    @RequestMapping("/index")
    public String index(Model model){
        String message = "hello thymeleaf";
        model.addAttribute("message", message);
        System.out.println("hello------------");
        return "index";
    }

    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User("feiran", 1, 180);
        model.addAttribute("user", user);
        Map<String, Object> map = new HashMap<>();
        map.put("p1", "1.jpg");
        map.put("p2", "2.jpg");
        model.addAttribute("p", map);
        return "index2";
    }

    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User("junq",1, 100));
        list.add(new User("feiran",2, 123));
        list.add(new User("zhuqie",3, 325));
        list.add(new User("liubai",4, 50));
        model.addAttribute("userList", list);
        return "index3";
    }

    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username", "斐然");
        model.addAttribute("href", "http://www.taobao.com");
        return "index4";
    }

    @RequestMapping("/index5")
    public String index5(Model model) {
        model.addAttribute("result", "y");
        model.addAttribute("menu", "feiran");
        model.addAttribute("manager", "mange");
        return "index5";
    }

    @RequestMapping("/index6")
    public String index6(Model model) {
        return "index6";
    }

    @RequestMapping("/index7")
    public String index7(Model model) {
        Date date = new Date();
        model.addAttribute("date", date);
        model.addAttribute("num", 123.3334);
        String str = "浮点司空见惯喝酒了看电视吧带你飞的撒发斯蒂芬";
        model.addAttribute("str", str);
        String str2 = "java-0909-ops";
        model.addAttribute("str2", str2);
        return "index7";
    }
}



