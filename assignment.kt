//Zidane Mczilox, Safari Lab
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

val students = listOf(
"Alice" to 85,
"Bob" to 42,
"Charlie" to 67,
"Diana" to 91,
"Ethan" to 38
)
val sumOfScore = 85+42+67+91+38

fun displayAllStudents(){
    for ((name , score) in students)
    println("$name, $score")
}
fun getAverageScore():Double{
    val total = students.sumOf { it.second }//score in each pair
    val average = total.toDouble() / students.size
    //total.toDouble -converts the total to a decimal number to avoid integer didvision
    return average
}


fun findTopStudent():String{
    val top = students.maxByOrNull {it.second}
    //maxbynull {it.second}-it finds the pair with the highest score
    
    return top?.first ?: "No students"
    //top?.first -it gets the name of the top student
    // ?: "No students" incase the list us empty avoid errors (safe fallback)
    
}

fun classifyStudents() {
    println("Student classifications:")
    for ((name, score) in students) {
        val grade = getGrade(score)
        println("Name: $name, Score: $score, Grade: $grade")
    }
}
    

 


fun main(){
   displayAllStudents()                               
    println("\nAverage score: ${getAverageScore()}")   
    println("Top student: ${findTopStudent()}")       
    println()
    classifyStudents()  
    println("==========================")
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
 println("===============================")
    
// var dayOfWeek = "Monday"
// if (dayOfWeek == "Saturday" || dayOfWeek == "Sunday") {
// println("Weekend! Time to relax")
// } else if (dayOfWeek == "Monday") {
// println("Back to work")
// } else if (dayOfWeek == "Friday") {
// println("TGIF!")
// } else {
// println("Regular weekday")
// }
var dayOfWeek = "thursday"
when (dayOfWeek){
    "Saturday","Sunday" -> println("Weekend! time to relax")
    "Monday" -> println("Back to work")
    "Friday" -> println("Begining of Weekend")
    else -> println("Regular weekday")
}

var trafficLight ="Yellow"
var trafficAction=
    when (trafficLight){
        "Red" -> println("Stop!")
        "Yellow" -> println("Caution")
         "Green" -> println("Go")
          else -> println("Invalid")
    }

   
println("===============================")
//TASK 4.1

// var number:Int =1
//     while (number <=10){
//         println(number)
//         number++
//     }
    println("===============")
    
var number = 5

do {
    println(number)
    number--
} while (number >= 1)

println("Blast off!")

// we add withIndex so that when the value runs it is assigned an idex value.eg
/**
 var students = listOf("JOHN","LUCAS","LILY","MARY")
 for ((index,student)in students.withIndex()){
 
     println("[${index+1}].$student")
  }
 **/ 



val shoppingList = listOf("Milk","Eggs","Bread","Butter","coffee")

for ((index,shopping) in shoppingList.withIndex()){
    println("[${index +1}]. $shopping")
}

for (i in 1..20){
    println(i)
}
println("===============================")

for (i in 1 until 20){
    println(i)
}
println("===============================")

for (i in 2..20 step 2){
    println(i)
    
}

for (ch in 'A'..'Z'){
    println(ch)
}

// A statement is a code that perfoms an action but does not return a vale.eg
println("My name is Mczilox Zidane")
//this it does the action of giving out my name.
//While a expression is a line of code that claculates or ruturns a value.eg

val sum = 12+30
    println(sum)
var age = 13    
var status = ""
if (age >= 18) {
status = "Adult"
} else {
status = "Minor"
}
println("The user is a $status")

val a = 10
val b = 25

val maxNumber = when {
    a > b -> a
    else -> b
}

println(maxNumber)
println("======================")

                               
}





    

    

