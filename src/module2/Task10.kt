//Задание 10: Города
//Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
//- Добавить название города в программу.
//- Посмотреть в консоли список всех добавленных городов
//- Посмотреть список добавленных городов без повторений
//- Выход из программы
//Для хранения используйте коллекцию типа List.

var cities = mutableListOf<String>()

fun main(args: Array<String>) {
    while (true) {
        println("""
            |
            |Выберите один из предложенных вариантов (введите число)
        |1. Добавить город
        |2. Посмотреть список городов
        |3. Посмотреть список городов без дубликатав
        |4. Выход
    """.trimMargin())

        try {
            val choice = readLine().toString().toInt()
            when (choice) {
                1 -> addCity()
                2 -> printCities()
                3 -> printCitiesWithoutDuplicate()
                4 -> return
                else -> println("Варианта <$choice> нет")
            }
        } catch (e: NumberFormatException) {
            println("Введите число")
        }
    }

}

fun printCitiesWithoutDuplicate() {
    println("Все города без повторов:")
    cities.toSet().forEach { println(it) }
}

fun printCities() {
    println("Все города:")
    cities.forEach { println(it) }
}

fun addCity() {
    println("Введите название города")
    val city = readLine().toString()
    cities.add(city)
}
