import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
               @BeanProperty val lastName:String,
               val title:String = "Programmer"){

 require(firstName.nonEmpty, "First Name cannot be empty")
 require(lastName.nonEmpty, "Last Name cannot be empty")
 require(title.nonEmpty, "Title cannot be empty")

if(title.contains("Senior") || title.contains("Junior"))
  throw new IllegalArgumentException("Title cannot contain Junior or Senior")

  def fullName = s"$firstName $lastName"

  def changeLastName(ln:String) = new Employee(firstName, ln, title)

  def copy(firstName:String = this.firstName, lastName:String = this.lastName,
           title:String = this.title ) = {
    new Employee(firstName, lastName, title)
  }

  override def equals(x:Any):Boolean = {
    if (!x.isInstanceOf[Employee]) false
    else {
      val other = x.asInstanceOf[Employee]
      other.firstName == this.firstName &&
      other.lastName == this.lastName &&
      other.title == this.title
    }
  }

  override def hashCode:Int = {
    var result = 19
    result = 31 * result + firstName.hashCode
    result = 31 * result + lastName.hashCode
    result = 31 * result + title.hashCode
    result
  }

  override def toString:String = s"Employee($firstName, $lastName, $title)"
}
// Warning: Scala Programmers don't like vars

case class Department (name:String) {
  override def toString = s"Department: $name"
}

class Manager(firstName:String, lastName:String, title:String, val department:Department) extends
  Employee(firstName, lastName, title) {
    override def fullName = s"$firstName $lastName, ${department.name} Manager"
    override def copy(firstName:String = this.firstName, lastName:String = this.lastName,
      title:String = this.title ) = {
        new Manager(firstName, lastName, title, new Department("Toys"))
      }
  }
