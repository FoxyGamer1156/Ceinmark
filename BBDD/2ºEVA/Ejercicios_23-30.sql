use institutodam;
create user profesorDAM@localhost
	identified by 'dam123';

create user alumno1@localhost
	identified by	'a1';
create user alumno2@localhost
	identified by 'a2';
create user alumno3@localhost
	identified by 'a3';
    
grant insert
	on institutodam.cursos
    to alumno1@localhost;
    
grant select, insert, update, delete
	on institutodam.cursos
    to alumno2@localhost;

grant select
	on institutodam.alumnos
    to alumno3@localhost;

grant select
	on institutodam.módulos
    to	profesorDAM@localhost
    with grant option;
    
show grants for alumno2@localhost;

revoke all on institutodam.cursos from alumno2@localhost;-- EL FROM ES CORRECTO
    
drop user alumno3@localhost;
