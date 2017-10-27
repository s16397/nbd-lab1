package nbd1

object Task9 {

  def main(args: Array[String]): Unit = {
    val originalList = (1 to 10).toList
    println("Original list: " + originalList)
    val number = 5
    println("List with number: " + number + " added: " + addNumberToListElements(originalList, number))
  }

  def addNumberToListElements(originalList: List[Int], number: Int): List[Int] = {
    originalList.map(_ + number)
  }

}
