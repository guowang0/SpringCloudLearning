package com.example.CloudClient.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zk on 2017/10/10.
 */
@Mapper
public interface TestDao {

    @Insert("insert into test (test) values(#{test})")
    void insert(String test);

}
