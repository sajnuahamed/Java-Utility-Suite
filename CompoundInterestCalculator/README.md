# Compound Interest Calculator

A console-based Java application that calculates the final accumulated amount using the standard compound interest formula.

## Features

* Calculates compound interest based on user input
* Supports different compounding frequencies
* Accepts principal amount, interest rate, number of compounds per year, and duration
* Displays the final accumulated amount with formatted output

## Formula Used

The program uses the compound interest formula:

A = P(1 + r/n)ⁿᵗ

Where:

* **A** = Final accumulated amount
* **P** = Principal amount
* **r** = Annual interest rate (in decimal form)
* **n** = Number of times interest is compounded per year
* **t** = Time period in years

## Concepts Demonstrated

* User input using `Scanner`
* Try-with-resources for automatic resource management
* Variables and data types
* Mathematical calculations using `Math.pow()`
* Formatted output using `printf`

## Sample Output

```text
Enter the principal amount: 10000
Enter the interest rate (in %): 5
Enter the number of times compounded per year: 4
Enter the number of years: 10

The amount after 10 year/s is: 16470.09
```

## How to Run

1. Compile `CompoundInterestCalculator.java`.
2. Run the program.
3. Enter the required values when prompted.

---

This project was created as part of my Core Java revision to practice mathematical calculations and console-based user interaction.
