package nbd1

object Task4 {

  def main(args: Array[String]): Unit = {
    val products = Task2.generateProductsWithPrices()
    val  maybePrice = products.get("key")
    println("Price: " + maybePrice.getOrElse(100.0))
  }
}
