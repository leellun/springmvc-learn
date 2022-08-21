package com.newland.redis.controller;

import com.newland.redis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        return userService.login(username,password);
    }
    @GetMapping("/getUser")
    @ResponseBody
    public String getUser(@RequestParam("username") String username){
        return userService.getUser(username);
    }
}
