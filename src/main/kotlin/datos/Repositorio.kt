package org.practicatrim2.datos

import org.practicatrim2.Dominio.Reserva


/**
 * Repositorio que contiene las reservas
 *
 */
class Repositorio() {
    /**
     * Mapa mutable para introducir las reservas de hoteles, usando el id como clave y el objeto como valor.
     */
    val reservasHotel: MutableMap<Int, Reserva> = mutableMapOf()

    /**
     * Mapa mutable para introducir las reservas de vuelos, usando el id como clave y el objeto como valor.
     */
    val reservasVuelo: MutableMap<Int, Reserva> = mutableMapOf()
}