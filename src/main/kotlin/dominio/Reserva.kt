package org.practicatrim2.Dominio

import java.time.LocalDate

/**
 * Representa una reserva genérica.
 *
 * Define el comportamiento para las subclases ReservaHotel y ReservaVuelo.
 */
abstract class Reserva {

    /**
     * Es el id de la reserva.
     */
    abstract val id: Int

    /**
     * Es la fecha de la reserva.
     */
    abstract val fechaCreacion: LocalDate

    /**
     * Es una breve descripción de la reserva.
     */
    abstract val descripcion: String

    /**
     * Son los detalles de la reserva.
     */
    abstract val detalle: String
}