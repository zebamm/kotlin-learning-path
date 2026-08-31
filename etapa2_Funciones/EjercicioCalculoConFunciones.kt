package etapa2_Funciones

//El objetivo de este ejercicio es simplemente probar el uso de sintaxis para funciones dentro de kotlin,
//incluyendo la declaración de una función de expresión única y el manejo de parametros por defecto.


//num2 (el descuento), es un parametro por defecto, no es necesario pasarlo cuando se declare
fun calcularPrecioFinal(num1: Double, num2: Double = 0.0): Double =
    num1 - (num1*(num2/100))

fun main(){
    println("Ingrese el precio base del producto: ")
    val precioBase = readln().toDouble()
    println("Ingrese el porcentaje de descuento: ")
    val descuento = readln().toDouble()

    var precioFinal = calcularPrecioFinal(precioBase)
    println("\nEl precio sin descuento es $precioFinal")
    precioFinal = calcularPrecioFinal(precioBase, descuento)
    println("\nEl precio final es $precioFinal")
}