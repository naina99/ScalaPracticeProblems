package scala.hackerrank

/**
  * Created by Naina Jain on 28/7/17.
  */
/*
  This programs implements String Compression.
  HackerRank Link - https://www.hackerrank.com/challenges/string-compression/problem
 */
object StringCompression {
  def main(args: Array[String]): Unit = {
    val inputString = args(0) +"|"
    var count=1
    var temp = new StringBuilder
    inputString.reduce((x,y) => {
      if(x == y) {
        count = count + 1
      }else {
        if(count > 1) temp.append(x).append(count)
        else temp.append(x)
        count = 1
      }
      y
    })
    println(temp)
  }

}
