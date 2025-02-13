# Handling Uncommon Java Exceptions

This repository demonstrates how to handle uncommon exceptions in Java, such as `StackOverflowError` and `OutOfMemoryError`.  These errors, while less frequent than `NullPointerException` or `IllegalArgumentException`, can be challenging to debug.

The `UncommonError.java` file contains code that intentionally triggers these exceptions.  The `UncommonErrorSolution.java` file provides improved error handling and mitigation strategies.

## Common vs. Uncommon Exceptions

The example includes a common `ArithmeticException` (division by zero) for comparison.  The focus is on the less common errors, showing how they differ from typical runtime exceptions.

## Mitigation Strategies

While completely preventing `StackOverflowError` and `OutOfMemoryError` can be difficult, appropriate exception handling and coding practices (recursion limits, memory management) can significantly reduce their occurrence.