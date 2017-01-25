/**
  * Created by king on 2017/1/25.
  *
  * Scala的块表达式和赋值
  *
  * 在Scala中，{}块包含一系列表达式，其结果也是一个表达式。块中
  * 最后一个表达式的值就是 块的值。
  *
  * 这种情况对于某个需要分步初始化的情况非常有用。
  * 比如：计算两点之间的距离
  * val  distance = {
  * val dx = x - x0;
  * val dy - y - y0;
  * sqrt(dx * dx  + dy * dy)
  * }
  *
  * 在Scala中，赋值动作是Unit类型，写做：()
  *
  * 由于赋值语句的值是 Unit类型，所以别把它们串接起来
  * 如 x = y = z // don't do this
  *
  *
  */
object Scala_03 {
  def main(args: Array[String]): Unit = {
    var x = 0;
    var y = 0;
    var z = 0;

//    x = y = z; //Expression of type Unit doesn't conform to expected type Int
  }
}
