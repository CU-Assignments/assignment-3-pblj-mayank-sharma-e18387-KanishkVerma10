# Assignment 3 - Exception Handling

## Topics Covered:
- Introduction to Exceptions
- Difference between Error and Exception
- Try, Catch, and Throw
- Difference between Throw and Throws
- Types of Exceptions & Exception Handling

## Problem Statements

### Problem 1: Square Root Calculation (Easy Level)
- This program calculates the square root of a given number.
- It handles invalid inputs (negative numbers or non-numeric values) using exception handling.

### Problem 2: ATM Withdrawal System (Medium Level)
- Simulates an ATM withdrawal system where users enter a PIN and withdraw money.
- Throws exceptions for invalid PIN or insufficient balance.
- Always displays the remaining balance even after an exception.

### Problem 3: University Enrollment System (Hard Level)
- Allows students to enroll in courses with prerequisites.
- Throws `CourseFullException` if the course is full.
- Throws `PrerequisiteNotMetException` if prerequisites are not completed.

## File Structure
```
Assignment-3/
│── src/
│   ├── SquareRootCalculator.java
│   ├── ATMWithdrawal.java
│   ├── UniversityEnrollment.java
│── README.md
│── input_output_examples.txt
```

## How to Run
1. Compile Java files: `javac src/*.java`
2. Run programs: `java src.ClassName`
