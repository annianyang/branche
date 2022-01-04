package com.example.springmybatis2.controller;


import com.example.springmybatis2.entity.TestUser;
import com.example.springmybatis2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/cc")
    public String show1(@RequestParam("uid")Long id ,Model model){
        TestUser user =userService.getUserByid(id);
        model.addAttribute("user1",user);
        return "bb";

    }

    @RequestMapping("/dd")
    public String hello(@RequestParam("uid")Long id ,Model model){
        TestUser user =userService.getUserByid(id);
        model.addAttribute("user1",user);
        return "hello";

    }

    @ResponseBody
    @RequestMapping("/aa")
    public String getUserbyid(@RequestParam("uid") Long id){
        return userService.getUserByid(id).getUname();
    }

}
