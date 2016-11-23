import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
               @BeanProperty var lastName:String,
               val title:String){
   // Atypical form with side effect
   def this(firstName:String, lastName:String) =  {this(firstName, lastName, "Programmer")
                                                   println("Side Effect")}
   // Atypical form
   //def this(firstName:String, lastName:String) =  {this(firstName, lastName, "Programmer")}
   // Typical form
   // def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")
}
// Warning: Scala Programmers don't like vars
