package etapa1_Basicos

// El objetivo de este ejercicio es manejar el control de flujo a través de "if" y "when
fun main() {
    var edadUsuario = 0
    var esMayor = false
    var rolUsuario = "Acceso de solo lectura"

    println("Hola! Cuál es su edad?\n")
    edadUsuario = readln().toIntOrNull() ?: 0
    esMayor = edadUsuario >= 18
    if(esMayor){
        println("Sos mayor de edad")
    }

    rolUsuario = when (edadUsuario){
        in 25..Int.MAX_VALUE -> "ADMIN"
        in 18..Int.MAX_VALUE -> "Editor"
        else -> "Acceso de solo lectura"
    }
    println("Tu nivel de acceso es de $rolUsuario")
}