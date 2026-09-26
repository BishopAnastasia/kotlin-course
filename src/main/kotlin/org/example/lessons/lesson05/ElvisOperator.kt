package org.example.lesson05

fun main() {
//Задача 1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

//Задача 2
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

//Задача 3
    val pressure: String? = "36,6"
    val attentionMessage = "Что-то утеряно, милорд"
    val pressureForLab = pressure ?: attentionMessage

}