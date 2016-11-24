object Tuples extends App {
  val t = (1, "Cool", 402.00)
  println(t._1)
  println(t._2)
  println(t._3)

  val t1:(Int, String, Double) = t
  val t2:Tuple3[Int, String, Double] = t

  case class Department(name:String)
  val u = ("4", Department("QA"))
  println(u)
  val u2 = u.swap
  println(u2)
}
