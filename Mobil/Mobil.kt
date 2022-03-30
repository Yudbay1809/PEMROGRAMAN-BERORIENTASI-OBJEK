class Mobil {
    var brand = ""
    var warna = ""
    var tahunProduksi = 0
}
class MobilDemo2 {
    // static == companion
    private var statusMobil = false
    private  var gigiMobil = 0
    fun hidupkanMobil(){
        if (statusMobil==false){
            println("Mobil Hidup")
            statusMobil = true
        }else{
            println("Mobil Sudah Hidup")
        }
    }
    fun matikanMobil(){
        if (statusMobil==false){
            println("Mobil Sudah Mati")
        }else{
            println("Mobil Mati")
            statusMobil = false
        }
    }

    fun ubahGigi(gigi: Int){
        gigiMobil = gigi
        println("gigi mobil sekarang : "+gigiMobil )
    }

    fun getgigi():Int{
        return gigiMobil
    }
}
fun main(args: Array<String>) {
    //membuat object
    val mobil1= Mobil()
    var mobil2 = MobilDemo2()

    //memanggil atribut dan memberikan nilai
    mobil1.brand = "Subauwu"
    mobil1.warna = "Hitam"
    mobil1.tahunProduksi= 1987
    println("Brand : "+mobil1.brand)
    println("Warna : "+mobil1.warna)
    println("Tahun Produksi : "+mobil1.tahunProduksi)

    mobil2.hidupkanMobil()
    mobil2.ubahGigi(2)
    println(mobil2.getgigi())
    mobil2.ubahGigi(6)
    println(mobil2.getgigi())
}