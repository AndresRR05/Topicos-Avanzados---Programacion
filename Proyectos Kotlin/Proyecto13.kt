fun main(parametro: Array<String>) {
    print("Ingrese primer nota:")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2 = readln().toInt()
    print("Ingrese tercer nota:")
    val nota3 = readln().toInt()
    var promedio = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7) println("Promocionado")
}