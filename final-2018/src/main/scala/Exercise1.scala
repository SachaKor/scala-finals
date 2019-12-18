object Exercise1 {

  def flatMap[T](list: List[T], f: T => List[T]): List[T] = { 
    var in = list
    var out: List[T] = Nil
    while (in.nonEmpty) {
      out = out ::: f(in.head)
      in = in.tail 
    }
    out 
  }

  def flatMap1[T](list: List[T], f: T => List[T]): List[T] = list match 
    case x::xs => f(x) ::: flatMap1(xs, f)
    case Nil => Nil 

  def reverse[T](li: List[T]): List[T] = li match 
    case Nil => Nil 
    case x::xs => reverse(xs) ++ List(x)

  def reverse1[T](list: List[T], f: T => List[T]): List[T] = 
    def loop(li: List[T], acc: List[T]): List[T] = li match 
      case Nil => acc
      case x::xs => loop(xs, x :: acc)
    loop(list, Nil)

  def flatMap2[T](list: List[T], f: T => List[T]): List[T] = {
    def loop(li: List[T], acc: List[T]): List[T] = li match
      case Nil => acc
      case x::xs => loop(xs, f(x) ::: acc)
    loop(list, Nil)
  }


  def main(args: Array[String]) = {
    val l = List(List(1, 2), List(3, 4, 5), List(6))
    // println(l.flatMap(x => x))
    val l1 = List(1, 2, 3)
    def f(x: Int) = List(x-1, x)
    // List(0, 1, 1, 2, 2, 3)

    println(flatMap(l1, f))
    // println(flatMap2(l1, f))
    println(flatMap2(reverse(l1), f))
    // List(0, 1) ::: Nil
    // List(1, 2) ::: List(0, 1) ::: Nil

    // List(1, 2, 3) => List(3, 2, 1)
    // List(2, 3) ::: Nil
    // List(1, 2) ::: List(2, 3) ::: Nil
    // List(0, 1) ::: List(1, 2) :: List(2, 3) ::: Nil
  }
}