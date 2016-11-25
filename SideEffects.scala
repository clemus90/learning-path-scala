var a = 0
def sideEffect():Unit = {
  a = a + 1
}
sideEffect
println(a)
