# PROYECTO 1ºEVALUACION PSP

## DESCRIPCIÓN

Tenemos 2 proyectos dentro del repositorio:

1. En el primero llamado **ProyectoPSP1EV** se trata de una aplicación que pedirá al usuario el número de registros a insertar en una bbdd y el número de hilos con los que queremos ejecutar la aplicación. La carga de trabajo se repartirá entre todos los hilos de forma equitativa y mostrará por consola el nombre de el hilo ejecutor así como los valores de email y salario insertados en la bbdd. Estos valores se generarán de forma aleatoria para cada registro siendo el valor del salario un número comprandido entre 10 y 1000.

2. En el segundo llamado **ProyectoPSP21EV** se trata de una aplicación en la que el usuario podra elegir entre hacer una lectura secuencial de los registros de una bbdd o una lectura de 5 hilos concurrentes. El programa hará una suma total del campo ingresos, sumando de forma secuencial cada registro de ingresos de la bbdd y lo mostrará por consola. Del mismo modo calculará el tiempo de ejecución de la operación en cada caso mostrándola del mismo modo.

Los parámetros estarán contenidos en un archivo properties dentro de cada proyecto

## REQUISITOS

+ Los jar dentro de los proyectos están compilados con una JDK javaSe-v1.8, el ide utilizado para realizar el proyecto es eclipse
+ Se deberá tener creada una bbdd mySQL cuyos parámetros de conexión en un servidor local serán:

servidor=jdbc:mysql://localhost/bbdd_psp_1
user=DAM2020_PSP
pass=DAM2020_PSP

+ La bbdd deberá contener la tabla empleados y deberá estar compuesta por un campo ID de tipo int autoincremental, un campo EMAIL de tipo varchar(100) y un campo INGRESOS int

## PASOS PARA CLONAR EL PROYECTO

1. Descargar la consola de git desde la siguiente url: (https://git-scm.com/downloads), y la abrimos.

2. Escribir en la consola:
 
git clone https://github.com/Jonatandlfuente/ProyectoPSP1EV.git

Con eso clonará el repositorio en una carpeta local


## EJECUCIÓN Y DEPENDENCIAS

1. Si ejecutamos desde un ide:

   1.  Para ejecutar cada uno de los proyectos se deberá ejecutar la clase ** Main ** que se encuentra en el paquete controllers en cada proyecto. Si se utiliza un gestor de dependencias se necesitará el archivo **MySQL Connector/J** que se podrá descargar en el enlace (https://mvnrepository.com/artifact/mysql/mysql-connector-java.) O bien, si no usamos un gestor de dependencias, el archivo se encontrará físicamente en la carpeta ** lib ** de cada uno de los proyectos. 

   2. Bastaría con enlazarlo. En el caso de Eclipse, nos iríamos al proyecto, botón derecho Properties -> Java build path, ahí seleccionamos el conector que tenemos y pulsamos remove para eliminarlo. Para insertarlo en la ruta correcta pulsamos Add External JARs.. y dentro de la carpeta lib seleccionamos el archivo conector, para enlazar el ide con la bbdd mySql.

2. Para ejecutar el .jar

    * Desde Windows. Abrimos la consola win+R y escribimos cmd, nos vamos a la carpeta raiz donde se encuentra el jar dentro de cada proyecto y escribimos "java -jar ProyectoPSP1EV.jar" sin las comillas para el primer programa y  "java -jar ProyectoPSP21EV.jar" para el segundo.

    * Desde Linux. Abra un símbolo del sistema con CTRL + ALT + T. Vaya a su directorio de archivos ".jar". Si su versión de Ubuntu lo admite, debería poder hacer clic derecho en el directorio de su archivo ".jar" y hacer clic en "Abrir en la Terminal", por último escribir como en el caso de windows "java -jar ProyectoPSP1EV.jar" sin las comillas para el primer programa y  "java -jar ProyectoPSP21EV.jar" para el segundo.


## APUNTES FINALES

Son un par de sencillos programas para poder tener un primer contacto con un ejemplo de funcionamiento de hilos muy sencillo e intuitivo.

## COPIRIGHT

Copyright [Jonatan de la Fuente Carques]

Licenciado bajo la Licencia Apache, Versión 2.0 (la "Licencia");
no puede usar este archivo excepto en cumplimiento con la Licencia.
Puede obtener una copia de la Licencia en

    http://www.apache.org/licenses/LICENSE-2.0

A menos que lo exija la ley aplicable o se acuerde por escrito, el software
distribuido bajo la Licencia se distribuye "TAL CUAL",
SIN GARANTÍAS O CONDICIONES DE NINGÚN TIPO, ya sea expresa o implícita.
Consulte la Licencia para ver los permisos de idioma específicos y limitaciones bajo la Licencia. 
