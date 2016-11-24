object Functions extends App {
  val f1:Function1[Int, Int] = new Function[Int, Int] {
    def apply(x:Int): Int = x + 1
  }

  val f0 Function0[Int] = new Function0[Int]{
    def apply() = 1
  }

  val f2 Function2[Int, String, String] = new Function0[Int, String, String]{
    def apply(x:Int, y:String) = y + x
  }

  println(f1(3))
  println(f0())
  println(f2(3, "Wow"))
}
