# JAVA

**Java** - is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet.

> ### Java is everywhere!

> ### Java is free to download.

The language itself borrows much syntax from C and C++ but has a simpler object model and fewer low-level facilities.

There were five primary goals in the creation of the Java language:[[16]](https://en.wikipedia.org/wiki/Java_(programming_language)#cite_note-design_goals-16)
1.  It must be simple, object-oriented, and familiar.
2.  It must be robust and secure.
3.  It must be architecture-neutral and portable.
4.  It must execute with high performance.
5.  It must be interpreted, threaded, and dynamic.


# java-development

Java SE (Java Standard Edition)

Java SE contains all the base packages. Some of the base packages are written in Java and some are written in C/C++. The base packages are the fastest because there are no additional layers on top of their core functionality.

Java EE (Java Enterprise Edition)

Java EE is a set of specifications and the respective implementations are all built using Java SE base packages which happen to already contain everything required for any application. For example, for a web application, here is a Java SE Web Server and a Java SE Database.



Java 5


- Enhanced for Loop
Simpler. Don't need define start to end
```java
String[] counts = { "one", "two", "three" };
for (String str : counts) {
  System.out.println(str);
}
```
- Autoboxing/Unboxing
Autoboxing : convert primitive type into wrapper object.
Can put primitive type values into collections.

example:
```java
List<Integer> li = new ArrayList<Integer>();
for(int i=0;i < 20; i++){
    li.add(i);
}
```
Unboxing : convert wrapper type into primitive type.


example
```
List<Double> ld = new ArrayList<Double>();
ld.add(3.14);

double pi = ld.get(0);
```
- Variable Length Argument List
Can use multi parameters with same type
```java
exampleVariableLengthArgumentList("1");
exampleVariableLengthArgumentList("1","2");
exampleVariableLengthArgumentList("1","2","3");
```
```java
private void exampleVariableLengthArgumentList(String... parameters) {
  for (String str : parameters)
    System.out.println("Paramters:-" + str);
  }
  System.out.println("");
}
```
- Static import
Import static class
```java
import static java.lang.Math.abs;

private void exampleStaticImport() {
  System.out.println(abs(-100));
}
```

Java 6

- Scripting Language Support

```
var aJavaString = new String('A Test String');
var length = aJavaString.substring(7, 13);
```
- Enhanched SQL Execption
```
try{

     // Some Database Access Code

}catch(SQLException exception){

    for(Throwable throwable: exception){
        System.out.println(throwable.getMessage());

    }
}
```

Java 7
- Diamond Syntax
Before
```java
Map<String, List<Trade>> trades = new TreeMap<String, List<Trade>> ();
```
After
```java
Map<String, List<Trade>> trades = new TreeMap <> ();
```
- Strings in switch Statement
```java
String status = "b";

switch(status) {
case "a":
  System.out.println("a");
  break;
case "b":
  System.out.println("b");
  break;
default:
  break;
}
```
- Numeric literals with underscores
```java
int thousand =  1_000;
```
- Improved exception handling
```java
try{
      methodThatThrowsThreeExceptions();
} catch(ExceptionOne | ExceptionTwo | ExceptionThree e) {
      // log and deal with all Exceptions
}
```

Java 8

- Lambda Expressions
Before
```java
Runnable r = new Runnable(){
    @Override
    public void run() {
      System.out.println("My Runnable");
    }
 };
```
After
```java
Runnable r1 = () -> {
  System.out.println("My Runnable");
};
```
- Stream
```java
List<Integer> myList = new ArrayList<>();
for(int i=0; i<100; i++) myList.add(i);

//sequential stream
Stream<Integer> sequentialStream = myList.stream();

//parallel stream
Stream<Integer> parallelStream = myList.parallelStream();

//using lambda with Stream API, filter example
Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
//using lambda in forEach
highNums.forEach(p -> System.out.println("High Nums parallel="+p));

Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
```
Output:
```
High Nums parallel=93
High Nums parallel=91
High Nums parallel=92
High Nums parallel=94
High Nums parallel=95
High Nums parallel=96
High Nums parallel=97
High Nums parallel=98
High Nums parallel=99
High Nums sequential=91
High Nums sequential=92
High Nums sequential=93
High Nums sequential=94
High Nums sequential=95
High Nums sequential=96
High Nums sequential=97
High Nums sequential=98
High Nums sequential=99
```
- Method Reference

Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

a. Reference to a static method
```
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
```
Output:
```
Hello, this is static method.
```

b. Reference to instance method
```
interface Sayable{  
    void say();  
}  

public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
        Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
        // Referring non-static method using anonymous object  
        Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
        // Calling interface method  
        sayable2.say();  
    }  
} 
```
Output:
```
Hello, this is non-static method.
Hello, this is non-static method.
```

c. Reference to a constructor
```
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}  
```
Output:
```
Hello
```

Java 9
- Factory method for immutable list,map and set
Make all immutable fields final. Value can be assigned only once.
```
List imutableList = List.of("one","two","three");
```

# Generics
- The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces.

1. Generic Class
```
class Test<T> { 
    // An object of type T is declared 
    T obj; 
    
    Test(T obj) {
      this.obj = obj;  
    }
    
    public T getObject()  { 
      return this.obj; 
    } 
} 
```
```
// Driver class to test above 
class Main { 
    public static void main (String[] args) 
    { 
        // instance of Integer type 
        Test <Integer> iObj = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Test <String> sObj = new Test<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 
    } 
}
```
Output:
```
15
GeeksForGeeks
```
2. Generic Functions
```
class Test { 
    // A Generic method example 
    static <T> void genericDisplay (T element){ 
        System.out.println(element.getClass().getName() + " = " + element); 
    } 
    
    //...
}
```
```
public static void main(String[] args) { 
    genericDisplay(11); 
    genericDisplay("GeeksForGeeks"); 
    genericDisplay(1.0); 
} 
```
Output:
```
java.lang.Integer = 11
java.lang.String = GeeksForGeeks
java.lang.Double = 1.0
```
