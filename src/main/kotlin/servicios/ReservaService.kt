package org.practicatrim2.servicios

import org.practicatrim2.Dominio.Reserva
import org.practicatrim2.Dominio.ReservaHotel
import org.practicatrim2.Dominio.ReservaVuelo
import org.practicatrim2.datos.Repositorio
import org.practicatrim2.presentacion.Consola
import java.time.LocalDate

/**
 * Clase que representa un servicio de reservas
 *
 * @constructor Create empty Reserva service
 */
class ReservaService (): IReservaRepository {

    /**
     * Declaramos un repositorio de enteros.
     */
    val repositorio = Repositorio<Int>()
    /**
     * Mapa para almacenar las reservas de los hoteles en formato [id:reserva]
     */
    val reservasHoteles : MutableMap<Int, Reserva> = repositorio.reservasHotel

    /**
     * Mapa para almacenar las reservas de los vuelos en formato [id:reserva]
     */
    val reservasVuelos : MutableMap<Int, Reserva> = repositorio.reservasVuelo

    /**
     * Implementación de la función agregar
     *
     * @param seleccion Es el tipo de reserva, introducida por el usuario
     */
    override fun agregar(seleccion: String) {
        var reserva: Reserva? = null
        when (seleccion){
            "1" -> reserva = ReservaHotel.crearInstancia(
                Consola.solicitarUbicacion(),
                Consola.solicitarNumeroNoches(),
                LocalDate.now(),
                Consola.solicitarDescripción())

            "2" -> reserva = ReservaVuelo.crearInstancia(
                Consola.solicitarOrigen(),
                Consola.solicitarDestino(),
                Consola.solicitarHoraVuelo(),
                LocalDate.now(),
                Consola.solicitarDescripción()
            )
        }
        when (reserva){
            is ReservaHotel -> reservasHoteles[reserva.id] = reserva
            is ReservaVuelo -> reservasVuelos[reserva.id] = reserva
        }
    }

    /**
     * Implementación de la función obtener todas obtiene todas las reservas.
     */
    override fun obtenerTodas() {
        if (reservasHoteles.isNotEmpty()){
            reservasHoteles.forEach { Consola.mostrarReserva(it.value)  }
        }
        if (reservasVuelos.isNotEmpty()){
            reservasVuelos.forEach { Consola.mostrarReserva(it.value) }
        }
    }
}