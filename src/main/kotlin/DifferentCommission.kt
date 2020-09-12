package ru.netology

import kotlin.math.roundToInt

//все суммы в копейках

const val minCommissionVisa = 3500.0
const val commissionVisa = 0.75
const val commissionMasterCard = 0.6
const val commissionMasterCard20 = 2000
const val limitMasterCard = 7500000


fun main() {

    val result = commission("MasterCard", 5000000, 25000000)
    val res = result.roundToInt()
    println("Комиссия = $res копеек")

}

fun commission(typeCard: String = "VKPay", sumPreviousTransfer: Int = 0, sumTransfer: Int):  Double{
    return when (typeCard) {

        "MasterCard", "Maestro" -> if (sumPreviousTransfer + sumTransfer <= limitMasterCard) 0.0
        else sumTransfer * commissionMasterCard / 100 + commissionMasterCard20

        "Visa", "Мир" -> if (sumTransfer * commissionVisa / 100 < minCommissionVisa) minCommissionVisa
        else sumTransfer * commissionVisa / 100

        else -> 0.0
    }
}