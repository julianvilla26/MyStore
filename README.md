# Resumen de codificaion
Proyecto de automatizacion realizado para ejecutar pruebas de:
-Creación de usuario
-Pruebas a la funcionalidad compra producto

#*El framework
Se utiliza como framework principal Selenium en su ultima version 3.14.0, Selenium proporciona una herramienta de reproducción para la creación de pruebas 
sin la necesidad de aprender un lenguaje de scripting de prueba (Selenium IDE). También proporciona un lenguaje específico de dominio de prueba (Selenese) 
para escribir pruebas en varios lenguajes de programación populares, como C #, Groovy, Java, Perl, PHP, Python, Ruby y Scala. Las pruebas se pueden ejecutar 
en la mayoría de los navegadores web modernos. Selenium se implementa en plataformas Windows, Linux y macOS. Es un software de código abierto, publicado bajo 
la licencia Apache 2.0: los desarrolladores web pueden descargarlo y usarlo sin costo.

Tambien se utiliza JUnit en su version que nos permite realizar la ejecución de clases Java de manera controlada, para poder evaluar si el funcionamiento 
de cada uno de los métodos de la clase se comporta como se espera.

#*Compilador 
Se utiliza como compilador el Java SE Development Kit 8, El JDK incluye una JVM privada y algunos otros recursos para finalizar el desarrollo
de una aplicación Java.

#*Prácticas de automatización
La practica de automatizacion que se utiliza es:

Screenplay: Es un modelo centrado en el usuario, que lo ayuda a cambiar el enfoque de las pruebas de aceptación automatizadas de interacciones de bajo nivel
con el sistema, es lo que quieren lograr con su interacción con su sistema y cómo exactamente lo van a hacer. Se utiliza esta practica por que es muy buena
y amigable con los principios SOLID, ademas de esto integra el negocio con el codigo y es mucho mas facil de entender, y su implementacion con DevOps tiene mucha
simpatia.

Serenity BDD: Es una biblioteca de informes de código abierto que nos ayuda a escribir criterios de aceptación automatizados mejor estructurados y más sostenibles,
y también produce informes de pruebas valiosos y significativos que no solo informan sobre los resultados de las pruebas. pero también qué características han sido evaluadas.

#*Herramienta de automatización utilizado

*Selenium
*JUnit
*Serenity BDD
*ScreenPlay
*Cucumber

#*Estrategia de automatización

Se utiliza el modelo de diseño Screenplay pero ademas de esto. Se implementan practicas de desarrollo para darle un mejor manejo al codigo, y sea mas legible.

#*Aplicación que se esta probando

Se esta probando la aplicación My Store, la aplicación permite la creación de usuarios, a demas de compras online.

#*El navegador y la versión utilizada

Google Chrome Versión 75.0.3770.90 (Build oficial) (64 bits)

#*Comandos especificos para ejecucion

gradle clean test --test *NombreClaseRunner aggregate --info
* Esta linea de codigo se ejecutó por CMD para generar el index (informe generado por serenity)

#*Informacion necesaria para que una persona ingrese y conozca el funcionamiento de la automatizacion

-Lo mas importante es saber que en el feature esta solo la informacion importante para el usuario.

-Desde el proyecto estamos probando que las funcionalidades crear usuario y compra producto.