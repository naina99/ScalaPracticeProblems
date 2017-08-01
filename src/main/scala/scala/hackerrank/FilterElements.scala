package scala.hackerrank
import scala.collection.mutable.ArrayBuffer
/**
  * Created by Naina Jain on 28/7/17.
  */
/*
  This programs implements Filter Elements.
  HackerRank Link - https://www.hackerrank.com/challenges/filter-elements
 */

//TODO: SOlve this in O(n lg n)
object FilterElements {
  def main(args: Array[String]): Unit = {
    val num = scala.io.StdIn.readInt()
    filter(num)
    def filter(num:Int):Unit = {
      //num - Total number of test cases
      //dataInfo(0) - Total no. of elements
      //dataInfo(1) - Offset Value
      //data - Array of elements
      val dataInfo = scala.io.StdIn.readLine().split(" ").map(x => x.toInt).toList
      val data = scala.io.StdIn.readLine().split(" ").map(x => x.toInt).toList
      val listData = data.filter(x=> data.count(_ == x) >= dataInfo(1))
      if(listData.isEmpty)
        print("-1")
      else
        listData.distinct.map(x=> printf(x + " "))
      println()
      if(num>1) filter(num-1)
    }

  }

}


