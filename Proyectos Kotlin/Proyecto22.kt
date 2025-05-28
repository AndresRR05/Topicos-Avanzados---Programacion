fun main(parametro: Array<String>) {
    print("Ingrese la cantidad total de preguntas del examen:")
    val totalPreguntas = readln().toInt()
    print("Ingrese la cantidad total de preguntas contestadas correctamente:")
    val totalCorrectas = readln().toInt()
    val porcentaje = totalCorrectas * 100 / totalPreguntas;
    if ( porcentaje >= 90)
        println("Nivel máximo")
    else
        if (porcentaje >= 75)
            System.out.print("Nivel medio")
        else
            if ( porcentaje >= 50)
                println("Nivel regular")
            else
                println("Fuera de nivel")
}