case class Couple[A, B](first:A, second:B){
  def swap = Couple(second, first)
}
