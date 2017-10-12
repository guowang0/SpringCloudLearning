package com.example.CloudClient.service.impl;

import com.example.CloudClient.dao.DynamicSqlDao;
import com.example.CloudClient.dao.TestDao;
import com.example.CloudClient.entity.SqlTest;
import com.example.CloudClient.service.TestService;
import org.apache.ibatis.scripting.xmltags.DynamicSqlSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by zk on 2017/10/10.
 */
@Service
public class TestServiceImpl implements TestService {

    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    private final TestDao testDao;
    private final DynamicSqlDao sqlDao;

    public TestServiceImpl(TestDao testDao, DynamicSqlDao sqlDao) {
        this.testDao = testDao;
        this.sqlDao = sqlDao;
    }

    @Override
    @Transactional
    public void test() throws NumberFormatException {
        testDao.insert("1111");
        testDao.insert("2222");
     //   throw new NumberFormatException("error");
    }

    @Override
    public void sqlTest() {
        List<SqlTest> list = sqlDao.queryAll();
        for (SqlTest test : list) {
            logger.info(test.id + "  " + test.openid + "   " + test.nickname + "   " + test.headimgurl);
        }
    }

}
