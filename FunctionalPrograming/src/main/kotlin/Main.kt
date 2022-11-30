fun main() {
//    val list = getListUser()
    val fullname = getFullName()
    val fullname2 = getFullName(first = "Ike")
    println(fullname)
    println(fullname2)
//    varang
    println("ini adalah varang : "+sumNumber(10,12,15,30))
//    extension function
   println("ini adalah extension function: ")
    10.printInt()
//    extension properties
    println("\nini adalah extension properties : " +10.slice)
// null receiver
    val value: Int? = null
    println("null reciver : " +value.slice)
    val value1: Int? = null
    println("null reciver : " +value1.slice)
    println("ini adalah lambda function :")
    message()
    printMessage("Hallo ini lambda")

}
/*
fungsi ini bisa ditulis dengan lebih sederhana seperti dibawah,
fun getUsername(): List<String>{
    val name = mutableListOf<String>()
    for (user in list){
        name.add(user.name)
    }
    return name
}
fun getUsername(): List<String>{
    return list.map {
        it.name
    }
}
*/


//bikin function dengan default parameter
fun getFullName(first: String = "KOtlin", middle: String = "is", last : String ="Awsome"): String{
    return "$first $middle $last"
}
//belajar varang
fun sumNumber(vararg number : Int) : Int{
    return number.sum()
}
// belajar extension function
fun Int.printInt() {
    print("value $this")
}
//extension properties
val Int.slice: Int
    get() = this / 2
//null reciver
val Int?.slice: Int
    get() = this?.div(2) ?: 0
//BELAJAR LAMDA GESS
//    lamda ngga perlu keyword fun langsung pakai {}
val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message) }

