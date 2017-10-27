package nbd1


object Person {

  def main(args: Array[String]): Unit = {
    testGreetPeople(greetPerson)
  }

  def greetPerson(person: Person): String = person.firstName match {
    case "john" => "Hello " + " " + person.firstName.toUpperCase
    case "Foo" => "Hi " + person.firstName.toLowerCase + " " + person.lastName.toUpperCase()
    case "fizz" => "Welcome " + person.lastName.toUpperCase + " " + person.firstName.toUpperCase
    case _ => "Hey Anonymous"
  }

  def testGreetPeople(greetingFunction: Person => String): Unit = {
    def people = List(
      new Person("john", "doe"),
      new Person("Foo", "bar"),
      new Person("fizz", "buzz"),
      new Person("X", "Y"))

    people.foreach(p => println(greetingFunction.apply(p)))
  }
}

class Person(var firstName: String, var lastName: String ) { }

