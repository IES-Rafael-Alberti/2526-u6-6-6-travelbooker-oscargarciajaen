package org.practicatrim2.Dominio

import java.time.LocalDate

/**
 * Representa una reserva de un vuelo.
 *
 * @property origen Es la ciudad desde la que se coge el vuelo.
 * @property destino Es la ciudad a la que se desea volar.
 * @property horaVuelo Es la hora del vuelo.
 * @property fechaCreacion Es la fecha del vuelo.
 * @property descripcion Es una breve descripción del vuelo.
 */
class ReservaVuelo private constructor(
    val origen: String,
    val destino: String,
    val horaVuelo: String,
    override val fechaCreacion: LocalDate = LocalDate.now(),
    override val descripcion: String
    ) : Reserva() {

    /**
     * @param id Es un identificador generado automáticamente.
     */
    override val id: Int = contadorId++

    /**
     * @property detalle Presentación de la reserva.
     * Se obtiene concatenando el resto de propiedades.
     */
    override val detalle
        get() = "$id - $descripcion - $origen -> $destino [$horaVuelo] "

    /**
     * Contiene una función estática de la clase ReservaVuelo.
     */
    companion object {
        private var contadorId = 1

        /**
         * Crear instancia
         *
         * @property origen Es la ciudad desde la que se coge el vuelo.
         * @param destino Es la ciudad a la que se desea volar.
         * @param horaVuelo Es la hora del vuelo.
         * @param fechaCreacion Es la fecha del vuelo.
         * @param descripcion Es una breve descripción del vuelo.
         * @return
         */
        fun crearInstancia(
            origen: String,
            destino: String,
            horaVuelo: String,
            fechaCreacion: LocalDate,
            descripcion: String
            ): ReservaVuelo {
                return ReservaVuelo(origen, destino, horaVuelo, fechaCreacion, descripcion)
        }
    }

    /**
     * Sobreescritura de la función toString para mostrar detalle.
     *
     * @return Retorna la propiedad detalle, que es una concatenación de varias propiedades.
     */
    override fun toString(): String {
        return detalle
    }

}
