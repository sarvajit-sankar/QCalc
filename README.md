# QCalc

A calculator using Java Backend with unit tests

### What is it?

QCalc is a calculator program implemented with Java. This is my first project implementing Java. Features are as follows -

* It uses OOPs concepts of Inheritance, Polymorphism, Encapsulation
* Code is modularized into 3 sections -
  * LogicCalculator - It performs logical operations (AND, OR, NOT, XOR)
  * ScientificCalculator - It performs basic scientific operations (sin, cos, tan, sqrt, cbrt, square of a number, log) using Java Math Library
  * StandardCalculator - It performs basic operations (add, subtract, multiply, divide) for integers as well as double (using Method overloading)
* It handles exceptions like DivideByZero and Double overflow
* It has unit Tests for the functionalities using Junit Jupiter

### How do I run it?

I personally use Gradle for it with VSCode for code editing. 

##### Code was developed with -

* Java - 21
* Gradle - 8.9
* Junit Jupiter - 8.5

## Steps are -

1. Install Java
2. Install Gradle
3. Run command -
   ```bash
   gradle init --package com.backend.qcalc
   ```
4. Clone the project
5. Install Extensions in vscode
   1. Java By Oracle
   2. Extension pack for Java by Microsoft
   3. Test Runner for Java by Microsoft
   4. Gradle for Java by Microsoft
   5. Language Support for Java By Red Hat
6. You can choose to run from the VSCode code, there's a run button in App.java main function to execute the code
7. You can go to the Beaker symbol and execute all test cases
8. Run command - for running test cases
   ```
   ./gradlew build
   ```
9. Run command - for running the app.java code
   ```
   ./gradlew run
   ```
