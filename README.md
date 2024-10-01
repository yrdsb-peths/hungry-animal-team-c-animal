# Hungry Animal Team C 
This Hungry Animal Game includes modifications as stated below:
## New Subclass: Rotten Apple
If the elephant collides with/eats the green rotten apple, the game will be over
## Abstract Class: Food
Provides the subclasses "Apple" and "Rotten Apple" with the speed, how to remove/destroy itself and spawns the object at a random location. An instance of food should never be created in our code, and it should only be used to generalize all of its subclassses which is why it makes sense to make it an abstract class.
## Interface: Clickable
This interface is used so that objects will make sounds when they are clicked. Using an interface to create this makes sense as a user could click any object and each object could have a different response.
## Polymorphism: Food
Variable apple in Class MyWorld is defined as a food object so that an instance of "Apple" and "Rotten Apple" can exist in the variable. This greatly reduces the amount of code in our project and overall makes the code easier to read.
## Overide: Rotten Apple
Rotten Apple overides its superclass method "remove" with its own variation of removing itself. This is needed as in our game. If the rotten apple touches the bottom of the map, the game should continue instead of ending.
