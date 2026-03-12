package org.practicatrim2.servicios

import org.practicatrim2.Dominio.Reserva
import org.practicatrim2.Dominio.ReservaHotel
import org.practicatrim2.Dominio.ReservaVuelo
import org.practicatrim2.datos.Repositorio
import org.practicatrim2.presentacion.Consola

class ReservaService (): IReservaRepository {

    val reservasHoteles : MutableMap<Int, Reserva> = Repositorio().reservasHotel

    val reservasVuelos : MutableMap<Int, Reserva> = Repositorio().reservasVuelo

    override fun agregar(seleccion: String) {
        var reserva: Reserva? = null
        when (seleccion){
            "1" -> reserva = ReservaHotel.crearInstancia(
                Consola.solicitarUbicacion(),
                Consola.solicitarNumeroNoches(),
                Consola.solicitarFecha(),
                Consola.solicitarDescripción())

            "2" -> reserva = ReservaVuelo.crearInstancia(
                Consola.solicitarOrigen(),
                Consola.solicitarDestino(),
                Consola.solicitarHoraVuelo(),
                Consola.solicitarFecha(),
                Consola.solicitarDescripción()
            )
        }
        when (reserva){
            is ReservaHotel -> reservasHoteles[reserva.id] = reserva
            is ReservaVuelo -> reservasVuelos[reserva.id] = reserva
        }
    }

    override fun obtenerTodas() {
        if (reservasHoteles.isNotEmpty()){
            reservasHoteles.forEach { Consola.mostrarReserva(it.key, it.value)  }
        }
        if (reservasVuelos.isNotEmpty()){
            reservasVuelos.forEach { Consola.mostrarReserva(it.key, it.value) }
        }
    }
}