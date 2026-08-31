package etapa2_Funciones

/* El objetivo de este ejercicio es utilizar argumentos nombrados al momento de llamar a una
* función. */

fun crearPerfil(nombre: String, rol: String = "USUARIO", notificaciones: Boolean = false, temaVisual : String = "Oscuro") =
    println("""
        Nombre del perfil: $nombre
        Rol del usuario: $rol
        Notificaciones: $notificaciones
        Tema Visual: $temaVisual
    """.trimIndent())

fun main() {
    //Primera ejecución de la función, simplemente le pasamos el nombre y el tema usando argumentos nombrados
    crearPerfil(nombre ="Sebastian", temaVisual = "Claro")

    //Segunda ejecución, pasamos todos los valores pero con el orden completamente mezclado
    crearPerfil(notificaciones = true, temaVisual = "Claro", nombre = "Matias", rol = "ADMIN")

    //Tercera ejecución, solo llamamos a la función de manera normal sin nombres de argumentos
    crearPerfil("Antonella", "ADMIN")
}