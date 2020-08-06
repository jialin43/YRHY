package cn.edu.nwafu.hjpg.service;

import cn.edu.nwafu.hjpg.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    String addUser(User user);
    String updateUser(User user);
    void delUser(User user);

}
