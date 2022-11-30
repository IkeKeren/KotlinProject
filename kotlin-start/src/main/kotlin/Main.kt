fun main() {
    belajarVariable()
    println("----ini Bab String----")
    belajarString()
    escapeString()
    rawString()
    println("----ini Bab Function----")
    println(user("Ike",27))
    println(userName("Bagus",24))
    printUser("Alfian")
    println("----ini Bab IF Expression----")
    ifbelajar()
    ifdan()
    ifnot()
    println("----ini Bab String dan CAsting----")
    stringkenumber()
    iniStringtemplate()
    println("----ini Bab Array----")
    belajarArray()
    println("----ini Bab Null Pointer Exeption----")
    nullExeption()
}
fun belajarVariable(): Unit{
    /* var isi variabel masih bisa di ubah
      val variabel ngga bisa diubah
      val company: String = "Dicoding"
      company = "Dicoding Academy"
      val valueA: Int = 10
      val valueB = 20
      print(valueA + valueB)
   */
    println("----ini Bab Variable----")
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    print(firstWord + lastWord + '\n')

//  CHAR, Bisa incremen karena Char punya Unicode, A-> 0041, B->0042
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

fun belajarString(){
//    String pada dasarnya adalah Array
    val text  = "Kotlin"
    val firstChar = text[0]
    print("First character of $text is $firstChar \n")
//    Manfaatkan looping untuk string
    for (char in text){
        println("Ini adalah looping $char ")
    }
    for (char in text){
        print("$char ")
    }
}

fun escapeString(){
//    pakai tanda backslash (\)
    val statement = "\n \t ini adalah Escape Stgring Kotlin is \"Awesome!\""
    println(statement)
//bisa nambahin unicode gess
    val name = "Unicode test: \u00A9"
    print(name)
}

fun rawString(){
//    menulis tanpa harus ngasih tanda \n, dengan tripel quote """
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}

//Belajar Fungsi:
// fungsi nulisnya fun namaFungsi (parameter : tipe data) : TYpe Return
//kalau return cuma 1 bis ditulis kyk gini ges, cukup dengan tanda =
fun user(nama: String, umur: Int)="Namamu $nama dan umurmu $umur"
//sama dengan seperti ini

fun userName(nama: String, umur: Int) : String {
    return "Namamu $nama dan umurmu $umur"
}
//atau semisal mau return yang lain bisa pake return Unit
fun printUser(nama: String) : Unit {
    print("Namamu $nama")
}

//Belajar IF statment
fun ifbelajar(){
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }
    print(office)
}
//Boolean kalau dia and tandanya && kalau atau tandanya ||
fun ifdan(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    /*penyederhanaan dari
        val isOpen = if (now >= officeOpen && now <= officeClosed){
            true
        } else {
            false
        }
    * */
    println("Office is open : $isOpen")
}
//negasi NoT pakai tanda !
fun ifnot(){
    val officeOpen = 7
    val now = 10
    val isOpen= now> officeOpen

    if (!isOpen){
        println ("Office is Closed")
    }else{
        println("Office is OPEn")
    }
}

//ubah string ke number
fun stringkenumber(){
    val stringNumber = "23"
    val intNumber = 3
    val numbernow =  intNumber + stringNumber.toInt()

    println( intNumber + stringNumber.toInt())
    //hati-hati sama tanda + bisa jadi concate
    println("Hasil dari  23 + 3 adalah "+intNumber + stringNumber.toInt()+" tidak sama dengan "+numbernow)
}
//String Template
fun iniStringtemplate(){
    val hour = 7
    println("Ini String template Office ${if (hour > 7) "already close" else "is open"}")
}

fun belajarArray(){
    val baris = arrayOf(1,3,"ikekeren",true)
    println(baris[2])
}

//belajar menangani null pointer exeption
fun nullExeption(){
    val text : String? = null
    if (text != null){
        val textLength = text.length
        println("isi dari text bukan null "+ textLength)
    }else{
        println("text nya berisi = "+ text)
    }
}