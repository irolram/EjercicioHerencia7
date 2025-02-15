class Motocicleta(val cilindrada: Int, marca: String,  modelo: String, capacidadCombustible: Int): vehiculo(marca, modelo, capacidadCombustible){

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() * 6
    }

}