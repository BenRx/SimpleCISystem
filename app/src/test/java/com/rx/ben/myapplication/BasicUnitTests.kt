package com.rx.ben.myapplication

import org.junit.Assert
import org.junit.Test
import java.util.*

class BasicUnitTests {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
        Assert.assertEquals(6, 4 + 2)
        Assert.assertEquals(12, 4 + 8)
    }

    @Test
    fun string_isCorrect() {
        Assert.assertEquals("TOTO", "TOT" + "O")
    }

    @Test
    fun checkDateFormatter() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.DAY_OF_MONTH, 29)
        calendar.set(Calendar.MONTH, 7)
        calendar.set(Calendar.YEAR, 1993)

        Assert.assertEquals(DateUtils.getEUFormattedDate(calendar.time), "29/08/1993")
        Assert.assertEquals(DateUtils.getUSFormattedDate(calendar.time), "08/29/1993")

    }


}