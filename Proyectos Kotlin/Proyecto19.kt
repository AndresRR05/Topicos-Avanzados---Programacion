fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    if (valor1 > valor2)
        if (valor1 > valor3)
            print(valor1)
        else print(valor3)
    else
        if (valor2 > valor3)
            print(valor2)
        else
            print(valor3)
}