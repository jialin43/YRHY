package cn.edu.nwafu.hjpg.service.impl;

import cn.edu.nwafu.hjpg.dao.UserDao;
import cn.edu.nwafu.hjpg.entity.User;
import cn.edu.nwafu.hjpg.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public String addUser(User user) {
        String result = "already exists";
        User oldUser = userDao.findUserByUsername(user.getUsername());
        if(oldUser==null){
            result = userDao.insert(user).getId();
        }
        return result;
    }

    @Override
    public String updateUser(User user) {
        return userDao.save(user).getId();
    }

    @Override
    public void delUser(User user) {
        userDao.delete(user);
    }
}
