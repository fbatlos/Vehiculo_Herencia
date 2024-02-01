
open class Vehiculo(open val marca: String, open val modelo: String, open val capacidadCombistible: Int){

    override fun toString(): String {
        return "Tu $marca $modelo , con una capacidad ${calcularAutonomia()}"
    }
    open fun calcularAutonomia():Int{
        return capacidadCombistible*10
    }

}

enum class tipos{
    sedán,SUV,deportivo
}
class Automovil(var tipo:tipos,marca:String, modelo:String, capacidadCombistible:Int):Vehiculo(marca, modelo , capacidadCombistible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()+100
    }
    override fun toString(): String {
        return "${super.toString()} , de tipo : $tipo"
    }
}

class Motocicleta(var cilindrada:Int,marca:String, modelo:String, capacidadCombistible:Int):Vehiculo(marca, modelo, capacidadCombistible){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

    override fun toString(): String {
        return "${super.toString()} , de cilindada : $cilindrada"
    }
}

fun main(){
  /*  val coche1=Automovil(tipos.SUV , "wosl" , "23z", 10)
    val moto = Motocicleta(2,"kuzuaki","5M4",10)
    println(coche1.toString())
    println(moto.toString())
    */
   // val coche :Automovil = Vehiculo("Hoal" , "637Z" , 10)
    //println(coche.toString())
}

