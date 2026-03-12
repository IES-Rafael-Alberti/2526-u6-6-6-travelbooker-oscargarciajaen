package org.practicatrim2.datos

import org.practicatrim2.Dominio.Reserva

class Repositorio() {
    val reservasHotel: MutableMap<Int, Reserva> = mutableMapOf()

    val reservasVuelo: MutableMap<Int, Reserva> = mutableMapOf()
}