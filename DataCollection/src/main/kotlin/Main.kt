//ini Class biasa
class User(val name : String, val age: Int){
//    biar outputin isi class harus pake function dulu

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
//    bikin funsi equals manual
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

}
//ini data Class yang udah automatis punya fungsi toString(), equals(), copy()
data class DataUser(val name: String, val age: Int){

//    behavior sebuah data class ditulis dengan funcion
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}


fun main(args: Array<String>) {
  println("----Bab Data Class----")
    belajarDataClass()
    println("----Bab Collections----")
    belajarList()
    belajarSet()
    belajarMap()
    collectionOps()
    println("----Bab SEQUENCES----")
    belajarSequance()

}

fun belajarDataClass(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

//    kelebihan dari data class adalah bisa langsug bandingin dengan fungsi equal()
    val dataUser1 = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
//    pakai data class jadi lebih gampang copy data dan memodifikasinya
    val dataUser4 = dataUser.copy(age = 20)

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))
    //    data class langsung bisa ngeliat value class sedangkan class biasa harus dibikin dulu fungsi toString
    println(user)
    println(dataUser)
    println(dataUser4)
//    Belajar mengguraikan komponen class menjadi variabel
    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")
//atau bisa dengan cara kayak gini gess
    val (name2,age2) = dataUser4
    println("My name is $name2, I am $age2 years old")
//    manggil behavior intro() pada objek
    dataUser3.intro()
}
fun belajarList(){
//    cara nulis LIst dengan tipedata semua integer
    val listnumber : List<Int> = listOf(1,23,34,40,5)
//    list dengan macem2 data agar bisa di edit kasih mutablelistOF
    val listany = mutableListOf('a', 1, true,"Kotlin",User("ike",20))
    listany.add('d') // menambah item di akhir list
    listany.add(1, "love") // menambah item pada indeks ke-1
    listany[3] = false // mengubah nilai item pada indeks ke-3
    listany.removeAt(0) // menghapus item pada indeks ke-0
    println("ini adalah bab List : $listany")
}

fun belajarSet(){
//    Set digunakan untuk data yang tidak boleh sama/duplikasi
//    set ngga peduli urutan yang penting isinya sama
    println("---ini adalah bab SET :---")
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(0,1,2,4,5,7)
    println(setA == setB)
    println(setA == setC)
//    bisa ngecek apa kah ada nilai didalam set
    val cek = 5 in setA
    println("apakah ada nilai 5 pada setA : $cek")
//    bisa juga ada fungsi union dan intersect
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println("ini adalah Union/gabungan dari SetA dan setC $union")
    println("ini adalah intersect/perpotongan yang sama isinya dari SetA dan setC $intersect")

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
    println("ini adalah mutableSet tidak bisa mengubah isi set: $mutableSet")
}

fun belajarMap(){
    println("---ini adalah bab MAP :----")
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
//cara akses map cukup panggil key nya aja
    println(capital["Jakarta"])
//    atau bisa dengan getVAlue
    println(capital.getValue("Jakarta"))
//perbedaan antara key dengan getVAlue adalah kalau key yang di panggil cuma null
//    tapi kalau getValue bakal ngasih exception kalau data ngga ada/null
    println(capital["Amsterdam"])
//    println(capital.getValue("Amsterdam")) error exception  Key Amsterdam is missing in the map.
//    bisa cek isi key apa aja di map dengan
    val mapKeys = capital.keys
    println(mapKeys)
    val mapValues = capital.values
    println(mapValues)

//    MUTABLE MAP
    val mutableCapital = capital.toMutableMap()
//    put()untuk nambahin key-value (key, value)
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println("key mutable : "+mutableCapital.keys)
    println("value mutable: "+mutableCapital.values)
}

//BELAJAR COLLECTIONS OPERATION
fun collectionOps(){
    println("---ini bab collection opperations---")
//    filter = untuk menghasilkan list baru berdasarkan kondisi
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    println("contoh filter untuk angka genap: $evenList")
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println("contoh notfilter untuk BUKAN angka genap: $notEvenList")
//    map = membuat collection baru sesuai perubahan yang diinginkan
    val numberList1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList1.map { it * 5 }
    println("contoh map dengan list baru dikali 5 isinya : $multipliedBy5")
//    count = menghitung jumlah item dari collections
    println("jumlah item pada list number : "+numberList.count())
    println("jumlah item pada list number yang kelipatan 3 : "+numberList.count { it % 3 == 0 })
//    find(), firstORnull() cari nilai awal,  lastORnull() cari nilai akhir
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println("$firstOddNumber dan $firstOrNullNumber")
//    first() and last() : menyaring item pertama atau terakhir pada collection
//    val moreThan10 = numberList1.first { it > 10 } error exeception
    val total = numberList.sum()
    println("hasil jumlah semua isi numberlist: $total")
//    sort()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println("sorting asc: $ascendingSort")
    val descendingSort = kotlinChar.sortedDescending()
    println("sorting desc: $descendingSort")
}
//Sequance : mengevaluasi item yang diperlukan beda dengan collection pada umumnya
fun belajarSequance(){
//    list dengan 1 juta data dengan iterasi horizontal
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//    ini adalah sequance iterasi vertical
    println("--------sequences--------")
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//    pakai generate sequance
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}