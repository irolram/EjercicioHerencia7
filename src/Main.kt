
fun main() {

    val coche = Automovil1("nose", "nose", "nose", 10)
    coche.mostrarInformacion()
    println("Autonomía del automóvil: ${coche.calcularAutonomia()} km")

    val moto = Motocicleta(150, "Honda", "CBR", 15)
    moto.mostrarInformacion()
    println("Autonomía de la motocicleta: ${moto.calcularAutonomia()} km")
}