object NamingConventions {

  def process(str: String) : String = {
    str.toLowerCase
  }

  /*def convertStringToLower(str: String) : String = {
    str.toLowerCase
  }*/

  def convertStringToLower(input: String) : String = {
    input.toLowerCase
  }

  def uppercaseCSVWithLength(input: String, length: Int) : String  = {
    input.split(",").map(str => if(str.length == length) str.toUpperCase else str).mkString(",")
  }

  def main(args: Array[String]): Unit = {
    println(process("Foo"))
    println(convertStringToLower("Foo"))
    println(uppercaseCSVWithLength("foobar,sha,ba", 2))
  }

}
