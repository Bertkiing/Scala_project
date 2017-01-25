/**
  * Created by king on 2017/1/25.
  *
  * Scala的循环语句
  *
  * Scala 的while 和 do ...while循环  和其他语言(Java 或 C++)一样
  *
  * Scala没有for(初始化变量;检查变量是否满足某条件；更新变量）这样的for结构循环语句；
  *
  * Scala有自己的for语句：
  *  for(i <- 表达式）
  *  让变量i 遍历 <- 右边 的表达式的所有值。至于遍历具体如何执行，则取决于表达式的类型。
  *
  *  注意：在for循环的变量之前并没有val 或 var 的指定。该变量的类型是集合的元素类型。
  *  循环变量的作用域一直持续到循环结束。
  *
  *  这里需要注意 to  和  until 的区别：
  *  1. to 方法   包括上限
  *  2. until 方法  不包括上限
  *
  *  Scala中并没有提供break 或 continue 语句 退出循环
  *
  *  Scala 的for循环有很多高级用法
  *
  *  变量 <- 表达式 可以有多个，使用分号(;)将它们隔开。
  *  也可以使用很多定义，也是以分号隔开；
  *  且每一个(变量 <- 表达式 )的结构都可以带一个守卫,以 if开头的Boolean表达式 ，注意 if 之前是没有分号的
  *
  *   如果for循环的循环体以yield 开始，则该循环会构造出一个集合，每次迭代生成集合中的一个值。
  *
  *   var result = for(i <- 1 to 10 ) yield (i % 3) // Vector(1,2,0,1,2,0,1,2,0)
  *  这类循环又叫做：for 推导式
  *  for推导式 生成的集合 与它的第一个生成器 是类型兼容的
  *
  *
  *  （----------------------------------以下只作了解，不建议这么做，Scala规则太松了。。。）
  *  PS：If you like ,你也可以将生成器、守卫、和定义包含在花括号当中，并可以以换行的方式而不是分号来分隔他们
  *
  *
  */
object Scala_04 {
  def main(args: Array[String]): Unit = {
    println("Scala的循环控制");

    var input = scala.io.StdIn.readInt();
    while(input>0){
      println("While  循环的 the result:"+input)
      input -= 1;
    }

    println("Scala的for循环语句：")
    val n = scala.io.StdIn.readInt();
    for(i <- 1 to n){
      println("Scala for 语句的 to 方法 :"+ i);
    }

    for(i <- 1 until n){
      println("Scala for 语句的 until 方法："+i)
    }


    val s  = "Hello"
    var sum = 0
    for (i <- 0 until s.length){
      sum += s(i);
    }
    println("sum = "+ sum)


    for(i <- 1 to 3; j <- 1 to 3 ){
        println("Scala for循环的高级特性" +(10*i + j))
    }

    println("带守卫的for循环")

    for(i <- 1 to 3; j <- 1 to 3 if i != j){
      println(" "+ (10 * i + j));
    }

    println("for 推导式")

    val  result = for (i <- 1 to 10) yield (i % 3);
    println(" " +result)




  }
}
