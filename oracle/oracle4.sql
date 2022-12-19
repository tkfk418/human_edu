--self join
select a.employee_id, a.emp_name, b.emp_name manager_name, c.department_name
from employees a,employees b,departments c
where a.manager_id=b.employee_id and a.department_id=c.department_id
order by a.emp_name;

select * from employees;
select * from departments;

select a.department_id, a.department_name, b.department_name parent_name
from departments a,departments b
where b.department_id=a.parent_id;

select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a,departments b
where a.department_id=b.department_id
and a.salary>6000
order by a.salary;

--sub-query
select a.employee_id, a.emp_name,a.salary, b.department_name
from (select * from employees where salary>6000) a , departments b
where a.department_id=b.department_id;

select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a , departments b
where a.department_id=b.department_id
and a.employee_id in(select employee_id from employees where salary>6000);

select a.employee_id, a.emp_name, b.emp_name manager_name, c.department_name, d.emp_name head_name
from employees a,employees b,departments c,employees d
where a.manager_id=b.employee_id and a.department_id=c.department_id and c.manager_id=d.employee_id
order by a.emp_name;

select b.department_name,count(*)
from employees a, departments b
where a.department_id=b.department_id
group by b.department_name
order by b.department_name;

select b.department_name,c.emp_name,count(*)
from employees a, departments b, employees c
where a.department_id=b.department_id and c.employee_id=b.manager_id
group by  b.department_name, c.emp_name
order by  b.department_name;


select b.department_name,count(*),to_char(sum(a.salary),'9,999,999') total
from employees a, departments b
where a.department_id=b.department_id
group by b.department_name
order by b.department_name;

--outer join(합집합) : 데이터의 누락없이 join - 없는 쪽에 (+)를 붙임
select a.employee_id, a.emp_name, b.emp_name manager_name
from employees a,employees b
where a.manager_id=b.employee_id(+);


select * from departments;

select a.department_id, a.department_name, b.department_name parent_name
from departments a,departments b
where a.parent_id=b.department_id(+);

--안시join
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a inner join departments b
on a.department_id=b.department_id --join 조건
where a.salary>6000 -- filtering 조건
order by a.salary;
--only in mysql
select a.department_id, a.department_name, b.department_name parent_name
from departments a left outer join departments b
on a.parent_id=b.department_id;

create view v_six as
select a.employee_id, a.emp_name,a.salary, b.department_name
from employees a,departments b
where a.department_id=b.department_id(+)
and a.salary>5000;

drop view v_six;

select * from v_six order by emp_name;

create view v_six as select * from employees where salary>6000;
select a.employee_id, a.emp_name,a.salary, b.department_name
from v_six a , departments b
where a.department_id=b.department_id;

--nested query
select avg(salary) from employees;
select emp_name,salary from employees where salary>(select avg(salary) from employees)
order by salary;
--subquery에는 order by를 사용할 수 없다

select a.emp_name,b.department_name, b.emp_name captain
from employees a, (select c.department_id,c.manager_id,c.department_name,d.employee_id,d.emp_name 
from departments c,employees d where c.department_name like '%부' and c.manager_id=d.employee_id) b
where  a.department_id=b.department_id
order by captain;

select x.emp_name,x.department_name, c.emp_name captain
from (select a.emp_name,b.department_name,a.manager_id from employees a, departments b
where a.department_id=b.department_id  and b.department_name like '%부' )x, employees c
where  x.manager_id=c.employee_id(+);




