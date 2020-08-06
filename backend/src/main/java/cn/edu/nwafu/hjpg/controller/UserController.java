package cn.edu.nwafu.hjpg.controller;

import cn.edu.nwafu.hjpg.entity.User;
import cn.edu.nwafu.hjpg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }


    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(User user) {
        return userService.addUser(user);
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String updateUser(User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delUser(User user) {
        userService.delUser(user);
        return "OK";

    }

}
