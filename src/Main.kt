//Create a function that takes in 4 strings and creates an array
//out of them then prints out the array.
fun name(s:String, f:String, d:String, e:String){
    var name: Array<String>=arrayOf(s, f, d, e)
    println(name.contentToString())
}

//Create one function that is given the below array:
//var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
//(1.)prints out the sum of the second and fifth elements
//(2.)Prints out the index of 158
//(3.)prints out the elements in ascending order.

fun number(){
    var number = arrayOf(32, 17, 4, 78, 43, 90, 31, 11, 158, 62)
    println(number.indexOf(158))
    println(number[1] + number[4])
    number.sort()
    println(number.contentToString())

//Create one funtion that takes in 3names and returns a string
//a string array containing all 3 names
fun text(f:String,s:String,y:String){
    var text:Array<String>=arrayOf(f,s,y)
    println(text.contentToString())
}