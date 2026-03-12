package org.practicatrim2.Dominio

import java.time.LocalDate

class ReservaHotel private constructor(
    val ubicacion: String,
    val numeroNoches: Int,
    override val fechaCreacion: LocalDate = LocalDate.now(),
    override val descripcion: String,
): Reserva() {
    override val id: Int = contadorId++

    override val detalle
        get() = "$id - $descripcion - $ubicacion ($numeroNoches)"

    companion object {
        var contadorId = 0

        fun crearInstancia(
            ubicacion: String,
            numeroNoches: Int,
            fechaCreacion: LocalDate,
            descripcion: String): ReservaHotel {
            return ReservaHotel(ubicacion, numeroNoches, fechaCreacion, descripcion)
        }
    }

    override fun toString(): String {
        return detalle
    }
    
}