# News Api
#### Java REST API 
#### By **Lorenah M.**
## Description
This is a REST API for gathering scoped news &information
## Setup/Installation Requirements
* Internet connection
* access to a browser
* fork from https://github.com/LORENAH-MBOGO/NewsAPI
## In PSQL:
* CREATE DATABASE myorg;
* \c myorg;
* CREATE TABLE users(id serial PRIMARY KEY, name varchar, bio varchar, position varchar, role varchar, departmentid int);
* CREATE TABLE news(id serial PRIMARY KEY, title varchar, content varchar, departmentid int);
* CREATE TABLE departments(id serial PRIMARY KEY, name varchar, bio varchar);
* CREATE DATABASE myorg_test WITH TEMPLATE myorg;
## Known Bugs
Deployment.
## Technologies Used
* IntelliJ IDEA
* Java
* Spark
* PostgreSql
## Support and contact details
Reach me on [lorayne911@gmail.com]
### License
Licensed by MIT
Copyright (c) 2020 **Skylar Lorenah**