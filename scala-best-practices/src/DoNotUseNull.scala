object DoNotUseNull{

  def myFunction(input: String): String ={
    if(input == null){
      null
    }else{
      input.toLowerCase
    }
  }

  def myFunction2(input: Option[String]): Option[String] ={
    input.map(_.toLowerCase)
  }

  def myFunction3(input: String): Option[String] = {
    if(input.contains("@")){
      None
    }else{
      Some(input.toLowerCase)
    }
  }



  def main(args: Array[String]): Unit = {
    myFunction("foo")
    myFunction2(Some("foo"))
    myFunction2(None)
    myFunction3("foo")
    myFunction3("foo@bar.com")
  }
}