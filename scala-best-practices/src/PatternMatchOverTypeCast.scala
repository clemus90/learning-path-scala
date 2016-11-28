object PatternMatchOverTypeCast {

  def myFunction(input: Any) : String = {
    input.asInstanceOf[String]
  }

  def myFunction2(input: Any): Option[String] = {
    if(input.isInstanceOf[String]) {
      Some(input.asInstanceOf[String])
    }else{
      None
    }
  }

  def myFunction3(input: Any): Option[String] = input match {
    case in: String => Some(in)
    case _ =>  None
  }

  def main(args: Array[String]): Unit = {
    println(myFunction("foo"))
    try {
      println(myFunction(3))
    } catch {
      case e : Throwable => e.printStackTrace()
    }
    println(myFunction2(3))
    println(myFunction2("foo"))

    println(myFunction3(3))
    println(myFunction3("foo"))
  }
}