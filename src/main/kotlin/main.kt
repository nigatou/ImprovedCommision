fun main() {
    println(commision(totalMonth = 30000.0, moneyTransfer = 20000.0, spentToday = 10000.0))
    println(commision(totalMonth = 34000.0, moneyTransfer = 2000.0, spentToday = 1000.0))
    println(commision(cardType = "MasterCard", totalMonth = 350.0, moneyTransfer = 20.0, spentToday = 7800.0))
    println(commision(cardType = "Maestro", totalMonth = 306660.0, moneyTransfer = 300.0, spentToday = 7000.0))
    println(commision(cardType = "Visa", totalMonth = 7000.0, moneyTransfer = 700.0, spentToday = 800.0))
    println(commision(cardType = "World", totalMonth = 9000.0, moneyTransfer = 70.0, spentToday = 8000.0))
}

fun commision(
    cardType: String = "VkPay",
    totalMonth: Double,
    moneyTransfer: Double,
    spentToday: Double = 0.0,
    happyDay: Boolean = false
): String {
    var commision = 0.0

    when (cardType) {
        "VkPay" -> {
            if (moneyTransfer > 15000 || totalMonth + moneyTransfer > 40000) {
                println("Transfer cannot be sent")
            } else {
                commision = 0.0
            }
        }
        else -> {
            if (spentToday + moneyTransfer > 150000 || totalMonth + moneyTransfer > 600000) {
                println("Transfer cannot be sent")
            } else {
                when (cardType) {
                    "MasterCard", "Maestro" -> {
                        commision = if (happyDay && moneyTransfer in 75.0..75000.0) {
                            0.0
                        } else {
                            moneyTransfer * 0.06 + 20
                        }
                    }
                    "Visa", "World" -> {
                        commision = if (moneyTransfer * 0.075 > 35) {
                            moneyTransfer * 0.075
                        } else {
                            35.0
                        }
                    }
                }
            }
        }
    }
    return ("Комиссия - ${commision.toString().split(".")[0]} рублей ${commision.toString().split(".")[1]} копеек")
}