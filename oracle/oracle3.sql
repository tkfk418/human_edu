select table_name from user_tables;
select view_name from user_views;
select sequence_name from user_sequences;
select employee_id,emp_name,salary,commission_pct,
       to_char(salary*(1+commission_pct/100),'99,999.99') final_salary from worker
where commission_pct is not null;
select count(*) from sales;
--null은 카운트가 안됨
select sum(salary) from worker;
select to_char(round(avg(salary)),'99,999.99') from worker;
select min(salary) from worker;
select max(salary) from worker;
select variance(salary) from worker;
select stddev(salary) from worker;

select manager_id,count(*) cnt,sum(salary),to_char(avg(salary),'99,999.99') avg_sel from worker group by manager_id;

select department_id,count(*) cnt
from worker 
group by department_id
having count(*)>1
order by cnt;

select commission_pct,count(*) cnt,to_char(avg(salary),'99,999.99') avg_sel
from worker where commission_pct is not null
group by commission_pct
order by avg(salary);

select cust_gender,count(*) cnt from customers 
group by cust_gender;

select cust_marital_status,count(*) cnt from customers 
group by cust_marital_status;
update customers set cust_marital_status='widow' where cust_marital_status='Widowed';
update customers set cust_marital_status='divorced' where cust_marital_status='Divorc.';

select cust_marital_status,count(*) cnt from customers 
group by cust_marital_status
order by  cust_marital_status;

select cust_year_of_birth,cust_gender,count(*) cnt from customers 
group by cust_year_of_birth,cust_gender
order by  cust_year_of_birth,cust_gender;

select substr(emp_name,1,1) one,count(*) cnt from worker 
group by substr(emp_name,1,1)
order by one;


select floor(salary/1000)*1000,count(*) cnt
from worker
group by  floor(salary/1000)*1000
order by  floor(salary/1000)*1000;

create table exp_goods_asia(
country varchar2(10),seq number, goods varchar2(80));
insert into exp_goods_asia values('한국',1,'원유제외 석유류');
insert into exp_goods_asia values('한국',2,'자동차');
insert into exp_goods_asia values('한국',3,'전자집적회로');
insert into exp_goods_asia values('한국',4,'선박');
insert into exp_goods_asia values('한국',5,'LCD');
insert into exp_goods_asia values('한국',6,'자동차부품');
insert into exp_goods_asia values('한국',7,'휴대전화');
insert into exp_goods_asia values('한국',8,'환식탄화수소');
insert into exp_goods_asia values('한국',9,'무선송신기 디스플레이 부속품');
insert into exp_goods_asia values('한국',10,'철 또는 비합금강');
insert into exp_goods_asia values('일본',1,'자동차');
insert into exp_goods_asia values('일본',2,'자동차부품');
insert into exp_goods_asia values('일본',3,'전자집적회로');
insert into exp_goods_asia values('일본',4,'선박');
insert into exp_goods_asia values('일본',5,'반도체웨이퍼');
insert into exp_goods_asia values('일본',6,'화물차');
insert into exp_goods_asia values('일본',7,'원유제외 석유류');
insert into exp_goods_asia values('일본',8,'건설기계');
insert into exp_goods_asia values('일본',9,'다이오드,트랜지스터');
insert into exp_goods_asia values('일본',10,'기계류');
select * from exp_goods_asia order by goods;
--교집합
select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본';
--합집합
select goods from exp_goods_asia where country='한국'
union
select goods from exp_goods_asia where country='일본';
--중복제거 안한 합집합
select goods from exp_goods_asia where country='한국'
union all
select goods from exp_goods_asia where country='일본' order by goods;
--차집합(한국에만 있는 거)
select goods from exp_goods_asia where country='한국'
minus
select goods from exp_goods_asia where country='일본';

(select goods from exp_goods_asia where country='한국'
union
select goods from exp_goods_asia where country='일본')
minus
(select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본');

--join
select emp_name,department_id from worker;
select * from departments;
select * from worker;
select * from jobs;
select distinct prod_id from sales order by prod_id;

--닉네임 줘도 됨
select a.emp_name,b.department_name
from worker a,departments b
where a.department_id=b.department_id;

select worker.emp_name,jobs.job_title
from worker,jobs 
where worker.job_id=jobs.job_id;

select * from roomtype;
delete from roomtype where typenum=8;
select * from roominfo;
insert into roominfo values(101,'지리산',2,7,1500);
insert into roominfo values(102,'설악산',4,8,1800);
insert into roominfo values(103,'한라산',3,5,1600);

select d.num , d.name, c.typename,d.howmany,d.howmuch
from roomtype c,roominfo d 
where d.type=c.typenum;

select * from sales;
select * from products;
select * from customers;
select * from channels;
select * from employees;
--join이 제대로 됐는지 알고 싶으면 select의 나타나는 아이들을 막고 count(*)를 써서 숫자가 동일한지 보면 됨.
select d.prod_name,e.cust_name,f.channel_desc,g.emp_name,h.department_name
from sales c,products d,customers e,channels f, employees g,departments h
where c.prod_id=d.prod_id and c.cust_id=e.cust_id and c.channel_id=f.channel_id and c.employee_id=g.employee_id
and g.department_id=h.department_id;

select * from sales where employee_id not in(select employee_id from employees);

select b.prod_name,to_char(sum(a.amount_sold),'9,999,999,999.99') 
from sales a, products b
where a.prod_id=b.prod_id
group by b.prod_name 
order by b.prod_name;

select b.emp_name,to_char(sum(a.amount_sold),'9,999,999,999.99') 
from sales a, employees b
where a.employee_id=b.employee_id
group by b.emp_name 
order by b.emp_name;
