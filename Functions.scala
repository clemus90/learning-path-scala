object Functions extends App {
  val f1: Int => Int = (x:Int) => x + 1

  val f0: () => Int = () = 1
  }

  val f2 (Int, String) => String = (x:Int, y:String) => y + x
  }

  println(f1(3))
  println(f0())
  println(f2(3, "Wow"))
}
