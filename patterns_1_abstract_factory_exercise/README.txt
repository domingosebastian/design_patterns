Our system needs to access different messages in different languages.

To do this we have assembled a system of interfaces for each set of related messages, 
and classes that implement them for each language. Classes have a suffix that indicates 
the language (‘en’ (English) and ‘es’ (Spanish), for now, although we plan to expand it).

If you look at it, you will see that for each test, classes have to be instantiated 
for each language and for each set of messages.

We want to group the decision of which language to use in a single invocation of an abstract factory.
Create this abstract factory, with an implementation for 'en' and another for ‘es’ and then 
adapt the test to use this factory.

The result must be that the test is passed, but also that each method should ‘decide’ 
only once what language to use (now it’s done twice, once for each class).