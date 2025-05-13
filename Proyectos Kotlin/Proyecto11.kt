fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 > valor2)
        print("El mayor valor es $valor1")
    else print("El mayor valor es $valor2")
}