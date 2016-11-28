package com.backfield.chapter2

object CommonVal{

  def myFunction(input: String) : String = {
    input + " (" + input.length + ")"
  }

  def myFunction2(input: String): String = {
    input.filter(c => !List('a', 'e', 'i', 'o', 'u').contains(c.toLower)) +
      " (" + input.filter(c => !List('a', 'e', 'i', 'o', 'u').contains(c.toLower)).length() + ")"
  }

  def myFunction3(input: String): String = {
    val constantOnly = input.filter(c => !List('a', 'e', 'i', 'o', 'u').contains(c.toLower))
    constantOnly + " (" + constantOnly.length + ")"
  }

  val vowels = List('a', 'e', 'i', 'o', 'u')

  def myFunction4(input: String): String = {
    val constantOnly = input.filter(c => !vowels.contains(c.toLower))
    constantOnly + " (" + constantOnly.length + ")"
  }

  def main(args: Array[String]): Unit = {
    println(myFunction("Testing Function"))
    println(myFunction2("Testing Function"))
    println(myFunction3("Testing Function"))
    println(myFunction4("Testing Function"))
  }
}
