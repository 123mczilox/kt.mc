//single line coment//


/*
 * variables 
 * -mutable-(can change it)
 * -immutable-constant(never change once signed)
 * 
 * -parts of variable:
 * 1.key words(var val)
 * 2. variable name
 * 3. data type
 * 4. assignment operator
 * 5. value to be referenced
 * 
 * 
 * 
 * 
 * */
var firstName:String = "john doe" //mutable//
var secondName:String = "mczizo"

val dob:Int = 2010 //immutable//
var age = 20 //type inference//


/**
 * 
 * DATA TYPES
 * -numbers:integer long float double
 * -string
 * -character
 * -boolean
 * 
 * 
 * */
 //numbers//
var year:Int = 2026//integer
var internWage:Int = 100_000
var juniorWage:Int = 1_000_000
var seniorWage:Long = 1_000_000_000_000L// the long is used for larger digits since Int function only support short digits//


var latKiproCenter:Float = -1.222333333f// dont forget to put the f at the end of float variables//
var lngKiproCenter:Float = 36.222333333f

var latsaritCenter:Double = -1.222333333657544666//many decimal values than float//
var lngsaritCenter:Double = 36.22233333365768786

//string&characters//

var nameOfPlace:String ="kipro Center"
var firstCharOfPlace:Char = 'k' //in characters we use only single Quotation marks//

//boolean(true or false)//

var isDoorOpen:Boolean = true //small t as opposed to python//
var isWindowOpen:Boolean = false

/**
 * conditional statements
 * -if....else
 * -if....else if....else
 * -when....
 * */











fun main() {
    firstName ="martin luther"
    

    println(firstName)
 
    println(firstName)
    println(secondName)
    println(dob)
    if (age<10){
    println("under-age")
    
}else{
    println("Teeneger")
}
val output = if(age<10){"under-age"}else{"Teen"}

//if...else if...else
age =50
    if (age<18){
    println("oops! your are under 18")}
    else if (age >=18){
        println("you can talk about driving")
    }
       else if (age >=40){
        println(" Good you can  drive")
    }else{
           print("idk!")
           
       }
       println("====================================")
       
       var color:Int =1;
    color = 1
       when (color){
           1 ->println("primary")
           2 ->println("secondary")
           3 ->println("auxillary")
           else ->println("please add that color to your category")
       }
    
// println(output)


}




 