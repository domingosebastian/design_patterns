Our application has different players from the same team, each with a class:
Player1, Player2 and Player3

Each player, among other things, has a draw () method that returns a String showing
their strip.

All the players share an identical strip except for their number in the middle.

You can run the Main class to see how the three strips are shown per
console.

The objective of the exercise is to avoid a problem that we have with the use of memory:
we want to use the flyweight pattern to avoid having a copy of each strip.

The strategy we'll use will be to create a strip class with a strip "template",
using a "placeholder" instead of the number: e.g. "X"

This class must be able to draw any strip by substituting the corresponding number for X
(For simplicity, we will assume that you do not need to process two-digit numbers)

Each player will have a reference to this strip and must remove the variable strip itself.

To implement the draw method, the reference to strip will be used passing as "context" its particular number.

The result of executing the main method must be identical to the original: draw the three strips, each one
with its number.
