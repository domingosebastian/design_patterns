In this exercise we want that the users of the class TextProcessor, 
who don't not need the functionality to correct texts, 
don’t have any dependency on the Language type.

To do this, you must decompose the functionality of the class ProcessorText in two interfaces, 
one simple (with the add() and text() methods) and another more "complex" with functionality for correction.

Once decomposed, adapt the test to see that each one can use the type that it needs 
(i.e. the simple_test shouldn't need the Language type).
