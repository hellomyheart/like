create database db_like;
use db_like;

-- 点赞表
create table t_like(
id int primary key auto_increment,
cid int comment '内容id',
uid int comment '用户id',
ctime datetime
)
