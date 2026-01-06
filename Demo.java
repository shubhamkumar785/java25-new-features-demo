// Demo Instance java method - Java 25 allows main methods that are not static, need not be public, and can omit the String[] args parameter—so you can write void main() and JVM will create an instance and call it

// public class Demo {
//     public static void main(String[] args){
//         System.out.println("Hello World!");
//     }

//     void main() {
//         System.out.println("Hello World!");
//     }
// }

// 2. compact source file - You can write source files with methods/fields without wrapping them in an explicit class; the compiler makes an implicit final class for you.

// void display(){
//     System.out.println("hello world!"); // print error
// }

// void main(){
//     System.out.println("Hello World");
// }

// 3. Simplify java console input and output for begineers - Java 25 introduces java.lang.IO class with methods like print, println, readln so you can do console I/O more simply.

// void main() {
//     IO.println("Hi, how are you");
//     IO.println("I am fine");
//     var name = IO.readln("Enter your name");
//     IO.println("Hello " + name);
// }

//  4. Automatic imports of common APIs - In compact source files, all public top-level classes/interfaces in the java.base module are automatically imported so you don’t need to write many import statements.

// 5. flexible constructor bodies - Constructors can now have statements before the super(...) or this(...) call (as long as they don't use this or uninitialized members) allowing earlier validation or setup

// class Animal {
//     Animal() {
//         IO.println("Parent class constructor: Animal Constructor");
//     }
// }

// class Dog extends Animal {
//     Dog() {
//         super();
//         IO.println("Child class constructor: Child Constructor");
//         IO.println("This is after calling parent constructor");
//     }

//     public static void main(String[] args){
//         new Dog();
//     }
// }

//  6. Module Imports Declerations - Java 25 adds import module M; which lets you import all packages exported by module M in a succinct way.

// import module java.base;
// import module java.sql;
// // import java.sql.Driver;

// public class Demo {
//     public static void main(String[] args){
//         IO.println("Hello World");
//         IO.println(Driver.class); 
//     }
// }

//  7. Scoped Values - Java 25 adds “scoped values” which allow sharing immutable data within a thread context (and child threads), safer and more efficient than traditional ThreadLocal.

