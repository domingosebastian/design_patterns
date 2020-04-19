In this exercise you have a "complicated" project to improve according to the Dependency Inversion Principle.

This project manages a set of stores, each with its own inventory. 
The crucial part of the application is an algorithm that we have invented that determines when 
it is necessary to restock a product in the store.

In src there are two packages edu.solid.dip.business, with the rules of the business that are going to
make us millionaires, and edu.solid.dip.bbdd, with the code of infrastructure that we need to access the databases.

Currently the business package has a dependency on the bbdd package, since the StockController needs to know
 what the current stock is in a store, and this is done by the StockRepository.

Your task:

Make the business package so that it doesn’t have a dependency on the bbdd package.
Create an interface in the "business" package that captures what is needed from the inventory logic
 and make the StockController expressed by this interface.

With these changes the test should work without modifying anything!