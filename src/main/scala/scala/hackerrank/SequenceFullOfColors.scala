package scala.hackerrank

/**
  * Created by Naina Jain on 2/8/17.
  */
/*
  This programs implements Sequence Full Of Colors.
  HackerRank Link - https://www.hackerrank.com/challenges/sequence-full-of-colors
 */
object SequenceFullOfColors {
  def main(args: Array[String]): Unit = {
    val num = scala.io.StdIn.readInt()
    def check(num:Int):Int={
      val colorString = scala.io.StdIn.readLine().toList
      println(countValues((0,0,0,0),colorString))
      def countValues(count:Tuple4[Int,Int,Int,Int],clrStr:List[Char]):String={
        if(clrStr.isEmpty) {
          if (count._1 == count._2 && count._3 == count._4) "True" else "False"
        }
        else if((count._1 - count._2) >1 || (count._3 - count._4) >1 ) "False"
        else{
          if(clrStr.head == 'R') countValues(count.copy(_1= count._1+1),clrStr.tail)
          else if(clrStr.head == 'G') countValues(count.copy(_2= count._2+1),clrStr.tail)
          else if(clrStr.head == 'Y') countValues(count.copy(_3= count._3+1),clrStr.tail)
          else countValues(count.copy(_4= count._4+1),clrStr.tail)
        }
      }
      if(num>1) check(num-1) else 0
    }
    check(num)
  }

}
