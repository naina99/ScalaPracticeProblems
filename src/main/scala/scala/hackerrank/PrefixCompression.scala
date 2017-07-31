package scala.hackerrank
import scala.util.control.Breaks._

/**
  * Created by Naina Jain on 28/7/17.
  */
/*
  This programs implements Prefix Compression.
  HackerRank Link - https://www.hackerrank.com/challenges/prefix-compression
 */
object PrefixCompression {
  def main(args: Array[String]): Unit = {
    val firstString = args(0)
    val secondString = args(1)
    val prefix = new StringBuilder()
    breakable {
      firstString.zip(secondString).foreach((x) => {
        if (x._1 == x._2) prefix.append(x._1) else break
      })


    }
    val len = prefix.length
    println(len+ " "+ prefix)
    println(firstString.length-len+" "+firstString.substring(len))
    println(secondString.length-len+" "+secondString.substring(len))

  }

}
