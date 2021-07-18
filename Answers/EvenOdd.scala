object EvenOdd extends App{
  def EvenOrOdd(n:Int):String = {
    n%2 match {
      case 0 => "Even"
      case _ => "Odd"
    }
  }

  println("Enter a positive integer")
  val num = scala.io.StdIn.readInt()
  println("Number " + num + " is " + EvenOrOdd(num))
}
