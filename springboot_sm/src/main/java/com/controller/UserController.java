package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.pojo.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    @RequestMapping("/index")
    public String index() throws Exception {
    	return "index";
    }
    
    //显示用户
    @RequestMapping("/list")
    public String list(Model model) throws Exception {
    	List<User> userList = userService.getUser();
    	model.addAttribute("userList", userList);
    	return "showUser";
    }
    
    //删除用户
    @RequestMapping("/deleteUser")
    public String delete(@RequestParam(value = "id") Integer id,Model model) throws Exception {
        userService.deleteUser(id);

        List<User> userList = userService.getUser();
        model.addAttribute("userList", userList);
        return "showUser";
    }
    
    //增加用户
    @RequestMapping("/insertUser")
    public String addUser(Model model) throws Exception {
        user.setUser_Name("阿花");
        user.setPassword("password");
        user.setAge(33);
        userService.addUser(user);

        List<User> userList = userService.getUser();
        model.addAttribute("userList", userList);
        return "showUser";
    }

    //修改用户
    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam(value = "id") Integer id,Model model) throws Exception {
        User user = new User();
        user.setId(id);
        user.setUser_Name("李四");
        user.setPassword("2222");
        user.setAge(22);

        userService.updateByPrimaryKey(user);

        List<User> userList = userService.getUser();

        model.addAttribute("userList", userList);
        return "showUser";
    }

}