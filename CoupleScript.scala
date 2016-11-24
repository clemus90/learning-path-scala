val coupleIntString = new Couple(10, "Scala") //Couple[Int, String]
val coupleIntString2:Couple[Int, String] = new Couple(10, "Scala") //Couple[Int, String]
val coupleStringString = new Couple("One", "Two") //Couple[String, String]
val coupleDoubleInt = new Couple(30.123, 3) //Couple[Double, Int]
val coupleStringIntDouble = Couple("str", Couple(1, 2.0)) //Couple[String, Couple[Int, Double]]

println(coupleStringIntDouble.second.second)

val employeeCouple = Couple(new Employee("John", "McCarthy"), new Employee("Guido", "van Rossum"))
println(employeeCouple)
println(employeeCouple.swap)
