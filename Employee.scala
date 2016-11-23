import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
               @BeanProperty var lastName:String)
// Warning: Scala Programmers don't like vars
