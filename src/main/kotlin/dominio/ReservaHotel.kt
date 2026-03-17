package org.practicatrim2.Dominio

import java.time.LocalDate

/**
 * Representa la reserva de un hotel.
 *
 * @property ubicacion Ubicación del hotel.
 * @property numeroNoches Número de noches de estancia en el hotel.
 * @property fechaCreacion Fecha de la reserva.
 * @property descripcion Breve descripción sobre la reserva.
 */
class ReservaHotel private constructor(
    val ubicacion: String,
    val numeroNoches: Int,
    override val fechaCreacion: LocalDate = LocalDate.now(),
    override val descripcion: String,
): Reserva() {

    /**
     * @property id Generado automáticamente y asignado con cada instancia.
     */
    override val id: Int = contadorId++

    /**
     * @property detalle Presentación de la reserva.
     * Se obtiene concatenando el resto de propiedades.
     */
    override val detalle
        get() = "$id - $descripcion - $ubicacion ($numeroNoches)"

    /**
     * Contiene una función estática de la clase ReservaHotel
     */
    companion object {
        var contadorId = 1

        /**
         * Crea una instancia de la clase ReservaHotel.
         *
         * @param ubicacion Ubicación del hotel.
         * @param numeroNoches Número de noches de estancia en el hotel.
         * @param fechaCreacion Fecha de la reserva.
         * @param descripcion Breve descripción sobre la reserva.
         * @return Una instancia del objeto ReservaHotel
         */
        fun crearInstancia(
            ubicacion: String,
            numeroNoches: Int,
            fechaCreacion: LocalDate,
            descripcion: String): ReservaHotel {
            return ReservaHotel(ubicacion, numeroNoches, fechaCreacion, descripcion)
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