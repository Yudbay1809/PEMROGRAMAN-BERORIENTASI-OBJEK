class buku {
    var judul = ""
    var pengarang = ""
    var penerbit = ""
    var year = ""
}

fun main() {
    val c1 = buku()
    val c2 = buku()
    c1.judul = "Judul: Hysteria"
    c1.pengarang = "Pengarang : Nano"
    c1.penerbit = "Penerbit : Elex"
    c1.year = "Tahun : 2008"
    c2.judul = "Judul : Now or Never"
    c2.pengarang = "Pengarang : Nano"
    c2.penerbit = "Penerbit : Haru"
    c2.year = "Tahun : 2009"


    println(c1.judul)
    println(c1.pengarang)
    println(c1.penerbit)
    println(c1.year)
    println(c2.judul)
    println(c2.pengarang)
    println(c2.penerbit)
    println(c2.year)
}