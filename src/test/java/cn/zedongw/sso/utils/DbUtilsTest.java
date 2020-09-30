package cn.zedongw.sso.utils;

import cn.zedongw.sso.entity.Emps;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class DbUtilsTest {

    @Test
    public void getQueryRunner() throws SQLException {
        QueryRunner queryRunner = DbUtils.getQueryRunner();
        String sql = "select id,username,salary,birthDay from emps";
        List<Emps> emps = queryRunner.query(sql, new BeanListHandler<>(Emps.class));
        System.out.println(emps);
    }
}