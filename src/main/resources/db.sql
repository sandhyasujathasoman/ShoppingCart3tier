create table User (
		id varchar(50) not null,
        username varchar(20) not null,
        password varchar(20) not null,
		roles varchar(20) not null,
		primary key (username)
    );
create table Role (
		id varchar(50) not null,
        name varchar(20) not null,
		primary key (id)
    );
create table Products (
        id varchar(20) not null,
		name varchar(255) not null,
		price double precision not null,
        pictureUrl varchar(255),        
        primary key (id)
    );
create table Orders (
        id varchar(50) not null,
		dateCreated datetime not null,
		status varchar(128) not null,
        primary key (id)
    );	

	

 
---------------------------------------
insert into User (id,username, password, roles)
values (1,'employee1', 123', 'EMPLOYEE');

insert into User (id,username, password, roles)
values (1,'employee2', 123', 'EMPLOYEE');

----------------

insert into Role (id,name)
values (1, 'EMPLOYEE');.


insert into Role (id,name)
values (2, 'MANAGER');

----------------

insert into products (id, name, price,pictureUrl)
values (1, 'TV Set', 300.00, "http://uhfnocturne.com/wp-content/uploads/2017/09/aj.jpg" );
 
insert into products (id, name, price,pictureUrl)
values (2, 'Game Console', 200.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWuxnRzKBxvYij-dFDcN_Iukub3cMLZ8BaYFDn3FdoQhe1bzn2OQ");
insert into products (id, name, price,pictureUrl)
values (3, 'Sofa', 100.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT69jwGxxDVqH051qPD52ETRdsUehfk42OxzpknOL4VztIn4K6d" );
insert into products (id, name, price,pictureUrl)
values (4, 'Icecream', 5.00, "https://images.pexels.com/photos/1362534/pexels-photo-1362534.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" );
 
insert into products (id, name, price,pictureUrl)
values (5, 'Beer', 3.00, "https://www.ultraliquors.co.za/images/cooldrinks/beer-at-ultraliquors.jpg" );
insert into products (id, name, price,pictureUrl)
values (6, 'Phone', 500.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-SoYatNte-P5rgz9qyFTSCM2t0RBIrLrmWckENY5f3_GKher4" );
insert into products (id, name, price,pictureUrl)
values (7, 'Watch', 30.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzF66AY63iQHD83VlPoGGFnuL0LYFdXqFrS_t_KLFC0ipjYJGCRg" );
 
insert into products (id, name, price,pictureUrl)
values (8, 'Shoe', 15.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiH_zybxAk5-cCTYgodJttedRv7Y_V5Gb2qX2OqOfWIlWZQfC5");
 
insert into products (id, name, price,pictureUrl)
values (9, 'Clock', 50.00, "https://cdn.shopify.com/s/files/1/1256/7113/products/04June2019-CliMET-6_600.jpg?v=1560163205" );



