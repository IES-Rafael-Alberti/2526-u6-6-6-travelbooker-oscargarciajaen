package org.practicatrim2.servicios

import org.practicatrim2.Dominio.ReservaHotel
import org.practicatrim2.presentacion.Consola

class ReservaService(): IReservaRepository {

    override fun agregar(seleccion: String) {
        when (seleccion){
            "1" -> ReservaHotel.crearInstancia(
                Consola.solicitarUbicacion(),
                Consola.solicitarNumeroNoches(),
                pene
                )
        }
    }

    override fun obtenerTodas() {

    }
}