package org.practicatrim2.Dominio

import java.time.LocalDate

abstract class Reserva {
    abstract val id: Int
    abstract val fechaCreacion: LocalDate
    abstract val descripcion: String
    abstract val detalle: String
}