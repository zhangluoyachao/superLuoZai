select * from emp e1
where exists(
select empno from emp where deptno = 10 and e1.empno = empno
)

select stuid from tblscore 
where exists(
select * from 
)

create or replace function empcount
return number 
as
f_count number;
begin
  select count(1) into f_count from emp;
  return f_count;
  end;
  
  select empcount() from dual
  
----------------
--根据id 查询员工的入职日期
create or replace function emp_getYear(e_id emp.empno%type) 
return number
as
eyear number;
begin
  select extract(year from hiredate) into eyear from emp where empno = e_id;
  return eyear;
  end;
  
select emp_getyear(1) from dual

create or replace function emp_getYear2(e_id emp.empno%type) 
return %rowType
as

begin
 
  return select * from emp where empno = 1;
  end;
  
---------------------------------
--新增触发器，每次当有值新增，都提示什么值新增了
create or replace trigger emp_tip
before
insert
on emp for each row
declare
empid number;
begin
  select max(empno)+1 into empid from emp;
  --:new代表新增的数据
  :new.empno := empid;
  DBMS_OUTPUT.put_line('新增的主键是'||empid);
  end;
  
-------------------------------------------
--创建一个触发器 实现删除学生的同时删除对应学生成绩信息
create or replace trigger delall_tri
after delete on tblstudent for each row
begin
  --:old代表删除的数据
  delete from tblscore where stuid = :old.stuid;
  end;
  
  select * from tblstudent 
  select * from tblscore
  
  delete from tblstudent where stuid = 1000;
  
  ------------------------------------
--  通过触发器可以添加错误信息
修改学生信息，要求不能修改stuid = 1001的学生

create or replace trigger check_update_tblsutdent
before update on tblstudent for each row
--当满足条件才会执行begin
 when(old.stuid =  1001)
begin
  --  raise_application_error( 错误编号，错误信息 )
  raise_application_error(-20000,'stuid=1001的信息不能删除！');
  end;
  
update tblstudent set stuname ='时磊' where stuid =1001;


错误编号范围：-20000 ~-20999 不会和oracle默认错误重复



