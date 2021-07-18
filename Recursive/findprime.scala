
object findprime extends App{
  def prime(i:Int):Boolean = {
    if (i<=1)
        false
    else if (i==2)
        true
        //the n in equation i % n == 0
        //exists in the range (# to #)
    else if (!(2 to (i-1)).exists(n => i % n == 0))
    //if the number entered is 10,
    //for each number from 3 to 9,
    //when 10 is divived by each of those numbers,
    //the remaninder should not be 0.
    //it should be 0 only when 10 is divided by 1 and itself,
    //if it is a prime.
        true
    else
        false
  }
  println(prime(5));
  println(prime(8));
}
