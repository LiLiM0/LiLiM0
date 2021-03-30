use coursebs;
drop table if exists `test`;
create table `test`(
                       `id` char (8) not null default '' comment 'id',
                       `name` varchar(50) comment '名称',
                       primary  key (`id`)
) engine = innodb default charset=utf8mb4 comment = '测试';

insert into `test` (id, name) value (1,'测试1');
insert into `test` (id, name) value (2,'测试2');