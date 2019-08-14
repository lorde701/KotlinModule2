fun main(array: Array<String>) {
    println("Введите сумму вклада")
    val depositAmount: Double?
    try {
        depositAmount = readLine()?.replace(",", ".")?.toDouble()
    } catch (e: NumberFormatException) {
        println("Сумма вклада должна быть числом")
        return
    }

    println("Введите длительность вклада в месяцах")
    val depositDuration: Int?
    try {
        depositDuration = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        println("Длительность вклада должна быть числом")
        return
    }

    println("Введите процент по вкладу")
    val percent: Double?
    try {
        percent = readLine()?.replace(",", ".")?.toDouble()
    } catch (e: NumberFormatException) {
        println("Процент по вкладу должен быть числом")
        return
    }
    if (depositAmount != null && percent != null)

        println("Сумма, которую Вы получите, равна ${depositAmount * percent / 100 * depositDuration}")

}