package lesson11

fun main() {
// Задача 1
    doSomething()

// Задача 2
    println(sum(124324, 1372873))

// Задача 3
    printText("Осень на дворе, камни на горе")

// Задача 4
    println(calculateAverage(listOf(58, 59, 1)))

// Задача 5
    println(getStringLength("Подвыподверта"))
    println(getStringLength(null))

// Задача 6
    println(getNullableDouble())

// Задача 7
    processNullableList(null)

// Задача 8
    println(getString(999))

// Задача 9
    println(getNullableStrings())

// Задача 10
    println(checkValues("Строка", 1))

// Задача 11
    println(multiplyByTwo(2))

// Задача 12
    println(isEven(3))

// Задача 13
    printNumbersUntil(5)

// Задача 14
    println(findFirstNegative(listOf(-1, 2, -3, 4)))

// Задача 15
    processList(listOf("самшит", "шуршит", "спешит"))
}

//1
fun doSomething(): Unit {
    println("что-то сделает, а модет и нет, зря ресурсы тратим")
}

//2
fun sum(first: Int, second: Int): Int {
    return first + second
}

//3
fun printText(text: String): Unit {
    println(text)
}

//4
fun calculateAverage(numbers: List<Int>): Double {
    return numbers.average()
}

//5
private fun getStringLength(text: String?): Int? {
    return text?.length
}

//6
fun getNullableDouble(): Double? {
    return null
}

//7
private fun processNullableList(numbers: List<Int>?): Unit {
    println(numbers)
}

//8
fun getString(number: Int): String? {
    return number.toString()
}

//9
fun getNullableStrings(): List<String?> {
    return listOf("Кот", null, "Обормот")
}

//10
fun checkValues(text: String?, number: Int?): Boolean? {
    return if (text != null && number != null) {
        text.length == number
    } else {
        null
    }
}

//11
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

//12
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//13
fun printNumbersUntil(n: Int): Unit {
    if (n < 1) {
        return
    }
    for (number in 1..n) {
        println(number)
    }
}

//14
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

//15
fun processList(strings: List<String?>): Unit {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}