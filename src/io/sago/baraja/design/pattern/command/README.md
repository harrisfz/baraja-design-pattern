# The Command Pattern
**Command Pattern** - Encapsuletes a request as an object, thereby letting you parameterize other objects with different request, queue or logs request, and support undoable operations.

**The Command Pattern Defined**
![Command Pattern Class Diagram](https://github.com/harrisfz/baraja-design-pattern/blob/master/src/io/sago/baraja/design/pattern/command/Screen%20Shot%202019-12-09%20at%2014.27.10.png)


**Problem** - Need to issue requests to objects without knowing anything about the operation being requested or the receiver of the request.

Command decouples the object that invokes the operation from the one that knows how to perform it. To achieve this separation, the designer creates an abstract base class that maps a receiver (an object) with an action (a pointer to a member function). The base class contains an  `execute()`  method that simply calls the action on the receiver.

All clients of Command objects treat each object as a "black box" by simply invoking the object's virtual  `execute()`  method whenever the client requires the object's "service".

A Command class holds some subset of the following: an object, a method to be applied to the object, and the arguments to be passed when the method is applied. The Command's "execute" method then causes the pieces to come together.

Sequences of Command objects can be assembled into composite (or macro) commands.

#### Examples:
- Use Cases/Interactors on Clean Architecture;

#### Check list
> 1.  Define a Command interface with a method signature like  `execute()`.
> 2.  Create one or more derived classes that encapsulate some subset of the following: a "receiver" object, the method to invoke, the arguments to pass.
> 3.  Instantiate a Command object for each deferred execution request.
> 4.  Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
> 5.  The invoker decides when to  `execute()`.
