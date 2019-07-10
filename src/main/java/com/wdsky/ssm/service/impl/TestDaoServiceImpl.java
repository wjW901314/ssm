package com.wdsky.ssm.service.impl;

import com.wdsky.ssm.dao.TestDao;
import com.wdsky.ssm.model.Test;
import com.wdsky.ssm.service.ITestDoaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestDaoServiceImpl implements ITestDoaService {

    @Resource
    TestDao testDao;

    @Override
    public Test getModelById(int id) {
        return testDao.getModelById(id);
    }
}
