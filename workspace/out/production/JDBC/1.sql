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
--����id ��ѯԱ������ְ����
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
--������������ÿ�ε���ֵ����������ʾʲôֵ������
create or replace trigger emp_tip
before
insert
on emp for each row
declare
empid number;
begin
  select max(empno)+1 into empid from emp;
  --:new��������������
  :new.empno := empid;
  DBMS_OUTPUT.put_line('������������'||empid);
  end;
  
-------------------------------------------
--����һ�������� ʵ��ɾ��ѧ����ͬʱɾ����Ӧѧ���ɼ���Ϣ
create or replace trigger delall_tri
after delete on tblstudent for each row
begin
  --:old����ɾ��������
  delete from tblscore where stuid = :old.stuid;
  end;
  
  select * from tblstudent 
  select * from tblscore
  
  delete from tblstudent where stuid = 1000;
  
  ------------------------------------
--  ͨ��������������Ӵ�����Ϣ
�޸�ѧ����Ϣ��Ҫ�����޸�stuid = 1001��ѧ��

create or replace trigger check_update_tblsutdent
before update on tblstudent for each row
--�����������Ż�ִ��begin
 when(old.stuid =  1001)
begin
  --  raise_application_error( �����ţ�������Ϣ )
  raise_application_error(-20000,'stuid=1001����Ϣ����ɾ����');
  end;
  
update tblstudent set stuname ='ʱ��' where stuid =1001;


�����ŷ�Χ��-20000 ~-20999 �����oracleĬ�ϴ����ظ�



