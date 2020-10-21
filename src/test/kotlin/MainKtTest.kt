import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commision1() {
        val totalMonth = 30000.0
        val moneyTransfer = 20000.0
        val spentToday = 10000.0

        val result = commision(
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 0 рублей 0 копеек", result)
    }

    @Test
    fun commision2() {
        val totalMonth = 30000.0
        val moneyTransfer = 2000.0
        val spentToday = 1000.0

        val result = commision(
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 0 рублей 0 копеек", result)
    }

    @Test
    fun commision3() {
        val cardType = "MasterCard"
        val totalMonth = 350.0
        val moneyTransfer = 20.0
        val spentToday = 7800.0

        val result = commision(
            cardType = cardType,
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 21 рублей 2 копеек", result)
    }

    @Test
    fun commision4() {
        val cardType = "Maestro"
        val totalMonth = 306660.0
        val moneyTransfer = 300.0
        val spentToday = 7000.0

        val result = commision(
            cardType = cardType,
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 38 рублей 0 копеек", result)
    }

    @Test
    fun commision5() {
        val cardType = "Visa"
        val totalMonth = 7000.0
        val moneyTransfer = 700.0
        val spentToday = 800.0

        val result = commision(
            cardType = cardType,
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 52 рублей 5 копеек", result)
    }

    @Test
    fun commision6() {
        val cardType = "World"
        val totalMonth = 9000.0
        val moneyTransfer = 70.0
        val spentToday = 8000.0

        val result = commision(
            cardType = cardType,
            totalMonth = totalMonth,
            moneyTransfer = moneyTransfer,
            spentToday = spentToday
        )

        assertEquals("Комиссия - 35 рублей 0 копеек", result)
    }
}