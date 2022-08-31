package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1) //


  def anotherFactorial(n: Int): BigInt = {
    @tailrec // If you mean to write a tail recursive function, use this annotation
             // and the compiler will throw an error when function isn't recursive
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION: Use recursive call as the LAST expression

    factHelper(n, 1)
  }

  // 1. Concatenate a string n times
  // Simple implementation
  def stringRepeater(word: String, num: Int): String =
    word * num

  println(stringRepeater("Hi", 10))


  // 2. isPrime with tail recursion
  def isPrimeTail(num: Int): Boolean =
    @tailrec
    true

}
