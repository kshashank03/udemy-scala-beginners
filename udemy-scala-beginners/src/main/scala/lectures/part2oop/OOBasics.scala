package lectures.part2oop

import java.io.Writer

object OOBasics extends App {

  val person = new Person("John", 12) // Instantiating a class
  // Instantiations are a physical representation of a class in memory
  println(person)
  println(person.age)
  println(person.x)
  println(person.greet("Daniel"))

  // Exercises

  // Instantiate a writer
  val locke = TheWriter("John", "Locke", 1600) // "Writer" is a Java class, had to rename
  println(locke.fullName())
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

// Create a Novel and Writer class
  // Writer: firstname, lastname, year
     // Method fullname


class TheWriter(firstName:String, lastName:String, val bornYear: Int){
//  Below was my method
//  def fullName(firstName:String = firstName, lastName:String = lastName): String = firstName + " " + lastName
    def fullName: String = firstName + " " + lastName // This is Daniel's method
  // val age:Int = bornYear
  // Method: fullname

}

class TheNovel(name:String, yearRel:Int, author:TheWriter){
  def authorAge: Int = this.yearRel - this.author.bornYear
  val isWrittenBy = author != None
  def copy(newYear:Int): TheNovel = new TheNovel(this.name, newYear, this.author)
}

// Novel: name, year of release, author -> Instance of type Writer
  // - authorAge -> Age of author at year of release
  // - isWrittenBy(author)
  // - copy (new year of release) = returns new instance of Novel with new year of release


// The below is a "getter" and is the same as creating a class then defining a method to "Get" the count
//class Counter(val count: Int){
//
//}
class TheCounter(start:Int){
  def currentCount(): Int = this.start
  def inc: Int = new TheCounter(count + 1) // Creates a new instance which allows us to "modify" the "count" val
  def dec: Int = new TheCounter(count - 1)
 }

// Counter class
  // Receives int
  // method current count
  // method to increment/decrement => new counter
  // overload inc/dec to receive an amount