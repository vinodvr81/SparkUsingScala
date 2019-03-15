
object arrayEx {
  
  val ar:Array[Int] = new Array[Int] (4)
  
  ar(0)= 60
  ar(1) = 100
  ar (2) = 200
  ar(3)= 400
  
  def main(args:Array[String]):Unit = {
  

  var i:Int = 0 
  
  for (i <- 0.to(ar.length - 1)){
    println(ar(i))
   }
  }
  
}