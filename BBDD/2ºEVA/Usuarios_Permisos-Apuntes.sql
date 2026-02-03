/*CREAR USUARIO*/
create user nombresUsuario
    IDENTIFIED BY 'contraseña';

/*MODIFICAR USUARIO*/
alter user nombresUsuario
    IDENTIFIED BY 'contraseña';

/*ELIMINAR USUARIO*/
drop USER nombreUsuario;


/*--------------------------------*/

/*DAR TODOS LOS PERMISOS EN UNA BD*/
GRANT ALL PRIVILEGES ON nombreBaseDatos.*
    TO nombresUsuario@HOST;

/*DAR PERMISOS SOBRE UNA TABLA*/
GRANT SELECT, INSERT, UPDATE, DELETE
    ON nombresBaseDatos.nombreTabla
    to nombreUsuario@HOST;
/*EJEMPLO:
    grant insert, select
    on institutodam.alumnos
    to ana@localhost;*/

/*CONCEDER PERMISOS EN TODAS LAS BASE DE DATOS*/
GRANT SELECT, DELETE
    ON *.*
    to nombreUsuario@HOST;

/*VER PERMISOS DE UN USUARIO*/
SHOW GRANT FOR nombreUsuario@HOST;

/*ELIMINAR PERMISOS DE UN USUARIO*/
REVOKE all on nombreBaseDatos
    FROM nombresUsuario@HOST;

/*DELEGAR PERMISOS(QUE OTRO USUARIO PUEDA DAR PERMISOS A OTROS USUARIO)*/

GRANT SELECT, INSERT
    on nombresBaseDatos.nombreTabla
    to nombreUsuario@HOST
    WITH GRANT OPTION;