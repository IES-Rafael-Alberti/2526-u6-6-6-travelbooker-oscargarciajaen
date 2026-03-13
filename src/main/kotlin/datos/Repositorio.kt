package org.practicatrim2.datos

import org.practicatrim2.Dominio.Reserva


/**
 * Repositorio que contiene las reservas
 *
 */
class Repositorio<T> {
    /**
     * Mapa mutable para introducir las reservas de hoteles, usando un objeto T como clave y el objeto como valor.
     */
    val reservasHotel: MutableMap<T, Reserva> = mutableMapOf()

    /**
     * Mapa mutable para introducir las reservas de vuelos, usando un objeto T como clave y el objeto como valor.
     */
    val reservasVuelo: MutableMap<T, Reserva> = mutableMapOf()
}