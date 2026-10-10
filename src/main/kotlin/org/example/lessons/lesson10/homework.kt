package lesson10

fun main() {

    // Задача 1
    val dict1: Map<Int, Int> = emptyMap()
    println(dict1)


    // Задача 2
    val dict2 = mapOf(
        4.5f to 40.5,
        7.5f to 70.5
    )
    println(dict2)


    // Задача 3
    val dict3 = mutableMapOf(
        34634 to "ТриЧетыреЛалала",
        43634 to "ЧетыреТриПупупууу"
    )
    println(dict3)


    // Задача 4
    dict3[3] = "ДваОдин"
    dict3[4] = "ОдинДва"
    println(dict3)


    // Задача 5
    val value = dict3[2]
    val missingValue = dict3[10]

    println(value)
    println(missingValue)


    // Задача 6
    dict3.remove(1)
    println(dict3)


    // Задача 7
    val dict4 = mapOf(
        10.0 to 2,
        15.0 to 3,
        20.0 to 0,
        25.0 to 5
    )

    for ((key, value) in dict4) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }


    // Задача 8
    dict3[2] = "А вот новое"
    println(dict3)


    // Задача 9
    val dict5a = mapOf(
        1 to "Ван",
        2 to "Ту"
    )

    val dict5b = mapOf(
        3 to "Фри",
        4 to "Фо бо"
    )

    val combinedDictionary = mutableMapOf<Int, String>()

    for ((key, value) in dict5a) {
        combinedDictionary[key] = value
    }

    for ((key, value) in dict5b) {
        combinedDictionary[key] = value
    }
    println(combinedDictionary)


    // Задача 10
    val dict6 = mapOf(
        "Первый список" to listOf(2, 4, 6, 8),
        "Второй список" to listOf(9, 10, 11),
        "Третий список" to listOf(1, 8, 6)
    )
    println(dict6)


    // Задача 11
    val dict7 = mutableMapOf(
        1 to mutableSetOf("кошка", "мышка"),
        2 to mutableSetOf("камышка", "кокошка")
    )

    val animals = dict7[1]
    animals?.add("ктошка?")
    println(animals)


    // Задача 12
    val dict8 = mapOf(
        (1 to 2) to "1 значение",
        (5 to 3) to "2 значение",
        (4 to 5) to "3 значение",
        (7 to 8) to "4 значение"
    )

    for ((key, value) in dict8) {
        if (key.first == 5 || key.second == 5) {
            println(value)
        }
    }


    // Задачи на подбор оптимального типа для словаря
    //1 Словарь библиотека
    val library = mapOf(
        "Агата Кристи" to listOf("Десять негритят", "Убийство в Восточном экспрессе"),
        "Стивен Кинг" to listOf("Оно", "Сияние", "Побег из Шоушенка")
    )
    println(library)


    //2 Справочник растений
    val plants = mapOf(
        "Цветы" to listOf("Амариллис", "Подсолнушек"),
        "Злаки" to listOf("Овес", "Пшено")
    )
    println(plants)


    //3 Четвертьфинала
    val teams = mapOf(
        "Манчестер" to listOf("Саша", "Маша"),
        "Ворчестер" to listOf("Даша", "Каша")
    )
    println(teams)


    //4 Курс лечения
    val treatment = mapOf(
        "2026-11-11" to listOf("антибиотик", "пробиотик"),
        "2026-11-12" to listOf("витаминка")
    )
    println(treatment)


    //5 Словарь путешественника
    val travelDictionary = mapOf(
        "Россия" to mapOf(
            "Тула" to listOf("фабрика пряников"),
            "Москва" to listOf("спешелти кофейни", "церковь на Петровке")
        ),
        "Франция" to mapOf(
            "Париж" to listOf("Нотрдам", "Лувр"),
            "Бордо" to listOf("Порт Луны")
        )
    )
    println(travelDictionary)
}