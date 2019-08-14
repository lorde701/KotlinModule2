import java.util.concurrent.TimeUnit

val question1 = """Какая столица Португалии?
        |1. Катманду
        |2. Лиссабон
        |3. Рим
        |4. Прага
    """.trimMargin()
const val correctAnswer1 = 2

val question2 = """Какая столица Мальта?
        |1. Абуджа
        |2. Тирана
        |3. Пекин
        |4. Валлетта
    """.trimMargin()
const val correctAnswer2 = 4

val question3 = """Какая столица Эстонии?
        |1. Богота
        |2. Астана
        |3. Таллин
        |4. Багдад
    """.trimMargin()
const val correctAnswer3 = 3

val question4 = """Какая столица Грузии?
        |1. Тбилиси
        |2. Порт-Вила
        |3. Эль-Кувейт
        |4. Дамаск
    """.trimMargin()
const val correctAnswer4 = 1

val question5 = """Какая столица Австрии?
        |1. Осло
        |2. Вена
        |3. Душанбе
        |4. Любляна
    """.trimMargin()
const val correctAnswer5 = 2

fun main(args: Array<String>) {
    println("Ответьте на несколько вопросов (необходимо вводить номер правильного ответа)")
    TimeUnit.SECONDS.sleep(1L)

    var countCorrectAnswers = 0
    if (checkAnswer(1, question1, correctAnswer1)) countCorrectAnswers++
    if (checkAnswer(2, question2, correctAnswer2)) countCorrectAnswers++
    if (checkAnswer(3, question3, correctAnswer3)) countCorrectAnswers++
    if (checkAnswer(4, question4, correctAnswer4)) countCorrectAnswers++
    if (checkAnswer(5, question5, correctAnswer5)) countCorrectAnswers++

    when(countCorrectAnswers) {
        5 -> println("Результат 5 из 5. Отличная работа! Ни одной ошибки")
        4 -> println("Результат 4 из 5. Вы хорошо знаете столицы!")
        3 -> println("Результат 3 из 5. Вы неплохо знаете столицы")
        2 -> println("Результат 2 из 5. Не мешало бы освежить свои знания")
        1 -> println("Результат 1 из 5. Могло бы быть и хуже :)")
        0 -> println("Результат 0 из 5. Наверное, Вы устали. Отдохните и попробуйде еще раз :)")
    }

}

fun checkAnswer(questionNumber: Int, questionWithAnswers: String, correctAnswer: Int): Boolean {
    println("""
        |
        |Вопрос №$questionNumber
        |$questionWithAnswers
    """.trimMargin())
    var userAnswer = 0
    try {
        userAnswer = readLine().toString().toInt()
    } catch (e: NumberFormatException){
        println("Было введено не число")
    }
    if (userAnswer == correctAnswer) {
        println("Правильный ответ")
        return true
    }
    println("Неверный ответ")
    return false
}