package cn.edu.nwafu.hjpg.dao;

import cn.edu.nwafu.hjpg.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User,Long> {
    User findUserByUsername(String username);

}
