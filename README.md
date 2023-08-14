# 📚 Java Preparation

Java Preparation is a personal learning project designed to aid my understanding and competency in Java, specifically in preparation for exams and more complex projects.

## 🎯 What's Inside

This repository is a compendium of several key Java concepts and applications, including:

1. **Object-Oriented Programming (OOP)** - Fundamental OOP concepts and patterns are explored here.
2. **Swing** - Projects demonstrating the use of Java's built-in graphical user interface (GUI) toolkit.
3. **Java Core Basics** - Foundational knowledge of Java, including syntax, data structures, and standard libraries.
4. **ToolBox Utility Class** - A utility class with various helper methods for tasks such as array manipulation, sorting, random number generation, and encryption.

## 🚀 Projects

The repository is organized into the following main projects:

### Bitwise Calculator

A unique calculator app that exclusively utilizes bitwise operations for its calculations.

### Bank Account

This console-based project replicates the functionality of an Automated Teller Machine (ATM), providing a textual interface for bank transactions.

### Swing Clock

A simple yet effective clock application created using Java's Swing library and multi-threading capabilities.

### ToolBox Class

An utility class, `ToolBox`, that provides several utility functions for:

- Converting arrays to strings with `arrToString` methods.
- Displaying array contents with `showArr` methods.
- Sorting arrays in ascending or descending order with `sortArrAscending` and `sortArrDescending` methods.
- Generating random numbers with `getIntRandomNumber` method.
- Generating sequential integer arrays with `getInt1DArr` and `getInt2DArr` methods.
- Encrypting and decrypting strings with `encrypt`, `decrypt`, `encryptCaesar` and `decryptCaesar` methods.

### Integer Message Decoder

#### Overview
This program allows encoding and decoding of messages embedded in an integer value. It assumes the English alphabet consists of 26 letters, meaning we need at least 5 bits (2^5 = 32) to encode every letter.

#### Encoding Assumptions
- `A` = 1
- `B` = 2
- ...
- `Z` = 26
- `_` = 31

A single `int` variable can encode up to 6 letters.

#### Usage

1. **Run the Program**: Simply start the program.
2. **Default Decoding**: By default, the program decodes the message for the number `278905354`, but you can adjust this number in the main program.
3. **Custom Encoding**: To encode your own message, change the value of the `customMessage` variable in the main program and run it again.

##### Example
For the integer `278905354`, the decoded message is `HI_PPJ`.

## 📥 Getting Started

To get started with this repository:

1. Clone this repository to your local machine.
2. Navigate to the project you are interested in.
3. Refer to the project-specific README file for instructions on how to run and use the application.
