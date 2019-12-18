object Exercise4 {
  // def transposeList(li: List[List[String]]): List[List[String]] = {
  //   def loop(list: List[List[String]], acc: List[List[String]], i: Int, j: Int): List[List[String]] = list match 
  //     case Nil => Nil 
  //     case x::xs => if(i == 0) then {
  //       val l = List(x.head)
  //       loop(xs, acc ++ List(l), i+1, j)
  //     } else {
  //       val newAcc = 
  //       loop(xs, acc.get(i) ++ List(x.head), i+1, j)
  //     }

  //   loop(li, Nil, 0, 0)
  // }

  def main(args: Array[String]) = {
    val s = LazyList(1, 2, 3);
    println(s.size);

    val s1 = List(List("1", "2", "3"), List("4", "5", "6"))
    // s1.foldLeft(List[List[String]]())((acc, el) => )
  }
}