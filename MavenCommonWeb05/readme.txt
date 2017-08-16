分布式事务(JTA)
演示springmvc4 + springframework4 + hibernate 4.3.11 + atomikos 3.9.3

使用了数据源common_sysadmin,common_sequence,common_log

常用的SQL语句
select * from common_sequence.sys_sequences;
select * from common_sequence.sys_sequenceHistories where keyName='default' 
order by generatedTime desc
limit 0,10;

select message from common_log.sys_logs order by operationTime desc limit 0,10;
select userId,username,nickname,lastLoginTime from common_sysadmin.sys_users;














