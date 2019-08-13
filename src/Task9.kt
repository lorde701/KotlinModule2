fun main(args: Array<String>) {
    val countries = arrayOf("Абхазия", "Австралия", "Австрия", "Азербайджан", "Албания")
    val capitals = arrayOf("Сухум", "Канберра", "Вена", "Баку", "Тирана")
    val currency = arrayOf("Российский рубль", "Австралийский доллар", "Евро", "Азербайджанский манат", "Албанский лек")

    val table = arrayOf(countries, capitals, currency)

    for (i in 0 until table[0].size) {
        for (j in 0 until table.size) {
            print(String.format("%-15s", table[j][i]))
        }
        println()
    }
}