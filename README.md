# Quiz Application (Java)

## Overview

This is a simple console-based Quiz Application developed using Java and Object-Oriented Programming (OOP) concepts. The program displays multiple-choice questions, accepts answers from the user, checks correctness, calculates the score, and displays the final result with performance feedback.

## Features

* Multiple-choice quiz questions
* Accepts answers as option number or text
* Automatic answer validation
* Score calculation
* Percentage calculation
* Performance evaluation
* Object-Oriented design

## OOP Concepts Used

### 1. Encapsulation

The `Quiz` class stores question details using private variables:

* questionText
* options
* correctAnswer

These fields are accessed through public methods.

### 2. Classes and Objects

Classes used:

* `Quiz`
* `QuizManager`
* `Main`

Objects of the `Quiz` class are created for each question.

### 3. Constructor

Constructors are used to initialize quiz questions and quiz manager data.

### 4. Abstraction

The internal logic of answer checking and score calculation is hidden from the user through methods.

## Class Description

### Quiz Class

Responsible for:

* Storing question details
* Displaying questions
* Checking answers
* Returning correct answers

Methods:

* `displayQuestion()`
* `checkAnswer()`
* `getCorrectAnswer()`

### QuizManager Class

Responsible for:

* Managing all quiz questions
* Taking user input
* Calculating score
* Displaying final results

Methods:

* `startQuiz()`
* `displayResult()`

### Main Class

Entry point of the program.
Creates quiz questions and starts the quiz.

## Sample Output

What is the capital of India?

1. Delhi
2. Mumbai
3. Kolkata
4. Chennai

Enter your answer: 1

Correct Answer!

===== QUIZ RESULT =====

Total Score: 3/3

Percentage: 100.00%

Excellent Performance!

## How to Run

### Compile

```bash
javac Main.java
```

### Execute

```bash
java Main
```

## Future Enhancements

* Add timer for each question
* Store questions in a file or database
* Randomize question order
* Add difficulty levels
* Create GUI using Java Swing or JavaFX

## Author

Developed as a Java OOP Mini Project for learning Object-Oriented Programming concepts.
