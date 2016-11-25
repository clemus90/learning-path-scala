object Sets extends App {
  val set = Set(1,2,3,4)
  val set2 = Set(1,2,3,4,5)
  val set3 = Set(1,2,3,4,5,6)
  val set4 = Set(1,2,3,4,5,6,6,7)

  println(set)
  println(set2)
  println(set3)
  println(set4)

  val set5 = Set(1,2)
  println(set diff set4)
  println(set4 diff set)
  println(set union set3)
  println(set intersect set3)
  println(set5 intersect set4)

  println(set ++ set2)
  println(set ++ List(15, 19, 20))

  println(set -- set5)
  println(set -- Set(3,4,5))
  println(set - 3)

  println(set.apply(4))
  println(set.apply(10))
  println(set.contains(10))
  println(set(10))
}
