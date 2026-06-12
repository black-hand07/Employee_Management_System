# Employee Management System

## Overview

The **Employee Management System** is a simple console-based Java application that allows users to manage employee records efficiently. The system provides functionalities such as adding employees, viewing employee details, searching employees by ID , deleting employee records, and updating employee departments. 

This project demonstrates the use of:

* Object-Oriented Programming (OOP)
* Java Collections Framework (`ArrayList`)
* User Input Handling using `Scanner`
* CRUD Operations (Create, Read, Update, Delete)
* Menu-Driven Programming

---

# Definition

An **Employee Management System (EMS)** is a software application designed to store, manage, and maintain employee information within an organization. It helps administrators perform employee-related operations such as:

* Adding new employees
* Searching employee records
* Updating employee information
* Removing employee records
* Viewing all employee details

The primary goal of an EMS is to organize employee data and reduce manual record management.

---

# Features

### 1. Add Employee

Allows the user to add a new employee by providing:

* Employee ID
* Employee Name
* Department

Validation:

* Duplicate Employee IDs are not allowed.

---

### 2. View Employees

Displays all employee records currently stored in the system.

Output Format:

```text
=> Employee_ID | Employee_Name | Department
```

---

### 3. Search Employee

Searches for an employee using the Employee ID.

If found:

```text
Employee Found:
Name: [Employee Name]
Department: [Department]
```

Otherwise:

```text
Employee not found
```

---

### 4. Delete Employee

Removes an employee record from the system using Employee ID.

If found:

```text
Employee Removed Successfully
```

Otherwise:

```text
Employee not found
```

---

### 5. Update Department

Allows modification of an employee's department.

Steps:

1. Enter Employee ID.
2. Enter new department.
3. Department gets updated.

Output:

```text
Department updated successfully
```

---

### 6. Exit

Terminates the application.

---

# Technologies Used

| Technology   | Purpose                      |
| ------------ | ---------------------------- |
| Java         | Programming Language         |
| ArrayList    | Dynamic Storage of Employees |
| Scanner      | User Input                   |
| OOP Concepts | Employee Object Creation     |

---

# Class Structure

## Employee Class

The Employee class contains:

### Attributes

```java
int id;
String name;
String department;
```

### Constructor

```java
Employee(int id, String name, String department)
```

Used to initialize employee objects.

---

# Data Storage

Employee records are stored in:

```java
static ArrayList<Employee> employees
```

This ArrayList acts as an in-memory database.

Example:

```java
[
 Employee(101,"John","HR"),
 Employee(102,"David","IT")
]
```

---

# Program Flow

## Application Startup

```text
Program Starts
      │
      ▼
Display Main Menu
      │
      ▼
User Selects Option
```

---

## Main Menu

```text
1. Add Employee
2. View Employee
3. Search Employee
4. Delete Employee
5. Update Department
6. Exit
```

---

# Detailed Flow Diagram

## Add Employee Flow

```text
Start
  │
  ▼
Enter Employee ID
  │
  ▼
Check Existing IDs
  │
  ├── ID Exists?
  │       │
  │      Yes
  │       │
  │       ▼
  │  Display Error
  │       │
  │       ▼
  │      End
  │
  ▼ No
Enter Name
  │
  ▼
Enter Department
  │
  ▼
Create Employee Object
  │
  ▼
Store in ArrayList
  │
  ▼
Success Message
  │
  ▼
End
```

---

## View Employee Flow

```text
Start
  │
  ▼
Read Employee List
  │
  ▼
Display Each Employee
  │
  ▼
End
```

---

## Search Employee Flow

```text
Start
  │
  ▼
Enter Employee ID
  │
  ▼
Traverse ArrayList
  │
  ▼
Employee Found?
  │
 ├── Yes
 │      │
 │      ▼
 │ Display Details
 │
 └── No
        │
        ▼
 Display Not Found
  │
  ▼
End
```

---

## Delete Employee Flow

```text
Start
  │
  ▼
Enter Employee ID
  │
  ▼
Search Employee
  │
  ▼
Employee Found?
  │
 ├── Yes
 │      │
 │      ▼
 │ Remove Employee
 │      │
 │      ▼
 │ Success Message
 │
 └── No
        │
        ▼
 Display Not Found
  │
  ▼
End
```

---

## Update Department Flow

```text
Start
  │
  ▼
Enter Employee ID
  │
  ▼
Search Employee
  │
  ▼
Employee Found?
  │
 ├── Yes
 │      │
 │      ▼
 │ Enter New Department
 │      │
 │      ▼
 │ Update Department
 │      │
 │      ▼
 │ Success Message
 │
 └── No
        │
        ▼
 Display Not Found
  │
  ▼
End
```

---

# Time Complexity Analysis

| Operation         | Complexity |
| ----------------- | ---------- |
| Add Employee      | O(n)       |
| View Employees    | O(n)       |
| Search Employee   | O(n)       |
| Delete Employee   | O(n)       |
| Update Department | O(n)       |

Where **n** is the number of employees stored in the ArrayList.

---

# Sample Execution

```text
********************
1. Add Employee
2. View Employee
3. Search Employee
4. Delete Employee
5. Update Department
6. Exit
********************

Enter Your Choice : 1

Enter Your ID : 101
Enter Your Name : John
Enter Your Department : HR

Employee added successfully
```

View Employees:

```text
=> 101 | John | HR
```

Search Employee:

```text
Enter Employee ID : 101

Employee Found :
Name : [John] | Department : [HR]
```

---

# Limitations

* Data is not permanently stored.
* Employee information is lost when the program exits.
* Search operation uses linear traversal.
* No file/database connectivity.
* No exception handling for invalid input.

---

# Future Enhancements

* Database Integration (MySQL/PostgreSQL)
* File Storage Support
* Employee Salary Management
* Employee Attendance Tracking
* Sorting and Filtering Employees
* Exception Handling
* Login Authentication
* GUI using Java Swing or JavaFX
* REST API Integration

---

# Conclusion

This Employee Management System is a beginner-friendly Java project that demonstrates CRUD operations using OOP concepts and collections. It serves as a foundation for building more advanced Human Resource Management Systems (HRMS) with database support and enterprise-level features.

