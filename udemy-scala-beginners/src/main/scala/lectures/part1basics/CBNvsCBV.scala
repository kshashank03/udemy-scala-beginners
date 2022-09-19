package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime()) // The exact value of System.nanoTime() is computed before function evaluates
  calledByName(System.nanoTime())  // System.nanoTime() is passed in as is and evaluated when it's used in the function


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)
}
