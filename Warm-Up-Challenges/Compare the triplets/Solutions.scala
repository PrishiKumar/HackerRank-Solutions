import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Long]) {

     
      var sum : Long = arr.sum
      var min : Long =arr.min
      var max : Long = arr.max

     var answer1 : Long = sum - max
     var answer2 : Long = sum - min

     println(answer1 +" " +answer2)
      
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = stdin.readLine.split(" ").map(_.trim.toLong)
        miniMaxSum(arr)
    }
}
