Exercise for the OCP principle

You have built a Prime Generator class with a prime method that returns 
the prime numbers between 2 and the indicated number.

Modify the structure so that the PrimeNumberGenerator class is closed to changes, 
but open to extension. And what extension do we have planned?

We want to make it easy to create subclasses of PrimeNumberGenerator that allow different sorting  of the returned list.

You have a test class that performs two tests: test_natural_order and test_reverse_order

The original class (PrimeNumberGenerator) passes the test_natural_order.

You must perform three steps:
1 - Modify the PrimeNumberGenerator class to allow subclasses with specific sorting
2 - Create a subclass of PrimeNumberGenerator that returns the list of prime numbers ​​from smallest to greatest
3 - Adapt the test so that test_reverse_order uses this new class

-------------------------------
Do not look for "show off" in the use of the API. It is not necessary to do it all in one line ;-)
Try to make the result code illustrate the principle in the best way possible.
