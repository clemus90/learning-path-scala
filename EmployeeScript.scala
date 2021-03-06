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

try{
  new Employee("Bono", "", "Singer")
} catch {
  case iae: IllegalArgumentException => println(iae.getMessage)
} finally {
  println("Continuing with our program")
}
try{
  new Employee("Linus", "Torvalds", "Senior C Programmer")
} catch {
  case iae: IllegalArgumentException => println(iae.getMessage)
} finally {
  println("Continuing with our program")
}

val mathematics = new Department("Mathematics")
val alan:Manager = new Manager("Alan", "Turing", "Mathematician, Logician", mathematics)
println(alan.department.name)

val alanEmployee:Employee = alan

println(ada.firstName)
println(newAda.firstName)
println(dennis.firstName)
println(alan.firstName)
println(alanEmployee.firstName)

def extractFirstName(e:Employee) = e.firstName

println(extractFirstName(ada))
println(extractFirstName(dennis))
println(extractFirstName(alan))

println(ada.fullName)
println(newAda.fullName)
println(dennis.fullName)
println(alan.fullName)
println(alanEmployee.fullName)

val alanNewJob = alan.copy(title="Supreme Encryption Specialist")

val anotherAda = new Employee("Ada", "Byron, Countess of Lovelace")
val evenAnotherAda = anotherAda

println(newAda == anotherAda)
println(newAda != anotherAda)
println(newAda eq anotherAda)
println(evenAnotherAda eq anotherAda)

println(newAda.hashCode == anotherAda.hashCode)
println(ada.hashCode == newAda.hashCode)

println(ada)

val toys = Department("Toys")
println(toys)
val toys2 = Department("Toys")
println(toys == toys2)
println(toys.hashCode == toys2.hashCode)
val hardware = toys.copy(name="Hardware")
println(hardware)

val name = toys match {
            case Department(n) => n
            case _ => "Unknown"
          }

println(name)

val Department(name2) = toys2
println(name)

val alanPerson:Person = alan
val adaPerson:Person = newAda
