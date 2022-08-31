package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

//  x = 2 // You can't reassign the value of a Val, they're immutable

  val y = 42 // Compilter can infer types
  println(y)

  val aString: String = "Strings are denoted by double-quotes"
  println(aString); // The semicolon is unncessary

  val aBoolean: Boolean = true
  val aChar: Char = 'a' // Denoted by a single quote

  val aShort: Short = 1322
  val aLong: Long = 322313123123123L // <- the capital "L" can be used to denote a long
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.13

  // variables
  var aVariable: Int = 4
  aVariable = 5 // vars can be reassigned
  // useful in functional programming for testing for side-effects

  // Functional programming wants you to use less vars, so vals over vars
  

}
