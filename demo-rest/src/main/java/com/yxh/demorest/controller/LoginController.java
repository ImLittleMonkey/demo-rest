package com.yxh.demorest.controller;

import com.yxh.demorest.entity.User;
import com.yxh.demorest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(){

        return "index";
    }
    @GetMapping("/user")
    public String userList(Model model){
        List<User> user =  userService.findAll();
        model.addAttribute("user",user);
        return "/user_List";
    }
    @PostMapping("/user")
    public String useradd(User user) {
        userService.addUser(user);
        return "redirect:/user";
    }
    @GetMapping("/user_add")
    public String useraddPage(){
        return "/user_add";
    }

    @GetMapping("/deluser/{id}")
    public String delUser(@PathVariable("id") Integer id){
        userService.delUser(id);
        return "redirect:/user";
    }

    @GetMapping("/updateuser/{id}")
    public String getUser(@PathVariable("id") Long id,Model model){
        User user = userService.finduserById(id);
        model.addAttribute("user",user);
        return "user_update";
    }

    @PostMapping("/updateuser/{id}")
    public String updateUser( @PathVariable("id") Long id,User user){
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/user" ;
    }




}
