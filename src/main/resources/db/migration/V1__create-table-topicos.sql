create table TBtopicos(
   id bigint not null auto_increment,
   titulo varchar(50) not null,
   mensaje varchar(50) not null,
   usuario varchar(50) not null,


   primary key(id)
);