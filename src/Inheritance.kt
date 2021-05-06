
open class Human(var name:String,var age:Int){
 fun talk(words:String){
    println(words)
}
open fun eat(){
    println("yum")
}
fun sleep(){
    println("zzzz")

}}


class Banker( name:String,age:Int): Human(name,age) {


    fun countMoney(notes: List<Int>): Int {
        var sum = 0
        notes.forEach { note -> sum += note }
        return sum
    }
}
class Docter(name:String, age:Int):Human(name,age){

     fun treatPatient(patient: String, disease: String) {
        println("Treat $patient what $disease")
    }
}

class  Former(name:String, age:Int): Human(name,age){
    override fun eat(){
        println("I am not perfect")
    }
    fun caltivteLnd(){
        println("dig dig dig")
    }

 }


fun main() {
    var banker=Banker("Mutoni",22)
    banker.eat()
    var docter=Docter("Jeannine",30)
    docter.treatPatient("Marie","I can't tell")
    var former=Former("anne",60)
    former.eat()
    banker.sleep()
    banker.countMoney(listOf(200,3000,3000))


}
