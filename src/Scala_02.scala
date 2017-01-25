/**
  * Created by king on 2017/1/25.
  *
  * 值都是有类型的，

  * Scala的表达式都是有值的
  *
  * 在Scala中的if/else表达式有值，具体的值是跟在if/else之后的表达式的值。
  * if / else 两者后面跟的值不一定是同一类型。
  * 如果不是同一类型，则它们属于 两者的公共超类：Any
  *
  * 详细可以参看：Scala的源码
  *
  * 如果if语句没有else，但是在Scala中，每个表达式都应该是有值的。这种情况的解决方案是引入一个Unit类，写为（）。
  *
  * 故   if(value > 0)  1    不带else的这个语句等同于   if(value >0) 1 else ()
  *
  * 对于()可理解为“Java/C++等编程语言中”的void ,是个“无有用值”的占位符。
  * （从本质上来讲，void没有值但是Unit有一个表示“无值”的值。打个比方，这就好比是“没有钱”和“有银行卡，但卡里没钱”的区别）
  *
  * Scala没有switch语句
  *
  * Scala的分号不是必须的，除非是一行中存在多个语句（不建议）
  *
  *
  *
  */
object Scala_02 {
  def main(args: Array[String]): Unit = {
    println("Scala的if/else 语法结构")
    val i = 2;
    val result = if (i > 0) 1 else -1;
    println("在Scala中，任何表达式都有值：" + result);

    val value = 6
    val  result_value = if(value>5) "value大于5" else value;
    println("表达式的类型可以不是同一类型："+result_value)

    println("----------------else 缺失-----")

    val res = scala.io.StdIn.readInt();

    val res_result = if(res>9) 1
    println(res_result+"");
  }

}
