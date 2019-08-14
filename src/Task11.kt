fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "Петров Иван", 2 to "Сидоров Петр", 3 to "Колосов Александр", 4 to "Воронов Сергей", 5 to "Куликов Олег")

    println("Введите номер места")
    try {
        val seatNumber = readLine().toString().toInt()

        if (map[seatNumber] != null)
            println("На месте $seatNumber сидит ${map[seatNumber]}")
        else println("Место свободно")

    } catch (e: NumberFormatException) {
        println("Было введено не число")
    }

}