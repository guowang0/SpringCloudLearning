package com.example.CloudClient.service.impl;

import com.example.CloudClient.dao.TestDao;
import com.example.CloudClient.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by zk on 2017/10/10.
 */
@Service
public class TestServiceImpl implements TestService {

    private final TestDao testDao;

    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    @Transactional
    public void test() throws NumberFormatException{
        testDao.insert("1111");
        testDao.insert("2222");
        throw new NumberFormatException("error");
    }

}
