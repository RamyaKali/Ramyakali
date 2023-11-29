CREATE DATABASE 'ums';
use ums;
Create table users ( id int(3) NOT NULL AUTO_INCREMENT , 
name varchar(20) NOT NULL,email varchar(40) NOT NULL,password varchar(20),
mobileno varchar(30),location VARCHAR(20)
PRIMARY KEY (id)
);
