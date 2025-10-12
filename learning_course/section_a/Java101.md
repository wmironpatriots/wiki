# Java 101
## Prerequisite
Before starting this section, you should fullfill these requirements:
* [WPIlib VScode & JDK Installed](../../tools/setup_guide.md)
* [Command-Line Interface (CLI) Navigation](../../tools/fs_cli.md)

## Goals
* Understanding of basic Java syntax
* Logging with println function
* Data Types and variables
* Operations
* Conditionals
* Loops
* Functions
* Arrays (single and multidirectional)

## Getting Started
Before you begin, you should start off by setting up a directory to store all of your introductory Java code. We recommend creating this new directory in your documents folder for convience

```Bash
📁 dabeycorn/
    📁 documents/
        📁 Java101
            ...     # your code will go in here
```

Once you create your `Java101` directory, open it with WPIlib vscode.

## `README.md`
A `README` is a file used to explain what what a project is and how to navigate its contents. The markdown format is usually used for this.

Create a new file called `README.md` and then put the following in it

```Markdown
# Java101
Code written for me to learn the Java programming language
```

Okay, now we can start learning.

## Hello Beautiful World!
The first step to learning any language is to create a "Hello World" program. Lets start by creating a new file called `HelloWorld.java` in your `Java101` directory. Files with the `.java` extension are what we call "Source Files". 

Now write out the following in your new source file:

```Java
public class HelloWorld {
    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}
```

To compile and run this program, you can open the integrated CLI in vscode and running this command: `javac HelloWorld.java`. This command will create a bytecode called `HelloWorld.class`. We can then run this class by running this command: `java HelloWorld.class`. Congratulations! You just created your first java code.

#### Breaking down our code
Writing code is great, but understanding what each bit of it means is even better. Unfortunately, we won't be able to understand what some of these components mean for now, but we'll talk more about them later

Starting off, lets talk about the first line.

```Java
public class HelloWorld {
```

All code in Java has to be inside something called a class. We'll talk more about what classes actually are later, but for now know that when we create a new source file, it must contain all of its code inside a class of the same name. If your file is named `Dog.java`, your class must be called `Dog`. In Java, scopes are also defined by curly brackets (`{` and `}`). The scope defines what encapsulates something. Everything that's inside the curly brackets of the `HelloWorld` class belong to the class.

Lets take a look at the next scope.

```Java
    public static void main(String... args) {
        ...
    }
```

Now this scope looks scary because it's defined by many different keywords, but in reality we don't really need to know what any of these mean. This is a special type of function called an **Entry Point**. An entry point serves as a starting point for the compiler. When you first run your java code, the JVM (the software that runs your code) looks around for this main method and runs whatever is inside it. **The JVM will only run code that is inside the entry point.**

Lets take a look at the line inside the scope

```Java
        System.out.println("Hello World!");
```

Here is where the magic actually happens. Here we call the "print line" or `println` method, which is used to print out Strings to the console. Strings are just a bunch of characters which can be defined by putting characters inbetween quotations.

Now that was a lot of information, but here's what you need to remember:
* **All Java code** must be written in a class
* A source file always contains a class that has the same name (`Dog.java` has the class `Dog`)
* The JVM will only run the code inside the main function aka the entry point
* The entry point is the main function, and its scope is defined like this: `public static void main(String... args) {}`

---
### Data Types and Variables

