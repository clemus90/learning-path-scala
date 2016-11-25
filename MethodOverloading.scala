def addNum(x:Int) = x + 1
def addNum(x:Double) = x + 30.0
def addNum(x:String) = x + 19

println(addNum(30))
println(addNum(40.0))
println(addNum("Hello "))

def addTen(x:Int):Int = x + 10
//def addTen(x:Int):Double = x + 19.0 will not work
def addTen(x:Double):Double = x + 19.0
println(addTen(40))
