package org.practicatrim2.Dominio

import java.time.LocalDate

class ReservaVuelo(
    val origen: String,
    val destino: String,
    val horaVuelo: String,
    override val id: Int = contadorId++,
    override val fechaCreacion: LocalDate = LocalDate.now(),
    override val descripcion: String
    ) : Reserva() {

    init {
        require(
            horaVuelo.length == 5 && horaVuelo.contains(":")
                    && horaVuelo[0].isDigit() && horaVuelo[1].isDigit()
                    && horaVuelo[3].isDigit() && horaVuelo[4].isDigit()
        ) { "Hora del vuelo no válida" }
    }

    override val detalle
        get() = "$id - $descripcion - $origen -> $destino [$horaVuelo] "

    companion object {
        private var contadorId = 0

        fun crearInstancia(
            origen: String,
            destino: String,
            horaVuelo: String,
            id: Int,
            fechaCreacion: LocalDate,
            descripcion: String
            ): ReservaVuelo {
                return ReservaVuelo(origen, destino, horaVuelo, id, fechaCreacion, descripcion)
        }
    }
}
