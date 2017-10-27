package nbd1

object Task8 {

  def main(args: Array[String]): Unit = {
    val listWithZeros = List.tabulate(21)(n => n % 5)
    println("List with zeros: " + listWithZeros)
    println("List with zeros removed: " + removeElementFromList(listWithZeros, 0))
  }

  def removeElementFromList(listOfElements: List[Int], elementToRemove: Integer): List[Int] = {
    listOfElements.filter(_ != 0)
  }
}
