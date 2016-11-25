val g:Any = "Ice, ice, Call me maybe"
val h:String = g.asInstanceOf[String]

def decide(x:Any) = if(x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide(4))
println(decide("Hello !"))

def decidePooly(x:Any) = x.asInstanceOf[Int] + 10

println(decidePooly(40))
//println(decidePooly("HELLO") Will not work
