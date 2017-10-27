package nbd1

object Task3 {

  def main(args: Array[String]): Unit = {
    printTuple3(("OK", 1.0, false))
  }

  def printTuple3(tupleToPrint: Tuple3[String, Double, Boolean]): Unit = {
    println("First tuple element: " + tupleToPrint._1)
    println("Second tuple element: " + tupleToPrint._2)
    println("Third tuple element: " + tupleToPrint._3)
  }

}
