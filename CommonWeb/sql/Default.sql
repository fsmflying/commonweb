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

