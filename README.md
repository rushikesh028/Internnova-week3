# Week 3 Assignment — Object-Oriented Programming (OOP)

This repository contains the complete solution for **Week 3 Assignment: Object-Oriented Programming (OOP)** using Java.

The assignment focuses on the fundamental concepts of Object-Oriented Programming, including **classes, objects, constructors, `this`, `static`, inheritance, polymorphism, encapsulation, and abstraction**.

---

## Objective

The objective of this assignment is to understand and implement the core concepts of Object-Oriented Programming in Java and create structured, reusable, and maintainable programs.

---

## Technologies Used

- Java
- Object-Oriented Programming
- Classes & Objects
- Constructors
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction

---

# Tasks

## Task 1: Classes & Objects — Student Management

### Description

Create a `Student` class with the following attributes:

- Student Name
- Roll Number
- Branch
- CGPA

Create objects of the `Student` class and display the information of at least three students.

### Requirements

- Create a separate `Student` class.
- Create multiple objects.
- Access attributes through objects.
- Display student information in a proper format.

### Concepts Used

- Classes
- Objects
- Instance Variables
- Methods

### Source File

`StudentManagement.java`

---

## Task 2: Constructors — Employee Information

### Description

Create an `Employee` class containing:

- Employee ID
- Employee Name
- Department
- Salary

Implement both:

- Default constructor
- Parameterized constructor

Create objects using both constructors and display their information.

### Concepts Used

- Constructors
- Default Constructor
- Parameterized Constructor
- Object Initialization

### Source File

`EmployeeInformation.java`

---

## Task 3: `this` & `static` — Bank Account

### Description

Create a `BankAccount` class containing:

- Account Holder Name
- Account Number
- Balance

Use the `this` keyword to differentiate instance variables from constructor parameters.

Create a `static` variable to keep track of the total number of bank accounts created.

Create at least three objects and display:

- Account details
- Total number of accounts

### Concepts Used

- `this` keyword
- `static` keyword
- Instance Variables
- Static Variables
- Constructors

### Source File

`BankAccountDemo.java`

---

## Task 4: Inheritance — Employee Management

### Description

Create a parent class named `Employee`.

The parent class contains common properties:

- Name
- Employee ID
- Salary

Create two child classes:

- `Developer`
- `Manager`

Add at least one additional property or method specific to each child class.

### Requirements

- Use the `extends` keyword.
- Demonstrate code reusability.
- Use parent class properties and methods.
- Use child class-specific properties and methods.

### Structure

```text
Employee
   |
   |--- Developer
   |
   |--- Manager
