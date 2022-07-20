package tutorial_2

object Q4_b {
  def calAttendence(price:Int):Int=120+((15-price)/5)*20;
  def calRevenue(price:Int):Int=price*calAttendence(price);
  def calCost(price:Int):Int=500+ 3*calAttendence(price);
  def calProfit(price:Int):Int=calRevenue(price)-calCost(price);
  
  def main(args:Array[String]):Unit = 
  {
    println(calProfit(10))
    println(calProfit(15))
    println(calProfit(20))
    println(calProfit(25))
    println(calProfit(30))
  }
}