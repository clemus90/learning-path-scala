object AvoidComplexStructuralTyping {

  class Foo(val foo: String){
    def bar(): String = foo
  }

  def myFunction(input: {def bar() : String}) : String = {
    input.bar().toLowerCase
  }

  def myFunction1(input: {def foo : String}) : String = {
    input.foo.toLowerCase
  }

  def myFunction2(input: {def foo: String; def bar(): String}): String = {
    input.foo.equals(input.bar()).toString
  }

  type NewType = { def bar(): String; def foo: String}

  def myFunction3(input: NewType): String = {
    input.foo.equals(input.bar()).toString
  }

  trait MyTrait {
    def foo: String
    def bar(): String
  }

  def myFunction4(input: MyTrait): String = {
    input.foo.equals(input.bar()).toString
  }

  def myFunction5(input: () => String): Unit = {
    input().toLowerCase
  }



  def main(args: Array[String]): Unit = {
    println(myFunction(new Foo("FoO")))
    println(myFunction1(new Foo("FoO")))
    println(myFunction2(new Foo("FoO")))
    println(myFunction3(new Foo("FoO")))
    println(myFunction4(new Foo("FoO") with MyTrait))
    println(myFunction5(new Foo("FoO").bar))
  }
}
