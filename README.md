# Calculator Java Project

### Overview

This project is a simple arithmetic expression evaluator that demonstrates basic Java programming concepts and a straightforward implementation of operator precedence. It allows the user to input an arithmetic equation (e.g., `25-10/2*1.5`), tokenizes the input, and computes the result using a two-step evaluation process.

The project is divided into two main components:

#### Calc.java
Contains the logic for evaluating arithmetic expressions. It handles operator precedence by first processing multiplication and division, then addition and subtraction.

#### tester.java
Acts as the user interface. It prompts the user to enter an arithmetic equation, tokenizes the input, and displays the computed result.

### Features

- **Operator Precedence:**  
  The calculator correctly handles the order of operations by processing multiplication and division before addition and subtraction.

- **User Input:**  
  Users can input an equation in a single line (e.g., `25-10/2*1.5`), and the program will tokenize and evaluate the expression.

- **Simple Testing via Main Method:**  
  A main method is provided in the `tester` class for quick manual testing without the need for external testing frameworks.

### How to Run

1. **Compile the Java Files:**  
   Open a terminal in VSCode (or your preferred IDE) and run:
   ```bash
   javac Calc.java tester.java
   ```

2. **Run the Tester Program:**  
   Execute the `tester` class:
   ```bash
   java tester
   ```

3. **Follow the On-Screen Prompts:**  
   Enter an arithmetic equation when prompted. The program will display the computed result.

### Example Interaction

```bash
enter the equation (i.e. 25-10/2*1.5)
25-10/2*1.5
result: 17.5
```

### Purpose

This project was created to reinforce key programming concepts such as string manipulation, tokenization using regular expressions, and implementing basic arithmetic evaluations while respecting operator precedence. It serves as a foundation for building more complex expression evaluators and further exploring Java programming practices.

