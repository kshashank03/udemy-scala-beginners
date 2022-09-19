package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 12) // Instantiating a class
  // Instantiations are a physical representation of a class in memory
  println(person)
  println(person.age)
  println(person.x)
  println(person.greet("Daniel"))

}

// Writing a class

class Person(name: String, val age:Int) { // Classes organize data and behavior
  // Above is a constructor
  // body
  val x = 2 // This is a field
  println(1 + 3)

  // This function is a method because it's inside a class
  def greet(name: String): Unit = println(s"$name is $age year(s) old. What about ${this.name}")


  // Overloading = Defining methods with the same name but different signatures
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0) // Calls the primary constructor (Auxiliary constructors)
  def this() = this("John Doe")
}
// Age is a class parameter but not a class member
// You can add "val" or "var" prior to a class parameter to make it a field