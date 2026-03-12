package org.practicatrim2.presentacion

import java.time.LocalDate

class Consola {

    fun mostrarMenu(): String{
        println("Elige una Opción 1 o 2")
        println("1. Crear Reserva")
        println("2. Mostrar Reserva")

        var seleccion: String? = null

        do {
            print("\nTú opción -> ")
            val entrada = readLine()
            if (entrada != null && (entrada == "1" || entrada == "2") ) {
                seleccion = entrada
            }
        } while(seleccion == null)
        return seleccion
    }

    fun solicitarTipoReserva(): String{
        println("\nSelecciona el tipo de reserva 1 o 2")
        println("1. Reserva de Hotel")
        println("2. Reserva de Vuelo")

        var reserva: String? = null

        do {
            print("\nTú opción -> ")
            val entrada = readLine()
            if (entrada != null && (entrada == "1" || entrada == "2") ) {
                reserva = entrada
            }
        } while(reserva == null)
        return reserva
    }

    companion object{

        fun solicitarUbicacion(): String{
            println("Introduzca la ubicación")
            var ubicacion: String? = null

            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                if (entrada != null && entrada.isNotEmpty()) {
                    ubicacion = entrada
                }
            } while(ubicacion == null)
            return ubicacion
        }

        fun solicitarNumeroNoches(): Int{
            println("Introduzca la ubicación")
            var numeroNoches: Int? = null

            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                if (entrada != null && entrada.all { it.isDigit() }) {
                    val entradaEntera = entrada.toInt()
                    if (entradaEntera > 0 && entradaEntera < 100){
                        numeroNoches = entradaEntera
                    }
                }
            } while(numeroNoches == null)
            return numeroNoches
        }

        fun solicitarFecha(): LocalDate{
            println("Introduce la fecha en formato YYYY-MM-DD")

            var fecha: String? = null
            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                val fecharRegex = "[2][0][2][6]-[0-1][0-9]-[0-3][0-9]".toRegex()
                if (entrada != null  && entrada.matches(fecharRegex)) {
                    fecha = entrada
                }
            } while(fecha == null)

            val fechaFormateada = LocalDate.parse(fecha)

            return fechaFormateada
        }

        fun solicitarDescripción
    }
}