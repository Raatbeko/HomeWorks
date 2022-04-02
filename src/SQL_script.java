

public class SQL_script {
    /*
             CREATE TABLE routes(
          id integer primary key not null,
          num_of_route varchar(50)not null unique,
          starting_point varchar(250) not null,
          end_point varchar(250) not null
          );

          CREATE TABLE buses(
          id integer primary key not null,
          num_of_bus varchar(100) not null unique,
          route_id integer references routes(id)
          );

          CREATE TABLE drivers(
          id integer primary key not null,
          full_name varchar(100) not null
          );

          CREATE TABLE drivers_buses(
          id integer primary key not null,
          driver_id integer references drivers(id),
          bus_id integer references buses(id)
          );

          CREATE TABLE  driving_data(
          id integer primary key not null,
          driver_bus integer references drivers_buses (id),
          start_of_shift timestamp not null
          );

          INSERT INTO routes
          VALUES
          (1,'203-A', 'Ашар,Ак Орго', 'Бульвар Эркиндик'),
          (2,'123', 'Байтик Баатыр', 'Манас,26'),
          (3,'168', 'Иван Мичурина', 'Киевская 195');

          INSERT INTO buses
          VALUES
          (1, 'A105BN', 2),
          (2, 'B345FK', 3),
          (3, 'J450LE', 1);

          INSERT INTO drivers
          VALUES
          (1,'Ivan Ivanovich'),
          (2,'Marat Maratov');

          INSERT INTO drivers_buses
          VALUES
          (1,1,2),
          (2,1,1),
          (3,2,3);

          INSERT INTO driving_data
              VALUES
          (1,1,'2022-06-22 08:10:25-07'),
          (2,3,'2022-07-15 07:10:34-06');
     */

}
