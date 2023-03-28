package com.knoldus

object Driver extends App {

  val fibonacci = new FibonacciNumber()

  try {
    val result = fibonacci.fibonacciCalculator(10)
    println(s"The Fibonacci number is: $result")
  } catch {
    case exception: IllegalArgumentException => println(exception.getMessage)
  }

}
