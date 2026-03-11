package org.practicatrim2.presentacion

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
}