fun main(parametro: Array<String>) {
    print("Ingrese un valor entero con 1,2 o 3 cifras:");
    val valor = readln().toInt()
    if ( valor < 10)
        println("Tiene un dígito")
    else
        if ( valor < 100)
            println("Tiene dos dígitos")
        else
            if ( valor < 1000)
                println("Tiene tres dígitos")
            else
                println("Error en la entrada de datos.")
}