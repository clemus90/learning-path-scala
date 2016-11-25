object Maps extends App{
  val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
  val m2 = Map((1, "One"), (2, "Two"), (3, "Three"))

  val t:(Int, String) = 3 -> "Three"
  println(t)

  val m3 = Map.apply(1 -> "One", 2 -> "Two" , 3 -> "Three")

  println(m3.get(1))
  println(m3.apply(1))
  println(m3(1))
  println(m3.get(4))
  //println(m3.(4)) // Error

  println(m3.toList)
  println(m3.keys)
  println(m3.keySet)
  println(m3.values)
  println(m3.values.toSet)

  val s = new String("Co")
  val s2 = "Co" //interned
  println (s == s2)
  println (s eq s2)

  val co = Symbol("Co")
  val co2 = 'Co
  println(co == co2)
  println(co eq co2)

  val elements:Map[Symbol, String] = Map('Co -> "Cobalt", 'He -> "Helium", 'Pb -> "Lead")
  println(elements.get('Co))
}
