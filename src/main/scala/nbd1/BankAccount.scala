package nbd1

class BankAccount(val balance: Double) {

  def this() = this(0.0)

  def withdraw(amount: Double): Double = {
    if (balance - amount >= 0.0) amount else 0.0
  }

  def deposit(amount: Double): Double = {
    amount
  }

}
