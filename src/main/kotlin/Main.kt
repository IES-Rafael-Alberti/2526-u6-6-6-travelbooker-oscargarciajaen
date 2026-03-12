package org.practicatrim2

import org.practicatrim2.presentacion.Consola
import org.practicatrim2.servicios.ReservaService

fun main() {

    val servicioReservas = ReservaService()
    var terminar: Boolean = false
    while (terminar == false) {
        val primeraSeleccion = Consola.mostrarMenu()
        if (primeraSeleccion == "1") {
            val reservaSolicitada = Consola.solicitarTipoReserva()
            servicioReservas.agregar(reservaSolicitada)
        } else if (primeraSeleccion == "2") {
            servicioReservas.obtenerTodas()
        } else if (primeraSeleccion == "3") {
            println("Exit ...")
            terminar = true
        }
    }
}
