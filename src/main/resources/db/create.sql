CREATE DATABASE myorg;
\c myorg;

CREATE TABLE users(id serial PRIMARY KEY, name varchar, bio varchar, position varchar, role varchar, departmentid int);

CREATE TABLE news(id serial PRIMARY KEY, title varchar, content varchar, departmentid int);

CREATE TABLE departments(id serial PRIMARY KEY, name varchar, bio varchar);

CREATE DATABASE myorg_test WITH TEMPLATE myorg;