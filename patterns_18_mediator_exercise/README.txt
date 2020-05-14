The application shows a control system for the devices in a car:
initially there's only radio and telephone but it may be extended in the future.

The system implements the following rules (- event -> system action):

- start car -> turn on radio
            -> turn off phone music
- phone rings -> turn off radio
- turn on radio -> turn off phone music
- turn off car -> turn off radio

Create a mediator in the system in such a way that it
continues to respect the rules shown, but in a more "decoupled" way:
meaning that the car, telephone and radio objects do not have references to each other.

The test provided will help you verify that your changes do not
ruin the implemented functionality.

When you change the code you should adapt the test, but only the initialization part (init method 
and, according to the solution, the variables).

There is no need to change any of the @Test methods
