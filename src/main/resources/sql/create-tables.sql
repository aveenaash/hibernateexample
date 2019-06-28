create database amazon_db;
use amazon_db;


show tables;

create table category(
id bigint(10) not null auto_increment,
`name` varchar(20) not null,
`description` varchar(200),
primary key (id));

create table products(
id bigint(10) not null auto_increment,
`name` varchar(20) not null,
`description` varchar(200),
price double(10,2) not null,
category_id bigint(10) not null,
primary key (id),
foreign key (category_id) references category(id));

create table orders(
id bigint(10) not null auto_increment,
`status` varchar(10) not null,
created_at datetime not null,
primary key (id));

create table ordered_products(
id bigint(10) not null auto_increment,
product_id bigint(10) not null,
order_id bigint(10) not null,
primary key (id),
foreign key (product_id) references products(id),
foreign key (order_id) references orders(id));





