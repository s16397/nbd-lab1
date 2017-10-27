package nbd1

object Task1 {

  def main(args: Array[String]): Unit = {
    val daysOfWeek = generateDaysOfWeek()
    printListElementsWithForLoop(daysOfWeek)
    printListElementsStartingWithPrefixUsingForLoop(daysOfWeek, "P")
    printListElementsStartingWithPrefixUsingCase(daysOfWeek, "P")
    printListElementsUsingForEach(daysOfWeek)
    println("+++ printListElementsRecursively +++")
    printListElementsRecursively(daysOfWeek)
    println("+++ printListElementsRecursivelyInReverseOrder +++")
    printListElementsRecursivelyInReverseOrder(daysOfWeek)
    printListElementsUsingFoldLeft(daysOfWeek)
    printListElementsUsingFoldRight(daysOfWeek)
    printListElementsStartingWithPrefixUsingFoldLeft(daysOfWeek, "P")
  }

  def generateDaysOfWeek(): List[String] = {
    List("Poniedzalek", "Wtorek", "Sroda", "Czwartek", "Piatek",
      "Sobota", "Niedziela")
  }

  def printListElementsWithForLoop(listToPrint: List[String]): Unit = {
    println("+++ printListElementsWithForLoop +++")
    for (i <- listToPrint.indices) {
      println(listToPrint(i))
    }
  }

  def printListElementsStartingWithPrefixUsingForLoop(listToPrint: List[String],
                                                      prefix: String) : Unit = {
    println("+++ printListElementsStartingWithPrefixUsingForLoop +++")
    for (i <- listToPrint.indices) {
      val element = listToPrint(i)
      if (element.startsWith(prefix)) println(element)
    }
  }

  def printListElementsStartingWithPrefixUsingCase(listToPrint: List[String],
                                                   prefix: String): Unit = {
    println("+++ printListElementsStartingWithPrefixUsingCase +++")
    listToPrint.collect {
      case s if s.startsWith(prefix) => println(s)
    }
  }

  def printListElementsUsingForEach(listToPrint: List[String]): Unit = {
    println("+++ printListElementsUsingForEach +++")
    listToPrint.foreach(println(_))
  }

  def printListElementsRecursively(listToPrint: List[String]): Unit = {
    if (listToPrint.headOption.nonEmpty) println(listToPrint.headOption.get) else return
    printListElementsRecursively(listToPrint.tail)
  }

  def printListElementsRecursivelyInReverseOrder(listToPrint: List[String]): Unit = {
    if (listToPrint.headOption.nonEmpty) {
      printListElementsRecursivelyInReverseOrder(listToPrint.tail)
      println(listToPrint.head)
    } else {
      println("")
    }
  }

  def printListElementsUsingFoldLeft(listToPrint: List[String]): Unit = {
    println("+++ printListElementsUsingFoldLeft +++")
    println(listToPrint.foldLeft("")(_ + " " + _))
  }

  def printListElementsUsingFoldRight(listToPrint: List[String]): Unit = {
    println("+++ printListElementsUsingFoldRight +++")
    println(listToPrint.foldRight("")(_ + " " + _))
  }

  def printListElementsStartingWithPrefixUsingFoldLeft(listToPrint: List[String], prefix: String): Unit = {
    println("+++  printListElementsStartingWithPrefixUsingFoldLeft +++")
    println(listToPrint.foldLeft(""){ (a, e) =>
      if (e.startsWith(prefix)) a + " " + e else a }
    )
  }

}
