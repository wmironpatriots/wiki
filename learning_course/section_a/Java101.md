# Java 101
## Prerequisite
Before starting this section, you should read these two pages:
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
### Variables, their data types, and also loops
Lets take a look another source file
```Java
public class VariablesAndTypes {
    public static void main(String... args) {
        double fahr, celsius;
        int lower, upper, step;

        lower = 0;      // The lower limit of the table
        upper = 500;    // The upper limit of the table
        step = 20;      // The step size of the table

        fahr = lower;
        while(fahr <= upper) {
            celsius = (fahr - 32) * 5.0 / 9.0;
            System.out.println(fahr + "\t" + celsius);
            fahr = fahr + step;
        }
    }
}
```

Here we have a program for creating a table of fahrenheit values and their celsius equivalent. The output of the program is as follows:

```
0.0	-17.77777777777778
20.0	-6.666666666666667
40.0	4.444444444444445
60.0	15.555555555555555
80.0	26.666666666666668
100.0	37.77777777777778
120.0	48.888888888888886
140.0	60.0
...
500.0	260.0
```

We've just applied four new concepts: data types, variables, conditionals, and loops. Lets start at the first line of the main method.

```Java
        double fahr, celsius;
        int lower, upper, step;
```

Here we are initalizing variables. In Java, variables need to have an explicitly defined type. There are a couple of primitive types that you should know
* `double` the fractional/decimal number type. Stores numbers from 1.7e−308 to 1.7e+308 (though you really don't have to memorize that).
* `int` the integer number type. Can only store whole numbers between -32,768 to 32,767.
* `boolean` is either `true` or `false`.

On the two lines above, we are defining 5 variables: `fahr` (representing the fahrenheit value), `celsius` (representing the celsius value), `lower` (representing the lower bound of the table), `upper` (representing the upper bound of the table), and `step` (representing the step size between fahrenheit values)

You may notice that we haven't really specified the values of our variables yet. In Java you are able to initalize variable without giving them values, however you must give them values before you use them for anything.

Lets look at the next couple of lines lines
```Java
        lower = 0;      // The lower limit of the table
        upper = 500;    // The upper limit of the table
        step = 20;      // The step size of the table
```

Here we actually define the characteristics of the temperature table. We know from this that the table will start at a fahrenheit value of zero, end at a fahrenheit value of 500, and step up to 500 in 20 degree increments.

```Java
        fahr = lower;
```

Okay now we're defining our fahrenheit `double`. You may notice that `lower` is an `int`, yet we're able to set `fahr` (a `double` value) equal to it. This is because an integer can also be a decimal number (1 is technically equal to 1.0).

```Java
        while(fahr <= upper) {
            celsius = (fahr - 32) * 5.0 / 9.0;
            System.out.println(fahr + "\t" + celsius);
            fahr = fahr + step;
        }
```

---
---
#### [Home Page](../README.md) | [Next Up: A.2 Java102](./Java102.md)