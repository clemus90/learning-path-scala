object FunctionsWithFunctions extends App{
  val f:(Int, Int => Int) => Int = (x:Int, y:Int => Int) => y(x)
  println(f(3, (m:Int) => m + 1))
  println(f(3, m => m + 1))
  println(f(3, _ + 1))
  println(f(3, 1 + _))
  println(f(3, 1 +)) // if underscore is the last character it can be ommited

  val g = (x:Int) => (y:Int) => x + y
  println(g(4)(5))
  println(g.apply(4).apply(5))
}
