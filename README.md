# Fibonacci Number Calculation

This Scala code provides an implementation of a class FibonacciNumber that can be used to efficiently calculate the nth Fibonacci number. The implementation uses tail recursion to avoid stack overflow errors that can occur when using a traditional recursive approach.

## Method Signature

    final def fibonacciCalculator(position: Int, nextToLast: Int = 0, last: Int = 1): Int

This method takes three parameters:

    position: The position of the desired Fibonacci number in the sequence.
    nextToLast: The Fibonacci number two positions back in the sequence (default: 0).
    last: The Fibonacci number one position back in the sequence (default: 1).

The method returns the nth Fibonacci number.

## Exception Handling

If the position parameter is negative, the method will throw an IllegalArgumentException.
