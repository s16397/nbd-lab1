package nbd1

object Task10 {

  def main(args: Array[String]): Unit = {
    val originalList = (-15.0 to 20.0 by 0.5).toList
    println("Original List: " + originalList)
    println("Filtered list of absolute values: " +
      filterElementsFromRangeUsingFilteringFunction(originalList, -5, 12, Math.abs))
  }

  def filterElementsFromRangeUsingFilteringFunction(originalList: List[Double],
                                                    rangeStart: Int,
                                                    rangeEnd:  Int,
                                                    filteringFunction: Double => Double): List[Double] = {
    originalList.filter(d => d >= rangeStart && d <= rangeEnd)
                .map(filteringFunction)

  }
}
