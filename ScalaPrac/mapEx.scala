

object mapEx {
  val myMap:Map[Int,List[String]] = Map(1->List("Hello","Vinod"),2->List("Hello","Nevaan"),3->List("Hello","Varun"))

  def main(args:Array[String]):Unit={
    myMap.keys.foreach { key =>
      println("key is " + key);
       println("value is " + myMap(key));
      println("value is " + myMap(key)(1));
    }
    
  }

}