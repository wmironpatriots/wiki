# Java Exercises
###### [Go back to Section A Preface](./abc123.md)
To gauge your understanding of Java, **complete at least one easy challenge** and one hard challenge. Submit your code in a zip if it has many files.

Remember to follow the **three practices** in the [preface section](../abc123.md)

## Exercise 1 (Easy): 100 fibbonaci numbers
Write a program to calculate 64 fibbonaci numbers in 1 second. From [Wikipedia](https://en.wikipedia.org/wiki/Fibonacci_sequence): 
> In mathematics, the Fibonacci sequence is a sequence in which each element is the sum of the two elements that precede it. Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, commonly denoted Fn . Many writers begin the sequence with 0 and 1, although some authors start it from 1 and 1 and some (as did Fibonacci) from 1 and 2. Starting from 0 and 1, the sequence begins

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

## Exercise 2 (Easy): Pascal's Triangle
Given an integer `numRows`, return the first `numRows` of Pascal's Triangle. From [Wikipedia](https://en.wikipedia.org/wiki/Pascal%27s_triangle)
> In Pascal's triangle, each number is the sum of the two numbers directly above it.

## Exercise 3 (Hard):
###### "Borrowed" from FRC 971
#### Goal

Create a small Java program that simulates a simple elevator system using multiple classes.
This exercise will help you practice writing clean, structured code - similar to how FRC robot software is organized.

You’ll simulate a 5-floor elevator system (floors 1-5). The elevator can:

- Move up or down between floors
- Be "called" to a specific floor by reading from user input
- Print messages as it moves

#### What Your Program Should Do

- Start with the elevator at floor 1
- Calling the elevator to a new floor (from 1-5)
- Step-by-step print each floor it passes
- Reject invalid floor numbers (outside 1-5)

#### How to Structure Your Code

Break your code into three classes:

##### `Elevator`

- Only tracks current floor
- Can only move one floor at a time (no skipping floors)
- Recommended Methods: `moveUp()`, `moveDown()`, `getCurrentFloor()`.
- Constructor must take only one parameter: the initial floor.
  ```java
  Elevator elevator = new Elevator(1);
  ```

##### `ElevatorController`

- Given a target floor, tells the elevator how to move
- Handles printing elevator status to terminal- **the output format shown below is required**
- Prevents elevator from going to an invalid floor
- Constructor must take three parameters: the Elevator instance, the minimum floor, and the maximum floor (in that order!).
  ```java
  ElevatorController controller = new ElevatorController(elevator, 1, 5);
  ```

##### `Main`

- The entry point
- Sets up and runs the program loop

#### Required Output

```
Elevator instantiated at floor 1

Request floor: 3
Moving up... now at floor 2
Moving up... now at floor 3
Arrived at floor 3

Request floor: 8
Floor 8 is not a valid floor

Request floor: 1
Moving down... now at floor 2
Moving down... now at floor 1
Arrived at floor 1

Request floor: quit
```

#### Testing Instructions

**Before submitting** your solution, you should test your code. 

First, download [EvaluationTest.java](https://raw.githubusercontent.com/frc971/training-2025/refs/heads/main/tasks/java-evaluation/EvaluationTest.java) by following the link and using ctrl+s or cmd+s.

Then, move it to the same folder as your code. Compile and run `EvaluationTest` using the following commands in your terminal:

```sh
javac *.java && java EvaluationTest
```

**Important:** You are not allowed to modify the `EvaluationTest.java` file. All tests must pass with the provided test file.

---
---
#### [Home Page](../../README.md)