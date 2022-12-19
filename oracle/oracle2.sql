create table person(
name varchar2(20),
gender varchar2(6),
mobile varchar2(8) primary key,
address varchar2(30),
city varchar2(20)
);

create table roomtype(
typenum number(3) primary key,
typename varchar2(20) not null,
comments varchar2(32)
);
desc roomtype;
create table roominfo(
num varchar2(10) primary key,
name varchar2(20) not null,
type number(3), 
howmany number(3) default 1,
howmuch number(4) default 0,
constraint fk_typenum foreign key(type) references roomtype(typenum)
);
insert into roomtype values(1,'suite room',null);
insert into roomtype values(2,'deluxe room',null);
insert into roomtype values(3,'family room',null);
select * from roomtype;
insert into roominfo values(100,'백두산',1,6,1200);
select * from roominfo;
create view under_five as select * from worker where salary<5000;
select * from under_five;
select * from worker where emp_name='Jonathan Taylor';
create index ndx_emp_name on worker(emp_name);
select * from employees;
create table worker as select * from employees;
create synonym human_resource for employees;
select * from human_resource;

create sequence seq_id;
select seq_id.nextval from dual;
insert into roomtype values (seq_id.nextval,'corridor',null);
select emp_name||','||salary from worker;
select emp_name||':'||manager_id||','||salary from worker;

select 1+5 from dual;
select 10/2 from dual;
select 3*5 from dual;

select employee_id, salary, case when salary<=5000 then 'c'
when salary>5000 and salary<=15000 then 'b'
else 'a'
end as salary_level
from worker;

select employee_id, salary, case when salary>=10000 then '본부장급'
when salary>=6000 and salary<10000 then '팀장급'
else '팀원급'
end as salary_level
from worker;

select emp_name,salary from worker where salary between 4000 and 6000;
select emp_name,salary from worker where salary in(3000,4000,5000,6000,7000);
select emp_name from worker where emp_name like 'J%';
select emp_name from worker where emp_name like '%son';
select emp_name from worker where emp_name like '% A%';
select emp_name from worker where emp_name like '%ac%';
select emp_name from worker where emp_name like 'J___ %';
select emp_name from worker where emp_name like '_____ %';
select ceil(3.14) from dual;
select floor(3.14) from dual;
select power(4,4) from dual;
select sqrt(16) from dual;
select initcap('good morning vietnam') from dual;
select lower(emp_name) from worker;
select upper(emp_name) from worker;
select concat (emp_name,salary) from worker;
select substr('good morning',5) from dual;
select substr('good morning',1,5) from dual;
select substr('good morning',-3) from dual;
select emp_name from worker where substr(emp_name,-3)='son';
select emp_name from worker where emp_name like '%son';
select substr('ABCDEFG',1,4), substr('가나다라마바사',1,4) from dual;
select replace('good morning vietnam','morning','evening') from dual;
select emp_name from worker where emp_name like 'John%';
select replace(emp_name,'John ','John-') from worker where emp_name like 'John%';
select replace(emp_name,' ','') from worker where emp_name like 'John%';
select instr('내가 만약 외로울 때면, 내가 만약 괴로울 때면, 내가 만약 즐거울 때면','만약',5,2) from dual; 
select instr('John Wick','Joe') from dual;
select length('good morning vietnam') from dual;
select emp_name,length(emp_name) from worker;

select emp_name from worker;
select substr(emp_name,1,instr(emp_name,' ')-1)from worker;
select substr(emp_name,instr(emp_name,' ')+1)from worker;
select replace(emp_name,' ','-') from worker;
select to_char(salary,'99,999') from worker;
select sysdate,systimestamp from dual;
select to_char(sysdate,'yyyy-mm-dd HH24:MI:SS') from dual;
select to_char(systimestamp,'yyyy-mm-dd HH24:MI:SS') from dual;
select to_char(sysdate,'PM HH')||'시'|| to_char(sysdate,'MI')||'분'||to_char(sysdate,'SS')||'초' from dual;
select employee_id,
        to_char(start_date,'yyyy'), to_char(end_date,'yyyy'),
        nullif(to_char(start_date,'yyyy'), to_char(end_date,'yyyy')) nullif_year
        from job_history;
        
select emp_name,salary,decode(salary,3000,'3k',4000,'4k',5000,'5k','etc')from worker;
--decode안에서는 비교열을 못씀
select emp_name,salary, case when salary between 3000 and 3999 then '3k' else 'etc' end from worker;