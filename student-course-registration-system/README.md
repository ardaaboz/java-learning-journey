# Student Course Registration System

A simple Java console-based application designed to manage student course registrations at a small college.

## Project Overview
This project simulates a basic course registration system. It allows users to register students, create courses, enroll students in courses, and view enrollment data through a console menu interface.

## Features

### 1. Student and Course Classes

The system includes two core classes:

- **Student**
    - `ID` (String)
    - `Name` (String)
    - `registeredCourses` (ArrayList)

- **Course**
    - `Code` (String)
    - `Title` (String)
    - `Instructor` (String)

---

### 2. Data Structures

To manage the data, the following structures are used:

- `ArrayList<Student>` – stores all registered students
- `ArrayList<Course>` – stores all available courses
---

### 3. Console Menu Functionalities

The application provides the following menu options:

- **Register a Student**  
  Adds a new student to the student list.

- **Add a Course**  
  Adds a new course to the master course list.

- **Enroll Student in a Course**  
  Enrolls a student in a selected course using the student ID and course code.  
  Prevents duplicate registrations.

- **View All Courses of a Student**  
  Displays all courses a specific student is registered in.

- **View All Students in a Course**  
  Displays a list of all students enrolled in a specific course.

- **Save Data**  
  Save data by using serialization.

- **Load Data**  
  Load data by using serialization.

- **Exit**  
  Ends the program.

---
