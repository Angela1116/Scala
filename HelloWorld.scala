
package chapter01
import Array._

object HelloWorld {
    def main(args:Array[String]): Unit = {
      var ret = add(1,2)
      var ret1 = add(3,4)

      println("the result is: " + mul(1))
      println("the result is: " + mul(2))
      for(x <- 1 to (ar.length-1)) {
        println(x)
      }

    }
    var ar = new Array[Int](5)
    for(x <- 0 to (ar.length-1)) {


    }
    var greeting: String = "welcome home"
    var greeting1: String = " "
    greeting1.concat(greeting)

    var f = 3
    val mul = (i:Int) => i*f
    def add(a:Int, b:Int) : Int = {
      var sum:Int = 0
      sum = (a+b)*f
      return sum
    }



}


