

object functionEx {
  def add(x:Int,y:Int):Int={
    
    x+y
  }
  def sub(x:Int,y:Int):Int={
    
    x-y
  }
    
  def mul(x:Int,y:Int):Int={
    
    x*y
  }
      
  def div(x:Int,y:Int):Float={
    
    x/y
  }
  
  def main(args:Array[String]):Unit = {
    
    println(add(45,15))
    println(sub(45,15))
    println(mul(5,6))
    println(div(60,3))
    
  }
  
}