package scala.hackerrank

/**
  * Created by Naina Jain on 27/7/17.
  */
/*
  This programs implements String Mingling.
  HackerRank Link - https://www.hackerrank.com/challenges/string-mingling
 */

object StringMingling {
  def main(args: Array[String]): Unit ={
    val firstString:String = args(0)
    val secondString:String = args(1)
    var a = new StringBuilder()
    var combinedString = firstString zip secondString
    combinedString.map((x) =>{
      a.append(x._1).append(x._2)
    })
    println(a)
  }

}
