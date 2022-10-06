package chapter05

object Test03_FunctionParameter {
  def main(args:Array[String]):Unit = {
    //1。 可变参数
    def f1(str: String*):Unit = {
      println(str)
    }
    f1("Angela")
    f1("Angela", "Yimin","Bob")

    //2.如果参数列表有可变参数，那么可变参数一般放在最后
    def f2(str1: String,str2: String*):Unit = {
      println("str1 = " +str1 + " str2 = "+str2)
    }
    f2("Angela")
    f2("Angela", "Yimin","Bob")

      //3. 参数默认值，一般将有默认值的参数放在最后
      def f3(name: String = "Scala"):Unit = {
        println("I am learning "+ name)
      }
    f3("Kotlin")
    f3()

    //4。带名参数
    def f4(name:String = "Yimin", age:Int):Unit = {
      println(s"${age}岁的${name}在学习Scala")
    }
    f4("Angela",19)
    f4(age=20,name="Bob")
    f4(age=25)



  }

}
