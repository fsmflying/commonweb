��ʾ�ֲ�ʽ����(JTA)
ʹ�ã�springmvc4 + springframework4 + hibernate 4.3.11 + atomikos 3.9.3

ʹ�õ����ݿ���common_sysadmin,common_sequence,common_log

����bean��4��

��ѯ�����õ�SQL������£�

select * from common_sequence.sys_sequences;

select * from common_sequence.sys_sequenceHistories where keyName='default' 
order by generatedTime desc
limit 0,10;

select message from common_log.sys_logs order by operationTime desc limit 0,10;
select userId,username,nickname,lastLoginTime from common_sysadmin.sys_users;














