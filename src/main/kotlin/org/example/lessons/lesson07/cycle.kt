package lesson07

fun main(){
println("---Задания для цикла for---")
    //Прямой диапазон 1-2
    for (i in 1..5){
        print(i)
    }
    println("   ")
    for (i in 2..10 step 2){
        print(i)
    }
    println("   ")
    //Обратный диапазон 3-4
    for (i in 5 downTo 1){
        print(i)
    }
    println("   ")

    for (i in 10 downTo 1 step 2){
        print(i)
    }
    println("   ")
    //С шагом (step) 5-6
    for (i in 1..10 step 2){
        print(i)
    }
    println("   ")
    for (i in 1..20 step 3){
        print(i)
    }
    println("   ")

    //Использование до (until) 7
    val size = 10
    for (i in 3 until size step 2){
        print(i)
    }
    println("   ")

println("---Задания для цикла while---")
    //Цикл while 8-9
    var num = 1
    while (num <= 5){
        print(num*num)
        num++
    }
    println("   ")

    var counter = 10
    while (counter >= 5) {
        print(counter)
        counter--
    }
    println("   ")

    //Цикл do while 10-11
    var a = 5
    do {print(a)}
        while (a-- > 1)
    println("   ")

    var b = 5
    do {println("повторяем цикл")}
    while (b++ < 10)
    println("   ")

println("---Задания для прерывания и пропуска итерации---")
    //Использование break 12-13
    for (i in 1..10) {
        if (i == 6) break
        print(i)
    }
    println("   ")

    var c = 1
    while (true) {
        print(c)
        if (c == 10) break
        c++
    }
    println("   ")

    //Использование continue 14-15
    for(i in 1..10){
        if (i % 2 == 0) continue
        print(i)
    }
    println("   ")

    var d = 1
    while (d <= 10) {
        if (d % 3 == 0){
            d++
            continue
        }
        print(d)
        d++
    }
}