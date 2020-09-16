import junit.framework.Assert.assertEquals
import ru.netology.commission

class DifferentCommissionKtTest {

    @org.junit.Test

    fun commission_VKPay() {

        val typeCard = "VKPay"
        val sumPreviousTransfer = 5000000
        val sumTransfer = 25000000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 0.0)
    }

    @org.junit.Test

    fun commission_MasterCard() {

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

    fun commission_Visa() {

        val typeCard = "Visa"
        val sumPreviousTransfer = 5000000
        val sumTransfer = 25000000


        val result = commission(
            typeCard = typeCard,
            sumPreviousTransfer = sumPreviousTransfer,
            sumTransfer = sumTransfer
        )
        assertEquals(result, 187500.0)
    }
}