package tutorial_2

object Q4_a {
  def work(hrs:Double):Double=hrs*250;
  def ot(ot_hrs:Double):Double=ot_hrs*85;
  
  def income(hrs:Double,ot_hrs:Double):Double=
  {
    return work(hrs) + ot(ot_hrs)
  }
  
  def tax(income:Double):Double=
  {
    return income*.12
  }
  
  def takeHome(hrs:Double,ot_hrs:Double):Double=
  {
    return income(hrs,ot_hrs) - tax(income(hrs,ot_hrs))
  }
  
  def main(args:Array[String]):Unit = 
  {
    println(takeHome(40,30))
  }
}