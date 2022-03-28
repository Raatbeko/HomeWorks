import dao.RoleDao;
import dao.UserDao;
import dao.UserLogsDao;
import dao.impl.RoleDaoImpl;
import dao.impl.UserDaoImpl;
import dao.impl.UserLogsDaoImpl;
import entity.Role;
import entity.User;
import enums.Roles;
import lombok.Builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserLogsDao userLogsDao = new UserLogsDaoImpl();
        UserDao userDao = new UserDaoImpl();
        userDao.insert(new User("name","name","name", LocalDateTime.now(),"USER"));
    }
    /*
    CREATE TABLE public.users (
	user_id serial4 NOT NULL,
	user_name varchar(100) NOT NULL,
	e_mail varchar(100) NOT NULL,
	"password" varchar(50) NOT NULL,
	data_of_registration timestamp NOT NULL,
	is_blocked bool NULL,
	CONSTRAINT users_e_mail_key UNIQUE (e_mail),
	CONSTRAINT users_pkey PRIMARY KEY (user_id),
	CONSTRAINT users_user_name_key UNIQUE (user_name)
);
    create table user_logs(
    id integer primary key not null,
    user_id integer references users(user_id),
    results varchar(50) not null
);
    create table address(
    id integer primary key not null,
    address varchar()
);
    create table events_type(
    id integer primary key not null,
    event_type varchar(100) unique not null
);

    create table roles(
    id integer primary key not null,
    role varchar not null unique
);

   alter table users
   add column role integer references roles(id);

   create table events(
   id integer primary key not null,
   user_id integer references users(user_id),
   event_type integer references events_type(id),
   img text not null,
   comment text,
   role_id integer references roles (id),
   count_place integer not null,
   price integer ,
   address integer references
);
     */

}
