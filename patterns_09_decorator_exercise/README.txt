Tenemos un sistema "funcional" de base de datos construido con la clase BaseDatosMemoria.

Vuestra mision es implementar un "adapter" a la funcionalidad de base de datos (expresada en 
la interface BaseDatos) que haga uso de un logger e informe a este logger de las operaciones
realizadas.

En particular, debeis modificar el LoggerDecorator para que usando un determando logger e una 
implementacion de DataBase (ambos obtenidos en un constructor que debeis implementar) haga
lo siguiente:

- cuando recibe una invocaciona a insert(record):
   1 - guarde en el logger un mensaje "insert " + record
   2 - propage la llamada a la implementacion de base de datos obtenida en el constructor
  
- cuando recibe una invocacion a records():
   1 - guarde en el logger un mensaje "readed"
   2 - devuelva el resultado de la base de datos obtenida en el constructor a la misma llamada
  
Cuando tengais implementada la clase LoggerDecorator debereis ir al test 
test/edu/pattern/decorator/TestDataBaseWithLogger.java

y modificar el metodo init para que se asigne a la variable bbdd un LoggerDecorator con los objetos
logger y withoutLogger que ya estan creados.

Fijaos en el objetivo de la aplicacion de este pattern: poder "enriquecer" el comportamiento
de nuestra clase existente (InMemoryDataBase) sin modificar ni una linea de su codigo!