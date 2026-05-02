create table customers(
	cust_id serial primary key,
	cust_name varchar(10) Not Null
);

create table ordres(
	order_id serial primary key,
	ord_date date not null,
	price numeric not null,
	cust_id integer not null,
	foreign key (cust_id) refrences 
	customers (cust_id) 
);