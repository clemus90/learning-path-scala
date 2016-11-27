object FilterFunction extends App{
  val a = 1 to 10
  println(a.filter(x => x % 2 == 0))
  println(a.filterNot(x => x % 2 == 0))
  println(a.exists(x => x % 2 == 0))
  println(a.filter(_ % 2 == 0))
  println(a.filterNot(_ % 2 == 0))
  println(a.exists(_ % 2 == 0))
}
