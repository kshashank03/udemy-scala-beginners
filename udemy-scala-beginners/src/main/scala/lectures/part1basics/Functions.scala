package lectures.part1basics
import scala.math.sqrt

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b


  println(aFunction("hello", 3)) // Calling a function is an expression


  def aParameterlessFunction: Int =
    42

  println(aParameterlessFunction)

  def aNewParameterlessFunction(): Int =
    42

  println(aNewParameterlessFunction()) // even with no parameters, if you have parentheses in the def, you need them in the call


  def aRepeatedFunction(aString:String, n:Int): String =
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1) // This is a recursive function
    // In Scala WE USE RECURSION INSTEAD OF LOOPS
    // Reasons we might do this: https://stackoverflow.com/questions/12659581/functional-programming-lots-of-emphasis-on-recursion-why
    // You can ignore the return type of a function if it isn't recursive, either way you should specify

  println(aRepeatedFunction("Hello", 3))


  // 1. A greeting function (name, age) my name is X and I am Y years old
  // 2. Factorial Function
  // 3. Fibonacci Function
  // 4. Tests if a number is Prime

  // 1.
  def greetingFunction(name: String, age: Int): Unit =
    if (age < 2) println("Hello my name is $name and I am $age year old")
    else println(s"Hello my name is $name and I am $age years old")
  greetingFunction("David", 5)

  // 2.
  def factorialFunction(num: Int, fac: Int = 1): Int =
    // if num > 1 multiply counter by 1 then subtract 1 from counter
//    println(fac)
    if (num > 1) {
      if (fac == 1) {
        val newFac = num * (num - 1)
        val newNum = num - 1
        factorialFunction(newNum, newFac)
      }
      else {
        val newFac = fac * (num - 1)
        val newNum = num - 1
        factorialFunction(newNum, newFac)
      }

    }
    else fac

  // Much simpler method
  def simplerFactorial(num: Int): Int =
    if (num <= 0) 1
    else num * simplerFactorial(num - 1)

  print(simplerFactorial(12))

  println(factorialFunction(5))

  // 3.
  // Fibonacci: Print the fibonacci until the highest number is < the input
  def fibonacciLimit(theLimit: Int, num1: Int= 0, num2: Int = 1): Unit =
    if (num2 < theLimit) {
      if (num1 == 0) {
        println(num1)
      }
      println(num2)
      val newNum1 = num2
      val newNum2 = num1 + num2
      fibonacciLimit(theLimit, newNum1, newNum2)
    } // This solution is tail recursive meaning the last call is recursive

  // Much simpler way
  def simplerFibonacci(num: Int): Int =
    if (num <= 2) 1
    else simplerFactorial(num - 1) + simplerFibonacci(num - 2)

  println(fibonacciLimit(100))
  println(simplerFibonacci(10))


  // 4.
  // Testing if x is prime
  // We'll use trial division: Check if x is divisible by any number from 2 to sqrt(x)


  def primeChecker(numToCheck: Int, checkingValue: Int = 2): Boolean =
    val maxNum: Double = sqrt(numToCheck)
    if (checkingValue <= maxNum) {
      if (numToCheck % checkingValue == 0){
        false
      }
      else {
        val newCheckingValue = checkingValue + 1
        primeChecker(numToCheck, newCheckingValue)
      }
    }
    else {
      true
    }

  println(primeChecker(982451653))

}



