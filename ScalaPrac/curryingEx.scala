

object curryingEx {
  def add2(x:Int) = (y:Int)=>x+y
  def add3(x:Int)(y:Int)=x+y
  
  def main(args: Array[String]):Unit={
    var sum40 = add2(40)
    println(sum40(60))
    val sum50 = add3(50)(150)
    println(sum50)
    val sum100 = add3(500)_
    println(sum100(250))
    val str1:String = "Hello World"
    val str2:String = "Here, Vinod"
    println(str1.concat(str2))
  }
}