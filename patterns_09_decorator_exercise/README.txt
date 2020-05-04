We have a "functional" database system built with the InMemoryDataBase class.

Your mission is to implement an "adapter" to the database functionality (expressed in
the DataBase interface) that makes use of a logger and informs this logger of the operations
made.

In particular, you must modify the LoggerDecorator so that using a certain logger and a
DataBase implementation (both obtained in a constructor that you must implement) do
the following:

- when you receive an invocation to insert (record):
   1 - save a message "insert" + record in the logger
   2 - propagate the call to the database implementation obtained in the constructor
  
- when you receive an invocation to records ():
   1 - save a "read" message in the logger
   2 - return the result of the obtained database in the constructor to the same call
  
When you have implemented the LoggerDecorator class you should go to the test
test / edu / pattern / decorator / TestDataBaseWithLogger.java

and modify the init method so that the bbdd variable is assigned a LoggerDecorator with the objects
logger and withoutLogger that are already created.

Look at the objective of applying this pattern: to "enrich" the behavior
of our existing class (InMemoryDataBase) without modifying a single line of its code!
