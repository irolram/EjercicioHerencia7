class Automovil1(val tipo: String, marca: String,  modelo: String, capacidadCombustible: Int): vehiculo(marca, modelo, capacidadCombustible){

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() * 10
    }

}