package cn.zedongw.sso.dao;

import cn.zedongw.sso.entity.Emps;

import java.util.List;

/**
 * @InterfaceName: IEmpsDao
 * @Description: 员工数据访问层接口
 * @Author: ZeDongW
 * @Date: 2020/9/30 0030 21:32
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public interface IEmpsDao {
    /**
     * Description: 查询所有
     * @methodName: findAll
     * @param
     * @throws
     * @return: java.util.List<cn.zedongw.sso.entity.Emps>
     * @author: ZeDongW
     * @date: 2020/9/30 0030 22:47
     */
    List<Emps> findAll();

    /**
     * Description: 查询所有记录数
     * @methodName: getAllRecord
     * @param
     * @throws
     * @return: java.lang.Integer
     * @author: ZeDongW
     * @date: 2020/9/30 0030 22:47
     */
    Integer getAllRecord();
}
