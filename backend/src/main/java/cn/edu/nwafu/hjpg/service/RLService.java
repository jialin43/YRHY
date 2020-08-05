package cn.edu.nwafu.hjpg.service;

import cn.edu.nwafu.hjpg.entity.Rl;
import org.springframework.stereotype.Service;

import java.util.List;
public interface RLService {
    List<Rl> findAll();
    int add(Rl rl);

}
