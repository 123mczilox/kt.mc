var studentname: String = "Alex morgan"//mutable variable
val studentId: Int = 2024001//immutable variable
var GPA: Double = 3.75//mutable variable
val isEnrolled: Boolean = true//immutable variable
var middleInitial: Char = 'j'//mutable variable

fun displayMenu(){
    println("1. view Profile ")
    println("2. Edit Settings ")
    println("3. Logout ")
}
// var price:Double = 323.232356766
// var discontPercent:Double = 12.33333333334375485

fun calculateDiscount(price:Double, discountPercent:Double):Double{
    return(price-(price*discountPercent/100))
    
}


fun getGrade(score:Int):String{
    return if (score >= 80) {
        "A"
    } else if (score >= 65) {
        "B"
    } else if (score >= 50) {
        "C"
    } else if (score >= 35) {
        "D"
    } else {
        "F"
    }
    
}

//  fun isEven(Number:Int){
//      return if(Number=even){'True'
//      }else{'Odd'}
//  }
fun isEven(i:Int):Boolean = i % 5 ==0


 


fun main(){
  println("Student : $studentname $middleInitial.($studentId) has GPA $GPA, and Is Enrolled: $isEnrolled")
var phoneNumber:String? = null
    println(phoneNumber)
    
    
 
    println("=========================")
    
    displayMenu()
    println(calculateDiscount( 323.232356766,12.33333333334375485))
    
    println(getGrade(75))
    
  val numbers = listOf(12,15,30,50,47,578,6734,24,500)
  for (num in numbers){
      if (isEven(num)){
          println("$num is even")
      }else{("$num is odd")}
      
  }

    var Temperature: Int = 20

    if (Temperature > 30) {
        println("Hot day")
    } else if (Temperature > 20 && Temperature <= 30) {
        println("Perfect weather")
    } else {
        println("Cool day")
    }

    println("Temperature is $Temperature°C")

    
}
