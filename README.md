# University Management System

## Overview

The University Management System is a Java application designed to efficiently manage various aspects of a university, including students, teachers, employees, groups, courses, subjects, and events. The system is built on a robust class hierarchy, where the `Person` class serves as the parent class for `Student`, `Teacher`, and `Employee` classes. Additionally, the application includes classes for `Group`, `Course`, and `Subject`, implementing two interfaces - `Joinable` and `Leavable`, providing flexibility for users to join or leave these entities. The system also supports the organization of events through the `Club` class.

## Features

- **Person Class Hierarchy:** A well-structured class hierarchy with the `Person` class as the parent, facilitating the representation of students, teachers, and employees.

- **Group, Course, and Subject Management:** Entities such as groups, courses, and subjects can be easily managed through the application. The `Joinable` and `Leavable` interfaces allow users to join or leave these entities seamlessly.

- **Event Organization:** The system supports the organization of events through the `Club` class. Users can create and manage events efficiently.

## Class Structure

1. **Person Class**
   - Represents individuals within the university, serving as the parent class for `Student`, `Teacher`, and `Employee` classes.

2. **Group Class**
   - Implements `Joinable` and `Leavable` interfaces, providing functionality for users to join or leave groups.

3. **Course Class**
   - Implements `Joinable` and `Leavable` interfaces, allowing users to enroll or withdraw from courses.

4. **Subject Class**
   - Implements `Joinable` and `Leavable` interfaces, enabling users to join or leave subjects.

5. **Event Class**
   - Represents events that can be organized by the `Club` class.

6. **Club Class**
   - Manages the organization of events and provides a platform for event management.

## Usage

To use the University Management System, follow these steps:

1. **Compile and Run:**
   - Compile the Java files using a Java compiler.
   - Run the main application file.
2. **Join or Leave:**
   - Utilize the `Joinable` and `Leavable` interfaces to join or leave groups, courses, and subjects.

3. **Organize Events:**
   - Use the `Club` class to organize and manage events within the university.

