fun main(parametro: Array<String>){
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    if (valor == 0)
        println("Se ingresó el cero")
    else
        if (valor > 0)
            println("Se ingresó un valor positivo")
        else
            println("Se ingresó un valor negativo")
}