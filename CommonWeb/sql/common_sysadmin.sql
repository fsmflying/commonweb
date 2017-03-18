--查询‘修改表字段类型’的sql语句
select concat('alter table ',table_name,' change ',column_name,' ',column_name,' datetime not null;') from information_s
chema.columns where table_schema='common_sysadmin' and column_name in ('DbCreateTime','DbLastUpdateTime');
+------------------------------------------------------------------------------------------------+
| concat('alter table ',table_name,' change ',column_name,' ',column_name,' datetime not null;') |
+------------------------------------------------------------------------------------------------+
| alter table sys_companys change DbCreateTime DbCreateTime datetime not null;                   |
| alter table sys_companys change DbLastUpdateTime DbLastUpdateTime datetime not null;           |
| alter table sys_configs change DbCreateTime DbCreateTime datetime not null;                    |
| alter table sys_configs change DbLastUpdateTime DbLastUpdateTime datetime not null;            |
| alter table sys_custompages change DbCreateTime DbCreateTime datetime not null;                |
| alter table sys_custompages change DbLastUpdateTime DbLastUpdateTime datetime not null;        |
| alter table sys_dataauthitems change DbCreateTime DbCreateTime datetime not null;              |
| alter table sys_dataauthitems change DbLastUpdateTime DbLastUpdateTime datetime not null;      |
| alter table sys_dataauths change DbCreateTime DbCreateTime datetime not null;                  |
| alter table sys_dataauths change DbLastUpdateTime DbLastUpdateTime datetime not null;          |
| alter table sys_departments change DbCreateTime DbCreateTime datetime not null;                |
| alter table sys_departments change DbLastUpdateTime DbLastUpdateTime datetime not null;        |
| alter table sys_dictdirs change DbCreateTime DbCreateTime datetime not null;                   |
| alter table sys_dictdirs change DbLastUpdateTime DbLastUpdateTime datetime not null;           |
| alter table sys_dictitems change DbCreateTime DbCreateTime datetime not null;                  |
| alter table sys_dictitems change DbLastUpdateTime DbLastUpdateTime datetime not null;          |
| alter table sys_files change DbCreateTime DbCreateTime datetime not null;                      |
| alter table sys_funcpoints change DbCreateTime DbCreateTime datetime not null;                 |
| alter table sys_funcpoints change DbLastUpdateTime DbLastUpdateTime datetime not null;         |
| alter table sys_menus change DbCreateTime DbCreateTime datetime not null;                      |
| alter table sys_menus change DbLastUpdateTime DbLastUpdateTime datetime not null;              |
| alter table sys_roles change DbCreateTime DbCreateTime datetime not null;                      |
| alter table sys_roles change DbLastUpdateTime DbLastUpdateTime datetime not null;              |
| alter table sys_tabs change DbCreateTime DbCreateTime datetime not null;                       |
| alter table sys_tabs change DbLastUpdateTime DbLastUpdateTime datetime not null;               |
| alter table sys_users change DbCreateTime DbCreateTime datetime not null;                      |
| alter table sys_users change DbLastUpdateTime DbLastUpdateTime datetime not null;              |
+------------------------------------------------------------------------------------------------+
27 rows in set (0.01 sec)


select concat('alter table ',table_name,' change ',column_name,' ',column_name,' datetime not null;') from information_s
chema.columns where table_schema='common_sysadmin' and data_type='date';


