package cn.edu.nwafu.hjpg.service.impl;

import cn.edu.nwafu.hjpg.dao.ZJDao;
import cn.edu.nwafu.hjpg.entity.Zj;
import cn.edu.nwafu.hjpg.service.ZJService;

import java.util.List;

public class ZJServiceImpl implements ZJService {
    final
    ZJDao zjDao;

    public ZJServiceImpl(ZJDao zjDao) {
        this.zjDao = zjDao;
    }

    @Override
    public List<Zj> findAll() {
        return zjDao.findAll();
    }
}
