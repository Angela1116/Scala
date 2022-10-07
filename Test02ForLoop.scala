package chapter04

import scala.Range
import scala.language.postfixOps

object Test02ForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if i != 5) {

      println(i)
    }
    println("==============")
    for (i <- Set(12, 15, 45, 78, 12)) {
      println(i)
    }

    println("==============")
    for (i <- 10 to 1 by -2) {
      println(i)
    }

    println("==============")
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }

    println("==============")
    //简写上面
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j} \t")
      if (j == i) println()
    }

    println("==============")
    //循环引入变量
    for (i <- 1 to 10) {
      val j = 10 - i
      println("i = " + i + "  j = " + j)
    }
    println("-------------")

    for (i <- 1 to 10; j = 10 - i) {
      println("i = " + i + "  j = " + j)
    }

    println("==============")
    //循环返回值

    println("==============")
    //打印输出一个九层妖塔
    //star=2n-1个星星， space=9-n个空格
    for (i <- 1 to 9) {
      val star = 2 * i - 1
      val space = 9 - i
      println(" " * space + "*" * star)
    }

    //简写上面
    for (i <- 1 to 9; star = 2 * i - 1; space = 9 - i)
      println(" " * space + "*" * star)

    for (star <- 1 to 17 by 2; space = (17 - star) / 2) {
      println(" " * space + "*" * star)
    }
  }

  //循环返回值
  val a: Unit = for (i <- 1 to 10) {
    println(i)
  }
  println("a = " + a)
  println("a = " + a + a)

}