-- One to Many mapping

create table student(
ID bigint(20) not null auto_increment,
student_name varchar(256) null default null,
guide_id bigint(20) not null,
primary key (ID)
);


create table guide(
ID bigint(20) not null auto_increment,
guide_name varchar(256) null default null,
primary key (ID)
);

ALTER TABLE student
ADD CONSTRAINT stu_gde_id_fk
FOREIGN KEY (guide_id) REFERENCES guide(id);

-- Many to Many Mapping

create table movie(
id bigint(20) not null auto_increment,
movie_name varchar(256) not null,
primary key (id)
);

create table actor(
id bigint(20) not null auto_increment,
actor_name varchar(256) not null,
primary key (id)
);

create table movie_actor(
id bigint(20) not null auto_increment,
movie_id bigint(20) not null,
actor_id bigint(20) not null,
primary key (id)
);

alter table movie_actor
add constraint mv_atr_mv_fk
foreign key(movie_id) references movie(id);


alter table movie_actor
add constraint mv_atr_acr_fk
foreign key(actor_id) references actor(id);