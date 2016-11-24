object Curryng extends App {
  val g = (x:Int) => (y:Int) => x + y
  val f = (x:Int, y:Int) => x + y
  val fc = f.curried // same as g
  val f2 = Function.uncurried(fc) // same as f
  println(f2(4,5))
}
