package chapter05

object Test01_FunctionAndMethod {
  def main(args:Array[String]) : Unit = {

    //定义函数
    def sayHi(name: String):Unit = {
      println("hi, " + name)
    }

    def sayGoodBye(name: String) : Unit = {
      println("GoodBye! " + name)
    }
    //调用函数
    sayHi("dashagua")
    sayGoodBye("Maya")
    //调用对象方法（下面那个大写的Hi）
    Test01_FunctionAndMethod.sayHi("bob")


    //获取方法返回值

    val ret = Test01_FunctionAndMethod.sayHello("Amy")
    val ret0 = Test01_FunctionAndMethod.sayGoodBye("Amy")
    println("==============")
    println(ret)
  }


  //定义对象方法
  def sayHi(name: String):Unit = {
    println("Hi, " + name)
  }

//  def sayHello(name: String) : Any = {
//    println("Hello, " + name)
//    return "hello"
//  }

  def sayGoodBye(name: String) : Unit = {
    println("GoodBye! " + name)
  }


}
