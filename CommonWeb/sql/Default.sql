use common_sequence;

use common_sysadmin;

use common_northwind;

use common_log;

use test;

use common_sequence;
select * from sys_sequences;
select * from sys_sequencehistories;

use test;
drop database common_northwind;
create database common_northwind;
use common_northwind;


use common_sysadmin;
select fileid,filename,fileAddress from sys_files;



select userid,username,userpwd,status,disabledtime,disabledminutes from sys_users;
/**
	 * 获取当前用户的状态，其含义如下：<br/>
	 * [0]:正常状态，用户可正常登录;<br/>
	 * [1]:完全禁用状态，用户不可以登录;<br/>
	 * [2]:规定的时间段内禁用，从DisabledTime开始，禁用DisabledMinutes分钟;<br/>
	 * [3]:按一天内的时间段禁用，如果DisabledTime为"xxxx-xx-xx 23:15:00.000",DisabledMinutes=6*60=360,
	 * 则在每天的23:15开始，禁用6个小时，即直到第二天05:15;<br/>
	 * 注意：如果stauts=3,则DisabledMinutes最好不要大于1440,因为一天也只有1440分钟，如果大于或等于1440，则等同于完全禁用;
	 * 
	 */
update sys_users set status=0 where userId=2;
update sys_users set status=1,disabledTime='2017-03-12 15:03:00',disabledMinutes=60 where userId=2;

update sys_users set status=2,disabledTime='2017-03-12 15:03:00',disabledMinutes=60 where userId=2;
update sys_users set status=3,disabledTime='2017-03-12 23:00:00',disabledMinutes=18*60 where userId=2;

alter table sys_users change DisabledTime DisabledTime datetime;



--getUserRoles
select b.* from sys_ruserrole a
inner join sys_roles b on a.roleid=b.roleid
where b.dbdeleted=0 and a.userid=?


--getUserTabs
select d.* from (
select distinct c.tabid from sys_ruserrole a
inner join sys_roles b on a.roleid=b.roleid
inner join sys_rroletab c on c.roleid=b.roleid
where a.userid=2 and b.dbdeleted=0
) a
inner join sys_tabs d on a.tabid=d.tabid
where 1=1  and d.dbdeleted=0 order by d.showorder;

--getUserMenus
select d.* from (
	select distinct c.menuid from sys_ruserrole a
	inner join sys_roles b on a.roleid=b.roleid
	inner join sys_rrolemenu c on c.roleid=b.roleid
	where a.userid=2 and b.dbdeleted=0
) a
inner join sys_menus d on a.menuid=d.menuid
where 1=1  and d.dbdeleted=0 order by d.showorder;


--getUserFuncPoints
select d.* from (
	select distinct c.funcpointid from sys_ruserrole a
	inner join sys_roles b on a.roleid=b.roleid
	inner join sys_rrolefuncpoint c on c.roleid=b.roleid
	where a.userid=2 and b.dbdeleted=0
) a
inner join sys_funcpoints d on a.funcpointid=d.funcpointid
where 1=1  and d.dbdeleted=0 order by d.showorder;


--getUserDataAuths
select d.* from (
	select distinct c.authid from sys_ruserrole a
	inner join sys_roles b on a.roleid=b.roleid
	inner join sys_rroledataauth c on c.roleid=b.roleid
	where a.userid=2 and b.dbdeleted=0
) a
inner join sys_dataauths d on a.authid=d.authid
where 1=1  and d.dbdeleted=0;


--getUserDataAuths
select d.* from (
	select distinct c.authitemid from sys_ruserrole a
	inner join sys_roles b on a.roleid=b.roleid
	inner join sys_rroledataauthitem c on c.roleid=b.roleid
	where a.userid=2 and b.dbdeleted=0
) a
inner join sys_dataauthitems d on a.authitemid=d.authitemid
where 1=1  and d.dbdeleted=0;


--getTabMenus
select a.* from sys_menus a inner join sys_rtabmenu b on a.menuid=b.menuid
where b.tabid=?




--查询‘修改表字段类型’的sql语句
select concat('alter table ',table_name,' change ',column_name,' ',column_name,' datetime not null;') 
from information_schema.columns 
where table_schema='common_sysadmin' and column_name in ('DbCreateTime','DbLastUpdateTime');
 
 
+-----------------------------------------------------------------------------------+
| concat('alter table ',table_name,' change ',column_name,' ',column_name,' date;') |
+-----------------------------------------------------------------------------------+
| alter table sys_companys change DbCreateTime DbCreateTime date;                   |
| alter table sys_companys change DbLastUpdateTime DbLastUpdateTime date;           |
| alter table sys_configs change DbCreateTime DbCreateTime date;                    |
| alter table sys_configs change DbLastUpdateTime DbLastUpdateTime date;            |
| alter table sys_custompages change DbCreateTime DbCreateTime date;                |
| alter table sys_custompages change DbLastUpdateTime DbLastUpdateTime date;        |
| alter table sys_dataauthitems change DbCreateTime DbCreateTime date;              |
| alter table sys_dataauthitems change DbLastUpdateTime DbLastUpdateTime date;      |
| alter table sys_dataauths change DbCreateTime DbCreateTime date;                  |
| alter table sys_dataauths change DbLastUpdateTime DbLastUpdateTime date;          |
| alter table sys_departments change DbCreateTime DbCreateTime date;                |
| alter table sys_departments change DbLastUpdateTime DbLastUpdateTime date;        |
| alter table sys_dictdirs change DbCreateTime DbCreateTime date;                   |
| alter table sys_dictdirs change DbLastUpdateTime DbLastUpdateTime date;           |
| alter table sys_dictitems change DbCreateTime DbCreateTime date;                  |
| alter table sys_dictitems change DbLastUpdateTime DbLastUpdateTime date;          |
| alter table sys_files change DbCreateTime DbCreateTime date;                      |
| alter table sys_funcpoints change DbCreateTime DbCreateTime date;                 |
| alter table sys_funcpoints change DbLastUpdateTime DbLastUpdateTime date;         |
| alter table sys_menus change DbCreateTime DbCreateTime date;                      |
| alter table sys_menus change DbLastUpdateTime DbLastUpdateTime date;              |
| alter table sys_roles change DbCreateTime DbCreateTime date;                      |
| alter table sys_roles change DbLastUpdateTime DbLastUpdateTime date;              |
| alter table sys_tabs change DbCreateTime DbCreateTime date;                       |
| alter table sys_tabs change DbLastUpdateTime DbLastUpdateTime date;               |
| alter table sys_users change DbCreateTime DbCreateTime date;                      |
| alter table sys_users change DbLastUpdateTime DbLastUpdateTime date;              |
+-----------------------------------------------------------------------------------+
27 rows in set (0.01 sec)



 alter table sys_companys change DbCreateTime DbCreateTime date not null;
 alter table sys_companys change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_configs change DbCreateTime DbCreateTime date not null;
 alter table sys_configs change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_custompages change DbCreateTime DbCreateTime date not null;
 alter table sys_custompages change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_dataauthitems change DbCreateTime DbCreateTime date not null;
 alter table sys_dataauthitems change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_dataauths change DbCreateTime DbCreateTime date not null;
 alter table sys_dataauths change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_departments change DbCreateTime DbCreateTime date not null;
 alter table sys_departments change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_dictdirs change DbCreateTime DbCreateTime date not null;
 alter table sys_dictdirs change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_dictitems change DbCreateTime DbCreateTime date not null;
 alter table sys_dictitems change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_files change DbCreateTime DbCreateTime date not null;
 alter table sys_funcpoints change DbCreateTime DbCreateTime date not null;
 alter table sys_funcpoints change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_menus change DbCreateTime DbCreateTime date not null;
 alter table sys_menus change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_roles change DbCreateTime DbCreateTime date not null;
 alter table sys_roles change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_tabs change DbCreateTime DbCreateTime date not null;
 alter table sys_tabs change DbLastUpdateTime DbLastUpdateTime date not null;
 alter table sys_users change DbCreateTime DbCreateTime date not null;
 alter table sys_users change DbLastUpdateTime DbLastUpdateTime date not null;


 
 
 select datatype from information_s
chema.columns where table_schema='common_sysadmin' and column_name in ('DbCreateTime','DbLastUpdateTime');

