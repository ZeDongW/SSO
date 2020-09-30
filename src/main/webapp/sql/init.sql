
-- 删除原有数据库
Drop table emps;

-- 创建数据库
create table emps(
    id varchar2(8) primary key ,
    username varchar2(20) not null ,
    salary number(10,2) not null ,
    birthday date not null
);

-- 创建数据库注释
comment on table emps is '员工信息表';
comment on column emps.id is '员工编号';
comment on column emps.username is '员工姓名';
comment on column emps.salary is '员工月薪';
comment on column emps.birthday is '员工生日';