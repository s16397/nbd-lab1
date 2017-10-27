package nbd1

object Task2 {

  def main(args: Array[String]): Unit = {
    val productsWithOriginalPrices = generateProductsWithPrices()
    printProductsWithPrices(productsWithOriginalPrices, "PRODUCTS WITH ORIGINAL PRICES")

    val productsWithReducedPrices = createProductsWithDiscountedPricesFromOriginalProducts(
      productsWithOriginalPrices, 0.9)
    printProductsWithPrices(productsWithReducedPrices, "PRODUCTS WITH REDUCED PRICES")
  }

  def generateProductsWithPrices(): Map[String, Double] = {
    Map("product1" -> 1.25,
        "product2" -> 2.5,
        "product3" -> 5.0,
        "product4" -> 10.0,
        "product5" -> 25.0)
  }

  def createProductsWithDiscountedPricesFromOriginalProducts(originalProducts: Map[String, Double],
                                                            discount: Double): Map[String, Double] = {
    originalProducts.mapValues(_ * discount)
  }

  def printProductsWithPrices(productsWithPrices: Map[String, Double], printMessage: String): Unit = {
    println(printMessage)
    productsWithPrices.foreach(t => println("Product: " + t._1 + " Price: " + t._2))
    println()
  }

}
