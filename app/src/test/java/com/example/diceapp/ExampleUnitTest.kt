package com.example.diceapp

import org.junit.Test

import org.junit.Assert.*
import org.junit.Assert.assertTrue
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generate_num(){
        val dice =Dice(6)
        val rollResult =dice.roll()
        assertTrue(" value is wrong", rollResult in 1..6)
    }
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}