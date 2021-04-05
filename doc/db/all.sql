# use coursebs;
drop table if exists `chapter`;
create table `chapter`(
`id` char(8) not null comment 'ID',
`course_id` char(8) comment '课程ID',
`name`varchar (50) comment '名称',
primary key (`id`)
)engine = innodb default charset=utf8mb4 comment = '大章';

insert into `chapter` (id, course_id, name) values ('00000001','00000000','测试大章01');
insert into `chapter` (id, course_id, name) values ('00000002','00000000','测试大章02');
insert into `chapter` (id, course_id, name) values ('00000003','00000000','测试大章03');
insert into `chapter` (id, course_id, name) values ('00000004','00000000','测试大章04');
insert into `chapter` (id, course_id, name) values ('00000005','00000000','测试大章05');
insert into `chapter` (id, course_id, name) values ('00000006','00000000','测试大章06');
insert into `chapter` (id, course_id, name) values ('00000007','00000000','测试大章07');
insert into `chapter` (id, course_id, name) values ('00000008','00000000','测试大章08');
insert into `chapter` (id, course_id, name) values ('00000009','00000000','测试大章09');
insert into `chapter` (id, course_id, name) values ('00000010','00000000','测试大章10');
insert into `chapter` (id, course_id, name) values ('00000011','00000000','测试大章11');
insert into `chapter` (id, course_id, name) values ('00000012','00000000','测试大章12');
insert into `chapter` (id, course_id, name) values ('00000013','00000000','测试大章13');
insert into `chapter` (id, course_id, name) values ('00000014','00000000','测试大章14');
insert into `chapter` (id, course_id, name) values ('00000015','00000000','测试大章15');


# 小节
drop table if exists `section`;
create table `section`(
`id` char(8) not null default '' comment 'id',
`title` varchar (50) not null comment '标题',
`course_id` char (8)  comment '课程|course.id',
`chapter_id` char (8)  comment '大章|chapter.id',
`video` varchar (200)  comment '视频',
`time` int comment '时长|单位秒',
`charge` char (1) comment '收费|c 收费; f 免费',
`sort` int comment '顺序',
`created_at` datetime (3) comment '创建时间',
`updated_at` datetime (3) comment '修改时间',
primary key (`id`)
)engine = innodb default charset=utf8mb4 comment = '小节';

insert into `section` (id, title, course_id,chapter_id,video,time,charge,sort,created_at,updated_at)
values ('00000001','测试小节1','00000001','00000000','',500,'F',1,now(),now());



# 测试
drop table if exists `test`;
create table `test`(
                       `id` char (8) not null default '' comment 'id',
                       `name` varchar(50) comment '名称',
                       primary  key (`id`)
) engine = innodb default charset=utf8mb4 comment = '测试';

insert into `test` (id, name) value (1,'测试1');
insert into `test` (id, name) value (2,'测试2');