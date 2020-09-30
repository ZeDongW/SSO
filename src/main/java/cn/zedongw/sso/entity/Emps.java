package cn.zedongw.sso.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: Emps
 * @Description: 员工实体类
 * @Author: ZeDongW
 * @Date: 2020/9/30 0030 18:09
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Emps {

    /**
     * 员工id
     */
    private String id;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 员工月薪
     */
    private BigDecimal salary;

    /**
     * 员工生日
     */
    private Date birthday;

    public Emps() {
    }

    public Emps(String id, String userName, BigDecimal salary, Date birthday) {
        this.id = id;
        this.userName = userName;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
