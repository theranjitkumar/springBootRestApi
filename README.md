# spring Boot Rest Api

###	h2db url: http://localhost:8080/h2
###	api url: http://localhost:8080/api/users

### got to http://localhost:8080/h2-console/

	To manage  inmemory sql database

### create user to login:

	create table user
	(
	id integer not null,
	username varchar(255) not null,
	email varchar(255) not null,
	password varchar(255) not null,
	primary key(id)
	);

###	insert a dummy user data:

	insert into user values(101, "test@email.com", "test", "test" );

###	maven cmd
	To run:     ./mvnw spring-boot:run
	To clean:   ./mvnw clean
	To package: ./mvnw clean package
