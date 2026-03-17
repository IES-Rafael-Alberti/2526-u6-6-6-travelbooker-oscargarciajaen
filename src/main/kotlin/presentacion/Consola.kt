package org.practicatrim2.presentacion

import org.practicatrim2.Dominio.Reserva
import java.time.LocalDate

/**
 * Representa la consola.
 */
class Consola {

    /**
     * Contiene todos los métodos de la consola.
     */
    companion object{

        /**
         * Muestra el menú y solicita una opción.
         *
         * @return Retorna la opción introducida por el usuario.
         */
        fun mostrarMenu(): String{
            println("Elige una Opción 1, 2 o 3")
            println("1. Crear Reserva")
            println("2. Mostrar Reserva")
            println("3. Salir")

            var seleccion: String? = null

            do {
                print("\nTú opción -> ")
                val entrada = readLine()
                if (entrada != null && (entrada == "1" || entrada == "2" || entrada == "3") ) {
                    seleccion = entrada
                }
            } while(seleccion == null)
            return seleccion
        }

        /**
         * Solicita el tipo de reserva a realizar.
         *
         * @return Retorna el tipo de reserva seleccionado.
         */
        fun solicitarTipoReserva(): String{
            println("\nSelecciona el tipo de reserva 1 o 2")
            println("1. Reserva de Hotel")
            println("2. Reserva de Vuelo")

            var reserva: String? = null

            do {
                print("\nTú opción -> ")
                val entrada = readLine()
                if (entrada != null && (entrada == "1" || entrada == "2") ) {
                    reserva = entrada
                }
            } while(reserva == null)
            return reserva
        }

        /**
         * Solicita la ubicacion.
         *
         * @return Retorna la ubicación proporcionada por el usuario.
         */
        fun solicitarUbicacion(): String{
            println("Introduzca la ubicación")
            var ubicacion: String? = null

            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                if (entrada != null && entrada.isNotEmpty()) {
                    ubicacion = entrada
                }
            } while(ubicacion == null)
            return ubicacion
        }

        /**
         * Solicita el número de noches.
         *
         * @return Retorna el número de noches introducido por el usuario.
         */
        fun solicitarNumeroNoches(): Int{
            println("Introduzca el número de noches")
            var numeroNoches: Int? = null

            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                if (entrada != null && entrada.all { it.isDigit() }) {
                    val entradaEntera = entrada.toInt()
                    if (entradaEntera > 0 && entradaEntera < 100){
                        numeroNoches = entradaEntera
                    }
                }
            } while(numeroNoches == null)
            return numeroNoches
        }


        /**
         * Solicita una breve descripción.
         *
         * @return Retorna la descripción.
         */
        fun solicitarDescripción():String{
            println("Introduzca una breve descripción")
            var descripcion: String? = null

            do {
                print("\nTú respuesta -> ")
                val entrada = readLine()
                if (entrada != null && entrada.isNotEmpty()) {
                    descripcion = entrada
                }
            } while(descripcion == null)
            return descripcion
        }

        /**
         * Solicita la ciudad de origen.
         *
         * @return Retorna la ciudad introducida por el usuario.
         */
        fun solicitarOrigen():String{
            println("Introduzca el origen ")
            var origen: String? = null

            do {
                print("\nTú origen -> ")
                val entrada = readLine()
                if (entrada != null && entrada.isNotEmpty()) {
                    origen = entrada
                }
            } while(origen == null)
            return origen
        }

        /**
         * Solicita la ciudad de destino.
         *
         * @return Retorna la ciudad de destino introducida por el usuario.
         */
        fun solicitarDestino():String{
            println("Introduzca el destino ")
            var destino: String? = null

            do {
                print("\nTú destino -> ")
                val entrada = readLine()
                if (entrada != null && entrada.isNotEmpty()) {
                    destino = entrada
                }
            } while(destino == null)
            return destino
        }

        /**
         * Solicita la hora del vuelo.
         *
         * @return Retorna la hora introducida por el usuario.
         */
        fun solicitarHoraVuelo():String{
            val regex = "^([0-1][0-9]|2[0-3]):[0-5][0-9]$".toRegex()

            println("Introduzca la hora del vuelo ")
            var horaVuelo: String? = null

            do {
                print("\nLa hora -> ")
                val entrada = readLine()
                if (entrada != null && entrada.matches(regex)) {
                    horaVuelo = entrada
                }
            } while(horaVuelo == null)
            return horaVuelo
        }

        /**
         * Muestra todas las reservas.
         *
         * @param reserva Objeto de la clase reserva.
         */
        fun mostrarReserva(reserva: Reserva){
            println("$reserva")
        }
    }
}