import java.util.*

fun main() {
    array("nairobi", "nai", "me","do")
    cities()
    numbers()
    println( gift("sandra","matayo","anithab"))

}
fun array(set1:String, set2:String, set3:String, set4:String){
    var add=arrayOf(set1, set2, set3, set4)
    println(Arrays.toString(add))
}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (elements in cities){
        println(elements.capitalize())
    }
}
fun numbers(){
    var numbers=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var num1=17
    var num2=78
    var sum=num1+num2
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var sorting=numbers.sortedArray()
    println(Arrays.toString(sorting))
}

fun gift(a:String, b:String, c:String,):String{
    var gift= arrayOf(a, b, c)
    return (Arrays.toString(gift))
}