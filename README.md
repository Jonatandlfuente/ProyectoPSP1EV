#PROYECTO 1�EVALUACION PSP

##DESCRIPCI�N

Tenemos 2 proyectos dentro del repositorio:

1. En el primero llamado ** ProyectoPSP1EV ** se trata de una aplicaci�n que pedir� al usuario el n�mero de registros a insertar en una bbdd y el n�mero de hilos con los que queremos ejecutar la aplicaci�n. La carga de trabajo se repartir� entre todos los hilos de forma equitativa y mostrar� por consola el nombre de el hilo ejecutor as� como los valores de email y salario insertados en la bbdd. Estos valores se generar�n de forma aleatoria para cada registro siendo el valor del salario un n�mero comprandido entre 10 y 1000.

2. En el segundo llamado ** ProyectoPSP21EV ** se trata de una aplicaci�n en la que el usuario podra elegir entre hacer una lectura secuencial de los registros de una bbdd o una lectura de 5 hilos concurrentes. El programa har� una suma total del campo ingresos, sumando de forma secuencial cada registro de ingresos de la bbdd y lo mostrar� por consola. Del mismo modo calcular� el tiempo de ejecuci�n de la operaci�n en cada caso mostr�ndola del mismo modo.

##REQUISITOS

Los jar dentro de los proyectos est�n compilados con una JDK javaSe-v1.8, el ide utilizado para realizar el proyecto es eclipse

##PASOS PARA CLONAR EL PROYECTO

1. Descargar la consola de git desde la siguiente url: (https://git-scm.com/downloads), y la abrimos.

2. Escribir en la consola:
 
git clone https://github.com/Jonatandlfuente/ProyectoPSP1EV.git

Con eso clonar� el repositorio en una carpeta local


##EJECUCI�N Y DEPENDENCIAS

1. Si ejecutamos desde un ide:

1.  Para ejecutar cada uno de los proyectos se deber� ejecutar la clase ** Main ** que se encuentra en el paquete controllers en cada proyecto. Si se utiliza un gestor de dependencias se necesitar� el archivo ** MySQL Connector/J ** que se podr� descargar en el enlace (https://mvnrepository.com/artifact/mysql/mysql-connector-java.) O bien, si no usamos un gestor de dependencias, el archivo se encontrar� f�sicamente en la carpeta ** lib ** de cada uno de los proyectos. 

2. Bastar�a con enlazarlo. En el caso de Eclipse, nos ir�amos al proyecto, bot�n derecho Properties -> Java build path, ah� seleccionamos el conector que tenemos y pulsamos remove para eliminarlo. Para insertarlo en la ruta correcta pulsamos Add External JARs.. y dentro de la carpeta lib seleccionamos el archivo conector, para enlazar el ide con la bbdd mySql.

2. Para ejecutar el .jar

1. Desde Windows. Abrimos la consola win+R y escribimos cmd, nos vamos a la carpeta raiz donde se encuentra el jar dentro de cada proyecto y escribimos "java -jar ProyectoPSP1EV.jar" sin las comillas para el primer programa y  "java -jar ProyectoPSP21EV.jar" para el segundo.

2. Desde Linux. Abra un s�mbolo del sistema con CTRL + ALT + T. Vaya a su directorio de archivos ".jar". Si su versi�n de Ubuntu lo admite, deber�a poder hacer clic derecho en el directorio de su archivo ".jar" y hacer clic en "Abrir en la Terminal", por �ltimo escribir como en el caso de windows "java -jar ProyectoPSP1EV.jar" sin las comillas para el primer programa y  "java -jar ProyectoPSP21EV.jar" para el segundo.


##APUNTES FINALES

Son un par de sencillos programas para poder tener un primer contacto con un ejemplo de funcionamiento de hilos muy sencillo e intuitivo.

Copyright [Jonatan de la Fuente Carques]

Licenciado bajo la Licencia Apache, Versi�n 2.0 (la "Licencia");
no puede usar este archivo excepto en cumplimiento con la Licencia.
Puede obtener una copia de la Licencia en

    http://www.apache.org/licenses/LICENSE-2.0

A menos que lo exija la ley aplicable o se acuerde por escrito, el software
distribuido bajo la Licencia se distribuye "TAL CUAL",
SIN GARANT�AS O CONDICIONES DE NING�N TIPO, ya sea expresa o impl�cita.
Consulte la Licencia para ver los permisos de idioma espec�ficos y limitaciones bajo la Licencia. 