   drop table bodega;
   drop table comuna;
   drop table producto;
   drop table region;
   drop table bodega_producto;

    
    create table bodega (
       id integer not null,
        nombre varchar,
        primary key (id)
    );
    
    create table comuna (
       id integer not null,
        nombre varchar,       
        primary key (id)
    );
    
     create table producto (
       id integer not null,
        nombre varchar,
        primary key (id)
    );
    
    create table region (
       id integer not null,
        nombre varchar,
        primary key (id)
    );
    
    create table bodega_producto (
       id integer not null,
       id_bodega  int,
       id_producto int,
       id_region int,
       id_comuna int,
        primary key (id)
    );
       