class Employee(firstName:String, middleName:Option[String], lastName:String){
  def this(firstName:String, middleName:String, lastName:String) =
    this(firstName, Some(middleName), lastName)
  def this(firstName:String, lastName:String) =
    this(firstName, None, lastName)
  def this() =
    this("Unkown", "Unkown")
}
object Options extends App {
  val middleName = Some("Antony")
  val middleName2:Option[String] = middleName
  val middleName3:Some[String] = middleName

  val noMiddleName = None
  val noMiddleName2:Option[String] = noMiddleName
  val noMiddleName3:Option[Nothing] = noMiddleName
  val noMiddleName4:None.type = noMiddleName

  val carHoare = new Employee("Charles","Antony", "Hoare")
  val bjarne = new Employee("Bjarne", "Stroustrap")
  val strangePerson = new Employee
}
