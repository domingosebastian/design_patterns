Our application has different players from the same team, each with their class:
Player1, Player2 and Player3

Each player, among other things, has a draw () method that returns a String showing
their strip.

All the players share an identical strip except for the number, in the central part.

You can run the Main class to see how the three strips are shown per
console.

The objective of the exercise is to avoid a problem that we have with the use of memory:
we want to use the flyweight pattern to avoid having a copy of each strip.

The strategy we'll use will be to create a T-shirt class with a T-shirt "template",
using a "placeholder" instead of the number: p.e. "X"

This class must be able to paint any strip by substituting the corresponding number for X
(For simplicity, we will assume that you do not need to process two-digit numbers)

Each player will have a reference to this strip and must remove the variable strip itself.

To implement the draw method, the reference to T-shirt will be used passing as "context" its particular number.

The result of executing the main method must be identical to the original: draw the three strips, each one
with a number.
