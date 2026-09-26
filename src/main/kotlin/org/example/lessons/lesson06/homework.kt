package lesson06
import kotlin.math.floor

//Задание 1: "Определение сезона"
fun printSeason(month: Int) {
    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
        else -> println("Некорректно ввели чето")
    }
}

//Задание 2: "Расчет возраста питомца"
fun humanAge(dogAge: Int){
    when (dogAge){
        1 -> println(10.5)
        2 -> println(21)
        else -> println((dogAge-2)*4+21)
    }
}

//Задание 3: "Определение способа перемещения"
fun methodOfMovement(routeLength: Int){
    if(routeLength <= 1){
        println("Иди пешком")
    } else if(routeLength <= 5){
        println("Возьми велосипед")
    } else {
        println("Сядь в автобус")
    }
}

//Задание 4: "Расчет бонусных баллов"
fun bonusPoints(sum: Double){
    if(sum <= 1000){
        println((floor(sum/100)*2).toInt())
    } else {
        println((floor(sum/100)*3).toInt())
    }
}

//Задание 5: "Определение типа документа"
fun documentType(type: String){
    when (type) {
        "txt" -> println("текстовый документ")
        "jpeg" -> println("картинка")
        "exel" -> println("таблица")
        else -> println("непонятно что ето такое, если б мы знали что ето такое, но мы не знаем что ето такое")
    }
}

//Задание 6: "Конвертация температуры"
fun convertTemperature(temperature: Double, unit: String) {
    when (unit) {
        "C" -> {
            val result = temperature * 9 / 5 + 32
            print(result)
            println("F")
        }

        "F" -> {
            val result = (temperature - 32) * 5 / 9
            print(result)
            println("C")
        }

        else -> println("Некорректная единица измерения")
    }
}

//Задание 7: "Подбор одежды по погоде"
fun choiceOfClothing(temperature: Int){
    if(temperature <= 10 && temperature >= -29){
        println("куртка и шапка")
    } else if (temperature > 10 && temperature <= 18){
            println("ветровка")
    } else if (temperature > 18 && temperature <= 34){
        println("футболка и шорты")
    } else {println("сиди дома")}
}

//Задание 8: "Выбор фильма по возрасту"
fun ageRestrictions(age: Int){
    when (age) {
        in 0..9 -> println("детский")
        in 10..<18 -> println("подростковые")
        else -> println("остальное")
    }
}

fun main() {
    // Задание 1
    printSeason(5)
    // Задание 2
    humanAge(7)
    // Задание 3
    methodOfMovement(4)
    // Задание 4
    bonusPoints(5389.6)
    // Задание 5
    documentType("jpeg")
    // Задание 6
    convertTemperature(45.0, "C")
    // Задание 7
    choiceOfClothing(-30)
    // Задание 8
    ageRestrictions(13)
}