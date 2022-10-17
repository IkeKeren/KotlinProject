fun main() {
//    Mari belajar ENUM: mendefinisikan tipe data baru sesuai keinginan programmer
//    enum mirip kaya Array dia didefinisikan di class terus dipanggil pake instance
    val color : Color = Color.RED
//  atau bisa di tulis dengan
//  val color2 : Color = Color.valueOf("RED")
    println("color is $color")
    //Mau manggil isi dari RED caranya pakai Value Of
    println("Color value is ${color.value.toString(16)}")
    //untuk melihat urutan data pada enum keberapa bisa menggunakan ordinal
    val colorgreen : Color = Color.GREEN
    println("Position GREEN is ${colorgreen.ordinal}")
//    WHEN EXPRESSION
    when(color){
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
    }
//Kita bisa melihat daftar enum dengan caraa
    val colors: Array<Color> = enumValues()
    colors.forEach { color -> println(color) }
    println("---Bab WHEN EXPRESSION---")
    belajarWhen()
    println("---Bab RANGE---")
    belajarRange()
    println("---Bab LOOPING---")
    belajarLooping()
    println("---Bab Break and COntinue---")
    belajarBreakcontinue()
}
//ini contoh class enum
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
fun belajarWhen(){
//    Any adalah tipe data terserah
    val waktu : Any = 7
    when (waktu){
        6->println("Baru Beres2 jam 6")
        7->{
            "Udah jam 7"
            when (waktu){
                is Double -> println("waktu adalah Double")
                is Int -> println("waktu adalah Integer")
                else-> println("unidenfied")
            }
        }
        else -> println("tidak terdefinisi")
    }
}

//belajar Range
fun belajarRange(){
//    cara nulis range
    val number = 1..10
//    cara nulis ke-2
    val number2 = 1.rangeTo(10) step 2
//    cara nulis ke -3 urutan terbalik pakai downto
    val number3 = 10.downTo(1)

//    cara output range urutan
    println("Urutan number1")
    number.forEach {
        print("$it ")
    }
    println("\nUrutan number2 dengan step 2")
    number2.forEach {
        print("$it ")
    }
    println("\nUrutan number3")
    number3.forEach {
        print("$it ")
    }
//    ngecek ada huruf Z apa ngga
    val rangeChar = 'A'.rangeTo('F')
    if ('F' !in rangeChar) {
        println("No value Z in Range ")
    }else{
        println("ada huruf F")
    }
}
//belajar FOR looping, For ( variabeli in Range/array/collection){}
fun belajarLooping(){
    val rangeNumber = 1..10 step 3
    for (i in rangeNumber){
        print(i)
    }
//    Kalau mau tau nilai index dan valunya pake .withIndex()
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
//    bisa ditulis kaya gini juga pakai For Each yang merupakan lamda expression
    val ranges2 = 1.rangeTo(10) step 3
    ranges2.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
//    kalau mau tau indexnya aja bisa di skip pake tanda _ underscore
    val ranges3 = 1.rangeTo(10) step 3
    ranges3.forEachIndexed { index, _ ->
        println("index $index")
    }
}
//BElajar BREAK DAN CONTINUE
//break itu berhentikan perulangan
//continue itu nge skip, dan ngejalanin perulangan selanjutnya
//@ adalah label di kotlin, bisa digunain di looping contoh ada di bawah
fun belajarBreakcontinue(){

    val arrayA = arrayOf('R',1,2,null,3,null,"EH",)
    for (i in arrayA){
        print(i)
    }
    println("i\nni output kalau pake continue")
    for (i in arrayA){
        if(i == null)continue
        print(i)
    }
    println("\nini output kalau pake break")
    for (i in arrayA){
        if(i == null)break
        print(i)
    }
    println("\nini output pakai label @looping")
    loop@ for (i in arrayA){
        println("$i Outside loop")
        for (j in 1..4) {
            if ( j == 3) break@loop
            println("Inside Loop")
        }
    }
}


