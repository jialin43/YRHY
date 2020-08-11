package cn.edu.nwafu.hjpg.controller;

import cn.edu.nwafu.hjpg.common.HttpResult;
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
    public HttpResult addUser(User user) {
        return HttpResult.ok(userService.addUser(user));
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public HttpResult updateUser(User user) {
        return HttpResult.ok(userService.updateUser(user));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public HttpResult delUser(User user) {
        userService.delUser(user);
        return HttpResult.ok();

    }

}
