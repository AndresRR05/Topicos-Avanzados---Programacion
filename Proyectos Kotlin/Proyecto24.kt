fun main(parametro: Array<String>) {
    print("Ingrese día:")
    val dia = readln().toInt()
    print("Ingrese mes:")
    val mes = readln().toInt()
    print("Ingrese Año:")
    val año = readln().toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        print("Corresponde al primer trimestre");
}
