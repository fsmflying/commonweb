/*
use test;
drop database  educations01;
drop database  educations02;


*/

create database educations01;
use educations01;

create table Subjects(
 id int primary key auto_increment not null,
 name varchar(64) not null,
 memo varchar(512)
);

create table Teachers(
 id int primary key auto_increment not null,
 name varchar(64) not null,
 sex int not null default 0,
 birthDate date
);


create table Students(
 id int primary key auto_increment not null,
 name varchar(64) not null,
 sex int not null default 0,
 birthDate date
);

create table Courses(
 id int primary key auto_increment not null,
 name varchar(64) not null,
 teacherId int not null,
 subjectId int not null,
 startTime date,
 memo varchar(512)
);





create database educations02;
use educations02;

create table Examinations(
 id int primary key auto_increment not null,
 courseId int not null,
 memo varchar(512)
);

create table Scores(
	studentId int not null,
	examinationId int not null,
	score int not null
);

alter table Scores add constraint ck_scores_range_score check(score>=0 and score<=100);

use educations01;
insert into Subjects(id,name,memo) values(1,'΢����','΢���֣�Calculus���Ǹߵ���ѧ���о�������΢�֣�Differentiation��������(Integration)�Լ��йظ����Ӧ�õ���ѧ��֧��');
insert into Subjects(id,name,memo) values(2,'���Դ���','���Դ�������ѧ��һ����֧�������о������������������ռ䣨������Կռ䣩�����Ա任������ά�����Է�����');
insert into Subjects(id,name,memo) values(3,'��ɢ��ѧ','��ɢ��ѧ(Discrete mathematics)���о���ɢ���Ľṹ�����໥��ϵ����ѧѧ�ƣ����ִ���ѧ��һ����Ҫ��֧��');
insert into Subjects(id,name,memo) values(4,'΢��ԭ��','��΢��ԭ����һ��רҵ�����γ̣�������Ҫ���ݰ���΢�ͼ������ϵ�ṹ��8086΢��������ָ��ϵͳ�������������Լ�΢�ͼ����������ɲ��ֽ��ܵ����ݡ�');
insert into Subjects(id,name,memo) values(5,'C����','C������һ��ͨ�ü����������ԣ�Ӧ�ù㷺��C���Ե����Ŀ�����ṩһ�����Լ��׵ķ�ʽ���롢����ͼ��洢�������������Ļ������Լ�����Ҫ�κ����л���֧�ֱ������еı�����ԡ�');
insert into Subjects(id,name,memo) values(6,'���������ϵͳ','�������ִ����������ϵͳ�Ļ������ԭ���ʵ�ַ�����');
insert into Subjects(id,name,memo) values(7,'���ݽṹ','���ݽṹ�Ǽ�����洢����֯���ݵķ�ʽ�����ݽṹ��ָ�໥֮�����һ�ֻ�����ض���ϵ������Ԫ�صļ��ϡ�');
insert into Subjects(id,name,memo) values(8,'���ݿ�ϵͳԭ��','���ݿ�ϵͳԭ��');
insert into Subjects(id,name,memo) values(9,'�������','�������');
insert into Subjects(id,name,memo) values(10,'���������','���������');


use educations01;
CREATE TABLE Orders (
	OrderId int AUTO_INCREMENT PRIMARY KEY NOT NULL,		
	OrderDate datetime NULL ,	
	RequiredDate datetime NULL ,	
	ShippedDate datetime NULL ,		
	ShipAddress nvarchar (60) NULL 	
);


use educations02;
CREATE TABLE OrderDetails (
	OrderDetailId int AUTO_INCREMENT PRIMARY KEY NOT NULL,
	OrderId int NOT NULL ,	
	ProductId int NOT NULL ,	
	UnitPrice double NOT NULL DEFAULT 0,	
	Quantity smallint NOT NULL DEFAULT 1,	
	Discount double NOT NULL DEFAULT 0
);
