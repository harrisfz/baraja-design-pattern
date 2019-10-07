# The Singleton Pattern
**Singleton Pattern** - Ensures a class has only one instance, and provides a global point of access to it.
### Examples:
- There  can be many printers in a system but  there  should  only be one printer spooler.
- There  should be only  one  instance  of a WindowManager.
- There  should be only  one  instance  of a filesystem.
##
How do we  ensure  that a class has only  one  instance and that the instance is easily  accessible?
> A global variable makes an object  accessible, but  does not keep  you from instantiating  multiple  objects.

> A better solution is to make the class  itself  responsible for keeping  track  of  its  sole  instance. The class  ensures  that no other  instance  can be created (by intercepting  requests to create new objects) and it provides a way to access the instance.

## **When ?**
* There must be exactly  one  instance  of a class, and it must be accessible to clients from a well-known access point.
* When the sole  instance  should be extensible by subclassing, and clients  should be able to use an extended  instance  without  modifying  their  code.

### The Participants
* **Singleton**
	* Defines an Instance operation that  lets  clients access its  unique  instance. Instance is a class operation (static  method)
	* May be responsible for creating  its  own  unique  instance
* **Client**
	* Accesses a Singleton instance  solely  through the Singleton’s  Instance() method.

###  Implementation:
* Common
* Thread Save
* Double Check Locking


## Can we improve multithreading?
> Do nothing if the performance of getInstance() isn’t critical to
your application

> Move to an eagerly created instance rather than a lazily
created one

> Use “double-checked locking” to reduce the use of
synchronization in getInstance()

**Double-checked locking doesn’t work in Java 1.4 or earlier!**
