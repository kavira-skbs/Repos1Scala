import scala.collection.mutable.ListBuffer
object SumOfEvens extends App{
    def SumEven(list: List[Int]):Int = list match {
      case Nil => 0
      case head :: tail => head + SumEven(tail)
    }

    println("Enter the Number")
    val num = scala.io.StdIn.readInt()
    println("Sum of all even numbers from 1 to " + num)
    var x = List.empty[Int]
    //x: List[Int] = List()
    for (y <- 1 to num if y%2 == 0) {
       x :+= y
    }

    println(SumEven(x));
}
