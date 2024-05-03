//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val store = Store()

    store.addPreferences("sedan")
    val preferredItem = "sedan"
    store.recommendations(preferredItem)
}
//data class Categories(var clothes: List<String>, var groceries: List<String>, var shoes: List<String>)
//fun store():Categories{
//    var clothes = listOf<String>("dress", "vest", "sweater", "trousers")
//    var groceries = listOf<String>("fruits", "vegetables", "tomatoes", "kiwi")
//    var shoes = listOf("rubbers", "sneakers", "heels", "sandles")
//}

class Store (){


    var cars = mutableListOf("jeep","sedan")
    var furnitures = mutableListOf("couch","beds")
    var groceries = mutableListOf("vegetables","fruits")


    var userPreferences = mutableListOf<String>()
    fun addPreferences(item:String){
        userPreferences.add(item)
    }
    fun recommendations(item: String){
        if (item in cars){
            println(cars)
        }
        else if (item in furnitures){
            println(furnitures)
        }
        else if (item in groceries){
            println(groceries)
        }
        else{
            println("Item not found")
        }
    }
}