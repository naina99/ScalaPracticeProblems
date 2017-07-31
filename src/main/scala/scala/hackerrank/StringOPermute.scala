package scala.hackerrank

/**
  * Created by Naina Jain on 28/7/17.
  */

/*
  This programs implements String permutation.
  HackerRank Link - https://www.hackerrank.com/challenges/string-o-permute
 */
object StringOPermute {
  def main(args: Array[String]): Unit = {
    val num = scala.io.StdIn.readInt()
    var str = new Array[String](num)
    var temp:String = ""
    for (a <- 1 to num) {
      str(a-1) = scala.io.StdIn.readLine()
    }
    /*str.foreach(word => {
      for(i <- 0 to (word.length-1);if (i%2==0 && i<word.length-1)){
        temp =temp + word.charAt(i+1) + word.charAt(i)
      }
      if(word.length%2 !=0)
        temp = temp+word.charAt(word.length-1)
      println(temp)
      temp=""
    })*/
    str.map(_.grouped(2).map(_.reverse).mkString(""))
      .map(println)

  }

}
