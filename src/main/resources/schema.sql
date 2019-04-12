-- CREATE TABLE IF NOT EXISTS `user` (id integer not null, email varchar(255) not null, username varchar(255) not null, password varchar(255) not null, primary key(id) );
CREATE TABLE IF NOT EXISTS `user` (id int, email varchar(255) , username varchar(255) , password varchar(255) , primary key(id) )
CREATE TABLE IF NOT EXISTS `post` (id int, userId varchar(255) , title varchar(255) , body varchar(255) , primary key(id) )
CREATE TABLE IF NOT EXISTS `comment` (id int, postId varchar(255), name varchar(255) , email varchar(255) , body varchar(255) , primary key(id) )
