val ada = new Employee("Ada", "Lovelace")
println(ada.firstName)

val newAda = ada.copy(lastName = "Byron, Countess of Lovelace")
println(newAda.lastName)

val dennis = new Employee(lastName="Ritchie", firstName="Dennis")
println(s"The first name is ${dennis.firstName}")
println(s"The last name is ${dennis.lastName}")

println(ada.fullName)
println(newAda.fullName)
println(dennis.fullName)
