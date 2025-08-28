# Java OOP Examples – Worker, Rational, Money, Matrix, Employee, HeartRate, FileSplitter/Merger

This repository contains Java programs demonstrating **Object-Oriented Programming (OOP)** concepts using several example class groups, along with file handling utilities like file splitting and merging.

---

## Classes & Features

- **Worker** – Employee details, constructors, input/output methods.  
- **Rational** – Fractions with arithmetic operations (add, subtract, multiply, divide).  
- **Money** – Rupee–Paise representation with addition, subtraction, and multiplication.  
- **Matrix** – 2D integer matrices with read/display methods and copy constructor.  
- **Employee** – Console-based program to input and display employee data using different constructors and arrays of objects.  
- **HeartRate** – Calculates a person’s age, maximum heart rate, and target heart rate range based on date of birth and current year.  
- **FileSplitter / FileMerger** – Splits a file into smaller parts and merges them back together.

---

## Concepts Covered

- Encapsulation  
- Constructor overloading  
- Copy constructors  
- Method overloading  
- Arrays of objects  
- File handling (read/write/delete)
- Custom data type operations  

---

## How to Compile and Run

### 1. Compile and run general class examples:
```bash
javac Classjava/*.java
java Classjava.Work
java Classjava.UseRational
java Classjava.UseMoney
java Classjava.UseMatrix
2. Employee Program (Package: Assignment1)
javac Assignment1/Employee.java
java Assignment1.ApplicationOfEmployee

3. HeartRate Program (Package: Assignment1)
javac Assignment1/DateOfBirth.java
javac Assignment1/HeartRate.java
javac Assignment1/HeartRateApplication.java
java Assignment1.HeartRateApplication

4. File Splitter and Merger (Package: AssignJava)
Description

These programs demonstrate basic file handling by:

Splitting a large file into multiple parts of a specified size.

Merging the parts back into the original file.

Files:

FileSplitter.java

FileMerger.java

How it works:

FileSplitter

Prompts the user to enter a file path and desired split size (in bytes).

Splits the original file into multiple .txt parts of specified size.

Deletes the original file after successful split.

FileMerger

Prompts the user to enter the base name of the original file.

Reconstructs the original file by sequentially reading and appending the split parts.

Deletes each part file after merging.

Compile:
javac AssignJava/FileSplitter.java
javac AssignJava/FileMerger.java

Run:
java AssignJava.FileSplitter
java AssignJava.FileMerger


Note: Both programs use System.console() for input, which may not work in some IDEs like Eclipse or IntelliJ. It's recommended to run from a terminal or command prompt.


