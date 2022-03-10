fun main(){
    students("mollen","Faith","Kanini","Yasmin")
    country()
    array()
    var x=names(arrayOf("Mollen","Wambui","Macharia"))
    println(x)

}
//a function that takes in 4 strings  and creates an array out of them
//then prints out the array
fun students(a:String,b:String,c:String,d:String){
    var lovelace= arrayOf(a,b,c,d)
    println(lovelace.contentToString())
}
//a function that prints out the names of the cities in the correct grammatical case.
 fun country() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city ->
        println(city.capitalize())
    }
}
fun array(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[2]+numbers[5]
    var index= numbers.indexOf(158)
    var ascending=numbers.sorted()
    println(sum)
    println(index)
    println(ascending)
}
// function that takes in 3 names and returns a string array containing
//all 3 names
fun names(name:Array<String>):String{
  var name=name.contentToString()
    return  name

}