package com.example.CloudClient.dao;

import com.example.CloudClient.entity.SqlTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by zk on 2017/10/12.
 * 动态构建sql测试
 */
@Mapper
public interface DynamicSqlDao {

    @SelectProvider(type = DynamicSql.class, method = "queryAll")
    List<SqlTest> queryAll();

    class DynamicSql {
        public String queryAll() {
            return new SQL() {{
                SELECT("*");
                FROM("[imMessageWeixinUserInfo]");
            }}.toString();
        }
    }
}
