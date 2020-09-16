import junit.framework.Assert.assertEquals


class DifferentCommissionKtTest {

    @org.junit.Test

    fun commission_VKPay() {

        val typeCard = "VKPay"
        val sumPreviousTransfer = 500000
        val sumTransfer = 250000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 0.0)
    }

    @org.junit.Test

    fun commission_MasterCard_limit() {

        val typeCard = "MasterCard"
        val sumPreviousTransfer = 500000
        val sumTransfer = 250000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 0.0)
    }
    @org.junit.Test

    fun commission_MasterCard_noLimit() {

        val typeCard = "MasterCard"
        val sumPreviousTransfer = 5000000
        val sumTransfer = 25000000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 152000.0)
    }

    @org.junit.Test

    fun commission_Visa_limit() {

        val typeCard = "Visa"
        val sumPreviousTransfer = 500000
        val sumTransfer = 250000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 3500.0)
    }
    @org.junit.Test

    fun commission_Visa_noLimit() {

        val typeCard = "Visa"
        val sumPreviousTransfer = 5000000
        val sumTransfer = 25000000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 1875000.0)
    }
}