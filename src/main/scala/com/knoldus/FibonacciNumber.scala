package com.knoldus

import scala.annotation.tailrec

class FibonacciNumber {

  /**
   * This method uses tail recursion to efficiently calculate the nth Fibonacci number.
   *
   * @param position   The position of the desired Fibonacci number in the sequence.
   * @param nextToLast The Fibonacci number two positions back in the sequence (default: 0).
   * @param last       The Fibonacci number one position back in the sequence (default: 1).
   * @return The nth Fibonacci number.
   */
  @tailrec
  final def fibonacciCalculator(position: Int, nextToLast: BigInt = 0, last: BigInt = 1): BigInt = {

    if (position < 0 ) throw new IllegalArgumentException("Position can't be negative.")

    if (position == 0) nextToLast
    else if (position == 1) last
    else fibonacciCalculator(position - 1, last, nextToLast + last)

  }
}



