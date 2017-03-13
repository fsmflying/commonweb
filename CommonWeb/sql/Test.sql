
--drop table test_person;
create table test_person(
	id int(20) primary key auto_increment not null,
	name varchar(64) not null,
	birthDate date,
	birthTime time,
	createtime datetime,
	weight double
	
);

