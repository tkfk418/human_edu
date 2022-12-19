create table person(
name varchar2(20),
mobile varchar2(8),
gender varchar2(6),
salary number(5)
);
drop table person;
desc person;

--select table_name from user_tables;

create table student(
name varchar2(20) not null,
gender varchar2(6) not null,
mobile varchar2(8),
math_score number(3),
english_score number(3),
korean_score number(3),
school_name varchar2(12) not null,
grade_num number(20) not null
);
desc student;
--c(데이터생성/추가) insert
--r(데이터조회) select
--u(업데이트) update
--d(삭제) delete
--''==null
insert into student values ('john','male',null,null,null,null,'westlake',6);
select * from student;
insert into student values('jane','female',null,null,null,null,'riverwest',5);
insert into student(name,gender,school_name,grade_num) values('jacob','male','riverwest',6);
--delete from student where name='잘못된 이름';
insert into student values('esther','female',null,null,null,null,'riverest',5);
insert into student values('micle','male',null,null,null,null,'riverest',3);
insert into student values('natasha','female',null,null,null,null,'riverwest',4);
insert into student values('solongo','male',null,null,null,null,'riverwest',6);
insert into student values('selena','female',null,null,null,null,'riverwest',7);
insert into student values('samanda','female',null,null,null,null,'riverwest',3);
insert into student values('drew','male',null,null,null,null,'riverwest',4);

delete from student where name='drew';
commit;
rollback;
delete from student where grade_num<6;
delete from student where korean_score is null;

update student set gender='male' where name='natasha';
update student set mobile='-' where mobile is null;
update student set mobile='-' where mobile is null;
select * from employees;
create table worker as select * from employees;
select * from worker;
--worker 테이블에서 manager id 가 null 인 사람의 월급을 30000으로 변경
update worker set salary=30000 where manager_id is null;
update worker set commission_pct=0.25 where manager_id=124;
select * from worker where manager_id=124;
