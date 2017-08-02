package scala.hackerrank

/**
  * Created by Naina Jain on 1/8/17.
  */
/*
  This programs implements Super Digit.
  HackerRank Link - https://www.hackerrank.com/challenges/super-digit
 */
object SuperDigit {
  def main(args: Array[String]): Unit = {
    val data = scala.io.StdIn.readLine().split(" ")
    var acc:Int = 0
    def SuperDigit(num:String):Int={
      acc =0
      val intDigits = num.map(_.asDigit).toList
      intDigits.map(x=> acc+=x)
      if(acc >=10) {
        val newNum = acc
        SuperDigit(newNum.toString)
      } else acc
    }
    val initial =SuperDigit(data(0)) * data(1).toInt
    print(SuperDigit(initial.toString))
  }
}
