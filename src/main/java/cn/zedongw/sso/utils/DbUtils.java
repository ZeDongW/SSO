package cn.zedongw.sso.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @ClassName: DbUtils
 * @Description: 数据库连接工具
 * @Author: ZeDongW
 * @Date: 2020/9/30 0030 20:13
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class DbUtils {

    /**
     * c3p0连接池
     */
    private static ComboPooledDataSource comboPooledDataSource;

    //静态代码块初始化c3p0连接池
    static{
        try {
            comboPooledDataSource = new ComboPooledDataSource();
        } catch (Exception e) {
            throw new RuntimeException("初始化C3P0数据库连接池失败", e);
        }
    }

    /**
     * Description: 获取QueryRunner对象
     * @methodName: getQueryRunner
     * @param
     * @throws
     * @return: org.apache.commons.dbutils.QueryRunner
     * @author: ZeDongW
     * @date: 2020/9/30 0030 20:21
     */
    public static QueryRunner getQueryRunner(){
        return new QueryRunner(comboPooledDataSource);
    }
}
