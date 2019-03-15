

object tupleEx {
  
  val myTup = (1,2,3,"Vinod")
  val myTup1 = new Tuple4(1,2,3,"Nevaan")
  
  
  def main(args:Array[String]):Unit={
    
    println(myTup)
    println(myTup1)
    println(myTup._2)
    println(myTup1._4)
    
    myTup1.productIterator.foreach(i=>println(i))
  }
  
}