--code block(익명(anonymous, unnamed))
declare
 vi_num number;
 vs_emp_name employees.emp_name%type;
  v_employee_id employees.employee_id%type;
begin
 vi_num:=100;
 --dbms_output.put_line(-vi_num);  --system.out.println()
  --dbms_output.put_line(3**4);
  select employee_id,emp_name
  into  v_employee_id,vs_emp_name
  from employees where employee_id=100;
   dbms_output.put_line('사번='||to_char(v_employee_id)||', 이름='||vs_emp_name);
end;
/
set serveroutput on;
select * from departments;
declare
 vs_department_name departments.department_name%type;
  v_department_id departmen09ts.department_id%type;
    vd_manager_id departments.manager_id%type;
begin
  select department_name,department_id,manager_id
  into  vs_department_name, v_department_id,vd_manager_id
  from departments where department_id=80;
   dbms_output.put_line('부서아이디='||to_char(v_department_id)||', 부서명='||vs_department_name||', 매니저아이디='||to_char(vd_manager_id));
end;
/

declare
 name departments.department_name%type;
 m_name employees.emp_name%type;
begin
  select a.department_name,b.emp_name manager_name
  into name,m_name
  from departments a, employees b
  where a.department_id=80
   and a.manager_id=b.employee_id;
   dbms_output.put_line('부서명='||name||', 부서장 이름='||m_name);
end;
/

declare
 name departments.department_name%type;
 m_id departments.manager_id%type;
 m_name employees.emp_name%type;
begin
  select department_name,manager_id
  into name,m_id
  from departments
  where department_id=80;
  
  select emp_name into m_name
  from employees
  where employee_id=m_id;
  
   dbms_output.put_line('부서명='||name||', 부서장 이름='||m_name);
end;
/

declare
    vn_salary employees.salary%type;
    vn_did employees.department_id%type;
begin
    vn_did :=round(dbms_random.value(10,110),-1);
 select salary into vn_salary from employees where department_id=vn_did and rownum=1;
 
 if vn_salary between 1 and 3000 then
 dbms_output.put_line(to_char(vn_salary)||'= low');
 elsif  vn_salary between 3001 and 6000 then
 dbms_output.put_line(to_char(vn_salary)||'= middle');
  elsif  vn_salary between 6001 and 10000 then
 dbms_output.put_line(to_char(vn_salary)||'= high');
  else 
 dbms_output.put_line(to_char(vn_salary)||'= super');
end if;
end;
/
select min(department_id),max(department_id) from departments;

declare
    vn_salary employees.salary%type;
    vn_did employees.department_id%type;
begin
    vn_did :=round(dbms_random.value(10,110),-1);
 select salary into vn_salary from employees where department_id=vn_did and rownum=1;
 
 case
 when vn_salary between 1 and 3000 then
 dbms_output.put_line(to_char(vn_salary)||'= low');
when  vn_salary between 3001 and 6000 then
 dbms_output.put_line(to_char(vn_salary)||'= middle');
  when  vn_salary between 6001 and 10000 then
 dbms_output.put_line(to_char(vn_salary)||'= high');
  else 
 dbms_output.put_line(to_char(vn_salary)||'= super');
end case;
end;
/

declare
 vn number:=0;
begin
 while vn<10
 loop
    dbms_output.put_line(vn);
    vn:=vn+1;
end loop;
end;
/

declare
 vn number;
begin
 for vn in 0..9
 loop
    dbms_output.put_line(vn);
end loop;
end;
/

--구구단 출력

declare
 a number;
 b number;
begin
 for a in 1..9
 loop 
     for b in 1..9
    loop
    dbms_output.put_line(a||'x'||b||'='||a*b);
    end loop;
 end loop;
end;
/

declare
 a number:=1;
 b number:=1;
begin
 loop 
 exit when a>9;
    loop
    dbms_output.put_line(a||'x'||b||'='||a*b);
    b:=b+1;
    exit when b>9;
    end loop;
    a:=a+1;
    b:=1;
 end loop;
end;
/

create or replace procedure plus
is
 vn number;
begin
 for vn in 0..9
 loop
    dbms_output.put_line(vn);
end loop;
end;
/
exec plus;

create or replace procedure department_info(d_id departments.department_id%type)
is
 d_name departments.department_name%type;
 m_id departments.manager_id%type;
 m_name employees.emp_name%type;
begin
  select department_name,manager_id
  into d_name,m_id
  from departments
  where department_id=d_id;
  
  select emp_name into m_name
  from employees
  where employee_id=m_id;
  
   dbms_output.put_line('부서명='||d_name||', 부서장 이름='||m_name);
end;
/
exec department_info(100);

create or replace procedure dan(a number)
is
 b number;
begin
     for b in 1..9
    loop
    dbms_output.put_line(to_char(a)||'x'||to_char(b)||'='||to_char(a*b));
 end loop;
end;
/
exec dan(9);

select * from employees;
select * from departments;

create or replace procedure count1(n_id employees.department_id%type)
is
cnt number;
begin
  select count(*) cnt
  into cnt
  from employees
  where department_id=n_id;
   dbms_output.put_line(cnt);
end;
/
exec count1(30);


select * from employees;
select * from departments;


create or replace procedure total(d_id employees.department_id%type)
is
 a number;
 b number;
begin
 select count(*) 
  into a
  from  employees
  where department_id in(select department_id from departments where parent_id=d_id) ;
  
  select count(*) 
  into b 
  from employees 
  where department_id=d_id; 
  
   dbms_output.put_line('부서아이디='||d_id||', 총 인원수='||to_char(a+b));
end;
/
exec total(10);

select count(*) from employees where department_id in(select department_id from departments where parent_id=10)
or department_id=10;

create or replace function plus1(a number, b number)
return number
is
    c number;
begin 
    c:=a+b;
    return c;
end;
/
select plus1(12,13) from dual;

select b.department_name,sum(a.salary)
from employees a, departments b
where a.department_id=b.department_id
group by b.department_name
order by b.department_name;

create or replace function tot_sal(did departments.department_id%type)
return employees.salary%type
is
 total employees.salary%type;
begin 
  select sum(salary) into total from employees where department_id=did;
  return total;
end;
/
select department_name,tot_sal(department_id)
from departments;

create or replace function getDname(did departments.department_id%type)
return departments.department_name%type
is
 name departments.department_name%type;
begin 
  select department_name into name from departments where department_id=did;
  return name;
end;
/
select * from departments;
select * from employees;
create or replace function getMname(man departments.department_id%type)
return employees.emp_name%type
is
 name1 employees.emp_name%type;
begin 
  select emp_name into name1 from employees, departments where employees.employee_id=departments.manager_id and departments.department_id=man;
  return name1;
end;
/

create or replace function getCount(ct departments.department_id%type)
return number 
is
 cnt number;
begin 
  select count(*) cnt into cnt from employees where department_id=ct;
  return cnt;
end;
/
select getDname(50) from dual;
select getMname(10) from dual;
select getCount(50) from dual;

--into는  하나의 레코드를 찾을때만 사용
declare
    vs_emp_name employees.emp_name%type;
    vn_emp_id employees.employee_id%type;
   cursor c1(vn number)
   is 
    select employee_id,emp_name from employees where employee_id>vn;   --선언
begin
    open c1(200);  -- 열기(실행)
    loop
        fetch c1 into vn_emp_id, vs_emp_name;  --사용
        exit when c1%notfound;
        
        dbms_output.put_line(to_char(vn_emp_id)||', '||vs_emp_name);
        
    end loop;
    close c1;  --닫기
end;
/
select emp_name from employees where employee_id>200;

declare
   cursor c1(vn number)
   is 
    select employee_id,emp_name from employees where employee_id>vn;   
begin
   for rec in c1(200)
    loop
    dbms_output.put_line(to_char(rec.employee_id)||','||rec.emp_name);
    end loop;
end;
/
declare
begin
   for rec in (select employee_id,emp_name from employees where employee_id>200)
    loop
    dbms_output.put_line(to_char(rec.employee_id)||','||rec.emp_name);
    end loop;
end;
/
declare
m_name employees.emp_name%type;
begin
   for rec in (select employee_id,emp_name,manager_id from employees where employee_id>200)
    loop
    select emp_name into m_name
    from employees
    where employee_id=rec.manager_id;
    dbms_output.put_line(to_char(rec.employee_id)||','||rec.emp_name||', '||m_name);
    end loop;
end;
/
select * from departments;
select * from employees;

declare
m_name employees.emp_name%type;


begin
   for rec in (select a.employee_id,a.emp_name,a.manager_id,b.department_name from employees a, departments b where b.department_id=a.department_id)
    loop
    if rec.manager_id is null then
        m_name:='-';
    else
        select emp_name into m_name
        from employees 
        where employee_id=rec.manager_id;
    end if;
    dbms_output.put_line(to_char(rec.employee_id)||','||rec.emp_name||','||m_name||', '||to_char(rec.department_name));
    end loop;
end;
/




