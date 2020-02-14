package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    val my2dArray = Array.ofDim[Int](r + 1, r + 1)
    for (row <- 0 to r) {
      for (col <- 0 to row) {
        if (col == row || col == 0) {
          my2dArray(row)(col) = 1
        }
        else {
          my2dArray(row)(col) = my2dArray(row - 1)(col - 1) + my2dArray(row - 1)(col)
        }
      }
    }

    my2dArray(r)(c)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
