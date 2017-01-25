
/**
  * Created by king on 2017/1/23.
  *
  * Scala输入和输出
  *
  * 输出：1、print()
  *       2、println()  换行
  *
  * 输入：使用readLine()函数从控制台读取一行输入。如果要读取数字，Boolean或者
  * 字符。
  * 1.  readInt()
  * 2.  readDouble()
  * 3.  readByte()
  * 4.  readShort()
  * 5.  readLong()
  * 6.  readFloat()
  * 7.  readBoolean()
  * 8.  readChar()
  * 9.  readLine()
  * -------------------------------------------------
  *  与其他函数不同，readLine带一个参数作为提示符。
  *
  * Warnings!!!
  *  readXXX() in  trait DeprecatedPredef  is deprecated(since 2.11.0),我们应该使用
  *这些方法前，要加前缀：scala.io.StdIn.readXXX()
  *
  */
object Scala_01 {
  def main(args: Array[String]): Unit = {
    print("Hello,world")

    val name = scala.io.StdIn.readLine("Your name: ");
    println(name)

    val age = scala.io.StdIn.readInt()
    printf("Hello, %s ! This year , your are %d .\n",name,age);

    val weight = scala.io.StdIn.readFloat();
    printf("Your weight is %f",weight);


  }
}
