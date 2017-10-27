package nbd1

object Task5 {

  def main(args: Array[String]): Unit = {
    println(resolveDayOfWeek("Poniedzialek"))
    println(resolveDayOfWeek("Sobota"))
    println(resolveDayOfWeek("Weekend"))
  }

  def resolveDayOfWeek(dayOfWeek: String): String = {
    dayOfWeek match {
      case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "Such a day does not exist"
    }
  }
}
