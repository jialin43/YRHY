package cn.edu.nwafu.hjpg.service.impl;

import cn.edu.nwafu.hjpg.dao.RLDao;
import cn.edu.nwafu.hjpg.entity.Rl;
import cn.edu.nwafu.hjpg.service.RLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RLServiceImpl implements RLService {
    final
    RLDao rlDao;

    public RLServiceImpl(RLDao rlDao) {
        this.rlDao = rlDao;
    }

    @Override
    public List<Rl> findAll() {
        return rlDao.findAll();
    }

    @Override
    public int add(Rl rl) {
        return 0;
    }
}
