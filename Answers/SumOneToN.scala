object SumOneToN extends App{
  def SumAll(list: List[Int]):Int = list match {
    case Nil => 0
    case head :: tail => head + SumAll(tail)
  }

  println("Enter the Number")
  val num = scala.io.StdIn.readInt()
  println("Sum of all numbers from 1 to " + num)
  val x = List.range(0,num)
  println(SumAll(x));
}
