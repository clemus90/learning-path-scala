object Lists extends App {
  val a = List(1,2,3,4,5)
  val a2 = List.apply(1,2,3,4,5)
  val a3 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

  println(a.head)
  println(a.tail)
  println(a.init)
  println(a.last)

  println(a(4))
  println(a.apply(4))
  println(a.min)
  println(a.max)
  println(a.isEmpty)
  println(a.nonEmpty)
  println(a.updated(3,100))

  println(a.mkString(","))
  println(a.mkString("[","**","]"))
}
