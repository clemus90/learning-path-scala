class Foo(x:Int) {
  def bar(y:Int) = x + y
  def gym(z:Int, a:Int) = x + z + a
}

class Baz(z:Int){
  def qux(f:Int => Int) = f(z)
  def jam(f:(Int, Int) => Int) = f(z, 10)
}

object ConvertingDefsToFunctions extends App{
  val x = new Foo(10)
  val f = x.bar _
  println(f.apply(20))
  println(f(20))

  val z = new Baz(20)
  println(z.qux(f))
  println(z.qux(x.bar _))
  println(z.qux(x.bar)) // special sintax when last character is _ (doesnt mean that you can pass methods as parameters)
  println(z.qux(x.bar _))

  val f2 = x.gym(40, _:Int)
  println(z.qux(f2))

  val f3 = x.gym _
  println(z.jam(f3))
  println(z.jam(x.gym _))
  println(z.jam(x.gym))
}
