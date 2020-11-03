insert into region (id, nombre) values(1,'REGION DE TARAPACA');
insert into region (id, nombre) values(2,'REGION DE ANTOFAGASTA');
insert into region (id, nombre) values(3,'REGION DE ATACAMA');
insert into region (id, nombre) values(4,'REGION DE COQUIMBO');
insert into region (id, nombre) values(5,'REGION DE VALPARAISO');
insert into region (id, nombre) values(6,'REGION DEL LIBERTADOR BERNARDO OHIGGINS');
insert into region (id, nombre) values(7,'REGION DEL MAULE');
insert into region (id, nombre) values(8,'REGION DEL BIO-BIO');
insert into region (id, nombre) values(9,'REGION DE LA ARAUCANIA');
insert into region (id, nombre) values(10,'REGION DE LOS LAGOS');
insert into region (id, nombre) values(11,'REGION AYSEN DEL GENERAL CARLOS IBANEZ DEL CAMPO');
insert into region (id, nombre) values(12,'REGION DE MAGALLANES Y LA ANTARCTICA CHILENA');
insert into region (id, nombre) values(13,'REGION METROPOLITANA');
insert into region (id, nombre) values(14,'REGION DE LOS RIOS');
insert into region (id, nombre) values(15,'REGION DE ARICA Y PARINACOTA');

insert into comuna(id,nombre) values(1,'ARICA');
insert into comuna(id,nombre) values(2,'CAMARONES');
insert into comuna(id,nombre) values(3,'PUTRE');
insert into comuna(id,nombre) values(4,'GENERAL LAGOS');
insert into comuna(id,nombre) values(5,'IQUIQUE');
insert into comuna(id,nombre) values(6,'ALTO HOSPICIIO');
insert into comuna(id,nombre) values(7,'HUARA');
insert into comuna(id,nombre) values(8,'CAMIÑA');


insert into bodega(id,nombre) values (1, 'Bodega 1');
insert into bodega(id,nombre) values (2, 'Bodega 2');
insert into bodega(id,nombre) values (3, 'Bodega 3');


insert into producto( nombre) values ('Zapato 1');
insert into producto( nombre) values ('Zapato 2');
insert into producto( nombre) values ('Zapato 3');
insert into producto( nombre) values ('Zapato 4');

insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (1,1,1,1);
insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (1,2,1,1);
insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (2,2,2,1);
insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (2,1,1,1);
insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (3,1,1,1);
insert into bodega_producto(id_producto, id_bodega, id_region, id_comuna ) values (3,3,1,1);
                           


