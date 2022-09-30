create database entries;
use entries;
create table tour_package(
package_id varchar(25),
source_place varchar(25),
destin_place varchar(25),
basic_fare double
);
desc tour_package;
select* from tour_package;
/*insert into tour_package values ('123/CG/','Chennai' , 15000, 'Goa');
insert into tour_package values ('123/MB/','Mumbai' , 17000, 'Bangalore');
insert into tour_package values ('123/NP/','Nagpur' , 25000, 'Pune');
insert into tour_package values ('123/DK/','Delhi' , 30000, 'Kolkata');*/