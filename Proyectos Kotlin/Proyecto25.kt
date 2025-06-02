fun main(parametro: Array<String>) {
    print("Ingrese día:")
    val dia = readln().toInt()
    print("Ingrese mes:")
    val mes = readln().toInt()
    print("Ingrese Año:")
    val año = readln().toInt()
    if (mes==12 && dia==25)
        print("La fecha ingresada corresponde a navidad.");
}