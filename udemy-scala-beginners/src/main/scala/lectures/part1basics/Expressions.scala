package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // the right-hand side is an expression
  // expressions are evaluated to a value and type

  // >>> right shift with zero extension

  println(1 == x)
  println(!(1==x))

  var aVariable = 3
  aVariable+=3
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF Expression called so because it gives back a value
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // There are loops in Scala but they are discouraged
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THE ABOVE EVER
  // Loops are common in Imperative programming which is what Python etc is for. Scala is not built for it

  val aWeirdValue = (aVariable = 3) // (hover over aWeirdValue) Unit == void
  println(aWeirdValue) // Notice how nothing is returned

  // side effects: printing nothing to the console, whiles, reassigning
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  } // Value of the whole code block is the value of the last expression
  // You can't reference values inside the code block from outside the codeblock

  // Instructions = do something, expressions = evaluate something

  // 1. Diff between "hello world" and println("hello world")
    // First is a string literal, second is an expression (returns unit)
  // 2.

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  // someOtherValue evaluates to 42
}
