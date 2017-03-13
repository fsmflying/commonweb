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
	 * ��ȡ��ǰ�û���״̬���京�����£�<br/>
	 * [0]:����״̬���û���������¼;<br/>
	 * [1]:��ȫ����״̬���û������Ե�¼;<br/>
	 * [2]:�涨��ʱ����ڽ��ã���DisabledTime��ʼ������DisabledMinutes����;<br/>
	 * [3]:��һ���ڵ�ʱ��ν��ã����DisabledTimeΪ"xxxx-xx-xx 23:15:00.000",DisabledMinutes=6*60=360,
	 * ����ÿ���23:15��ʼ������6��Сʱ����ֱ���ڶ���05:15;<br/>
	 * ע�⣺���stauts=3,��DisabledMinutes��ò�Ҫ����1440,��Ϊһ��Ҳֻ��1440���ӣ�������ڻ����1440�����ͬ����ȫ����;
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





 


