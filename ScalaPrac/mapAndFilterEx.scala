

object mapAndFilterEx {
  
  val x=  List(1,2,3,4,5,6,7,8,9,10)
  
  val y = x.map(f=>f*f)
  
  val z = x.filter(f=>f%2!=0)
  
  def main(args:Array[String]):Unit={
    
   println(y) 
   println(z)
   
   println(x.flatMap(x=>List(x,x+10)))
   println(x.flatten(x=>Map(x->(x+10))))
   println(x.flatMap(x=>Map(x->(x+20))))
    
  }  
  
}