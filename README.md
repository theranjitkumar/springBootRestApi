# spring Boot Web App 
<a href="https://springmvc-app-ranjit.herokuapp.com/">Go live</a>

### got to h2-console:

<a href="https://springmvc-app-ranjit.herokuapp.com/h2-console/"> h2-console </a>

To manage  inmemory sql database

### api's:
api url: <a href="https://springmvc-app-ranjit.herokuapp.com/api/users">/api/users</a>

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
