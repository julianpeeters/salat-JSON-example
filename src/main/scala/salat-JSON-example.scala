import models._
import com.novus.salat._
import global._


object Main extends Application {
  val myName = "Julian" 

  val myRecord = MyRecord(myName)
    Console.println(myRecord)


  val myJSON = grater[MyRecord].toPrettyJSON(myRecord)
    Console.println(myJSON)
 
  val backToMyRecord = grater[MyRecord].fromJSON(myJSON)
    Console.println(backToMyRecord)

}
