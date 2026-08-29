package etapa1_Basicos
/* Este ejercicio busca profundizar sobre el uso de "when" y manejo de los datos ingresados
* desde la consola */

fun main() {
    val componenteID: String

    println("Bienvenido al panel de diagnostico\nIngrese el identificador del componente: ")
    componenteID = readln().uppercase()

    when(componenteID){
        "I", "J" -> println("\nCalibrando temperatura del extrusor seleccionado...")
        "1" -> println("\nVerifique la etiqueta fisica, quiso decir 'I'?")
        "CAMA", "BED", "DISPLAY" -> println("\nLos diagnosticos del componente son correctos")
        else -> println("\nNo se reconoce ese componente en el sistema")
    }
}