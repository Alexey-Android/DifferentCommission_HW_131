import junit.framework.Assert.assertEquals


class DifferentCommissionKtTest {

    @org.junit.Test

    fun commission_VKPay() {

        val result = commission(
            typeCard = "VKPay",
            sumPreviousTransfer = 500_000,
            sumTransfer = 250_000
        )
        assertEquals(result, 0.0)
    }

    @org.junit.Test

    fun commission_MasterCard_limit() {

        val result = commission(
            typeCard = "MasterCard",
            sumPreviousTransfer = 500_000,
            sumTransfer = 250_000
        )
        assertEquals(result, 0.0)
    }
    @org.junit.Test

    fun commission_MasterCard_noLimit() {

        val result = commission(
            typeCard = "MasterCard",
            sumPreviousTransfer = 5_000_000,
            sumTransfer = 25_000_000
        )
        assertEquals(result, 152000.0)
    }

    @org.junit.Test

    fun commission_Visa_limit() {

        val result = commission(
            typeCard = "Visa",
            sumPreviousTransfer = 500_000,
            sumTransfer = 250_000
        )
        assertEquals(result, 3500.0)
    }
    @org.junit.Test

    fun commission_Visa_noLimit() {

        val result = commission(
            typeCard = "Visa",
            sumPreviousTransfer = 5_000_000,
            sumTransfer = 25_000_000
        )
        assertEquals(result, 187500.0)
    }
}