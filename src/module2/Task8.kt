//Задание 8: Проценты по вкладу
//Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
// Программа выводит в консоль информацию на сколько будет увеличиваться вклад каждый месяц.

fun main(array: Array<String>) {
    println("Введите сумму вклада")
    val depositAmount =
            try {
                readLine().toString().replace(",", ".").toDouble()
            } catch (e: NumberFormatException) {
                println("Сумма вклада должна быть числом")
                return
            }

    println("Введите длительность вклада в месяцах")
    val depositDuration =
            try {
                readLine().toString().toInt()
            } catch (e: NumberFormatException) {
                println("Длительность вклада должна быть числом")
                return
            }

    println("Введите процент по вкладу")
    val percent =
            try {
                readLine().toString().replace(",", ".").toDouble()
            } catch (e: NumberFormatException) {
                println("Процент по вкладу должен быть числом")
                return
            }
    println("Сумма, которую Вы получите, равна ${depositAmount * percent / 100 * depositDuration}")
}