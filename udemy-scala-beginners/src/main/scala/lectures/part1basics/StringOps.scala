package lectures.part1basics

object StringOps extends App {
  val the_str: String = "Hello, I am learning Scala"


  println(the_str.charAt(2)) // 0 Based indexing
  println(the_str.substring(7, 11))
  println(the_str.split(" ").toList)
  println(the_str.startsWith("Hello"))
  println(the_str.replace(" ", "-"))
  println(the_str.toLowerCase())
  println(the_str.length())


  val aNumberString = "45"
  val aNumber = aNumberString.toInt // If the method doesn't take parameters
                                    // then you must remove the parentheses

  println('a' +: aNumberString :+ 'z') // +:  = Prepending, :+ = Appending
  println("a" +: aNumberString :+ "z") // This prints a vector for some reason
  println(the_str.reverse)
  println(the_str.take(2)) // Kinda like substring where the first param is 0

  // Scala-specific: String interpolators


  // S-interperlators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old" // Similar to "f-string" in Python
  /// S-interpolated strings can also evaluate expressions
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"


  /// F-interpolation - Can also receive printf-like formats
  val speed = 1.2f

  val myth = f"$name%s can eat $speed%2.2f burgers per minute" // Not sure what the "%s does
  println(myth) // F-interpolated strings can check for type correctness and force compiler to evaluate vals correctly

  /// raw-interpolaters - works like the S-interpolators but prints things literally
  println(raw"This is a \n newline")
  val escaped = "This is a \nnewline"
  println(raw"$escaped")


}
