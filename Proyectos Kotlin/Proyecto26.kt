fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    if (valor1 == valor2 && valor1 == valor3) {
        val cubo = valor1 * valor1 * valor3
        print("El cubo de $valor1 es $cubo")
    }
}