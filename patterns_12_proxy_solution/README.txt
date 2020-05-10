Our banking system has a basic Account interface.

This allows it to have the name and balance of the client, as well allowing a
new transaction to be made.

The basic implementation is NormalAccount.

Now we want to create a new type of account that DOES NOT allow a negative balance, or overdraft. 
Without modifying the NormalAccount, you have to create a new interface that offers the same API (Account interface)
 and delegate the calls received to the NormalAccount except, and here is the task, unless the requested transaction
would leave the account with a negative balance. 

If this was case the transaction should not be performed (a more realistic case would probably throw an exception,
   but here we won't).

It is important that the new class that you create uses a NormalAccount to delegate the calls. Now
the class is very simple, but some methods are supposed to be complicated in the future and
we don't want to duplicate code.

Once you have the class, modify the test test_new_account from TestAccounts so that in
instead of using a NormalAccount class it uses your new class.
