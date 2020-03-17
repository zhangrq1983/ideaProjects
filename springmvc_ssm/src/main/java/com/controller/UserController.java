package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.pojo.User;
import com.service.UserService;

@Controller
public class UserController<pfsi> {
    /**
     * 使用@Autowired也可以，@Autowired默认按类型装配
     * @Resource 默认按名称装配，当找不到与名称匹配的bean才会按类型装配。
     */
    @Resource
    private UserService userService;
    /**
     * 测试查询
     * @param model
     * @return
     */
    @RequestMapping("/showUser")
    public String showUser(Model model) {

        List<User> userList = userService.getUserAll();

        model.addAttribute("userList", userList);
        return "showUser";
    }

    /**
     * 测试添加数据
     * @param model
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(Model model) {
        User user = new User();
        user.setUser_Name("李清照");
        user.setPassword("111111");
        user.setAge(11);
        userService.insert(user);
        List<User> userList = userService.getUserAll();
        model.addAttribute("userList", userList);
        return "showUser";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
        @RequestMapping("/updateUser")
        public String updateUser(@RequestParam(value = "id") Integer id,Model model) {

            User user = new User();
            user.setId(id);
            user.setUser_Name("李四");
            user.setPassword("2222");
            user.setAge(22);

        userService.updateByPrimaryKey(user);

        List<User> userList = userService.getUserAll();

        model.addAttribute("userList", userList);
        return "showUser";
    }


    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam(value = "id") Integer id,Model model) {

        userService.deleteByPrimaryKey(id);

        List<User> userList = userService.getUserAll();

        model.addAttribute("userList", userList);
        return "showUser";
    }


}
