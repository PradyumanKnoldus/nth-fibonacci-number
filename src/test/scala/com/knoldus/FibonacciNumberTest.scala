package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FibonacciNumberTest extends AnyFlatSpec {

  "FibonacciNumber" should "return the correct value for the 0th Fibonacci number" in {
    val fibonacci = new FibonacciNumber()
    val result = fibonacci.fibonacciCalculator(0)
    assert(result == 0)
  }

  it should "return the correct value for the 1st Fibonacci number" in {
    val fibonacci = new FibonacciNumber()
    val result = fibonacci.fibonacciCalculator(1)
    assert(result == 1)
  }

  it should "return the correct value for the 10th Fibonacci number" in {
    val fibonacci = new FibonacciNumber()
    val result = fibonacci.fibonacciCalculator(10)
    assert(result == 55)
  }
}
