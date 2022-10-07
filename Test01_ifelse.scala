package chapter04

import scala.io.StdIn

object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    println("enter your age: ")
    val age: Int = StdIn.readInt()

    //单分支
    if (age >= 21) {
      println("You are an adult")
    }

    println("========================")

    //双分支
    if (age >= 18) {
      println("You are an adult")
    } else {
      println("You are not an adult")
    }


    println("========================")

    //多分支
    if (age <= 6) {
      println("You are a kid")
    } else if (age < 18) {
      println("You are teenager")
    } else if (age < 35) {
      println("You are an adult")
    } else if (age < 60) {
      println("You are on your middle age")
    } else {
      println("senior")
    }

    println("========================")

    //分支语句的返回值
    val ret: Any = if (age <= 6) {
      println("You are a kid")
      age
    } else if (age < 18) {
      println("You are teenager")
      "You are teenager"
    } else if (age < 35) {
      println("You are an adult")
      "You are an adult"
    } else if (age < 60) {
      println("You are on your middle age")
      "You are on your middle age"
    } else {
      println("senior")
      age
    }

    println(ret)
    val ret1 = if (age > 60) "senior" else "young man"
    println(ret1)

    println("========================")

    //嵌套分支
    val ret2 = if (age >= 18) {
      println("adult")
      if (age >= 35) {
        if (age >= 60) {
          println("old man")
        } else {
          print("middle age man")
        }

      } else {
        print("young man")
      }
    } else {
      println("not adult")
      if (age <= 6) {
        println("kid")
        age
      }
    }

    println(ret2)

  }
}
