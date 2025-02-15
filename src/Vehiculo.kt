open class vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int){


    open fun mostrarInformacion(){
        println("Marca: $marca, modelo: $modelo, capacidad: $capacidadCombustible")
    }
    open fun calcularAutonomia():Int{


        val porCadaLitro = 10

        val calculo = capacidadCombustible * porCadaLitro

        return calculo
    }
}