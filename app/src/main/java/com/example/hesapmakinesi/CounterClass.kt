package com.example.hesapmakinesi

import android.util.Log

class CounterClass {

    var state:CounterState = CounterState.WAITINGFIRSTNUMBER
    var firstNumber = 0;
    var secondNumber = 0;
    val resetMessage = "Please type a number"

    fun NumberButtonPressed(number:Int) : String
    {
        WriteLog()
        Log.e("Number", "Pressed $number")
        when(state)
        {
            CounterState.WAITINGFIRSTNUMBER ->
            {
                firstNumber = addNumber(firstNumber,number)
                Log.e("Number", "New Number $firstNumber")
                return firstNumber.toString()
            }
            CounterState.WAINTINGSECONDNUMBER ->
            {
                secondNumber = addNumber(secondNumber,number)
                Log.e("Number", "New Number $secondNumber")
                return "$firstNumber + $secondNumber"
            }
            CounterState.RESULT ->
            {
                state = CounterState.WAITINGFIRSTNUMBER
                firstNumber = number
                secondNumber = 0
                return number.toString()
            }
        }
    }
    fun EqualButtonPressed() : String
    {
        WriteLog()
        state = CounterState.RESULT
        return result(firstNumber,secondNumber)
    }
    fun PlusButtonPressed() : String
    {
        WriteLog()
        when(state)
        {
            CounterState.WAITINGFIRSTNUMBER ->
            {
                state = CounterState.WAINTINGSECONDNUMBER
                return "$firstNumber +"
            }
            CounterState.WAINTINGSECONDNUMBER ->
            {
                firstNumber = firstNumber+secondNumber
                secondNumber = 0
                return "$firstNumber +"
            }
            CounterState.RESULT ->
            {
                return result(firstNumber,secondNumber)
            }
        }
    }
    fun addNumber(fist:Int, second:Int) : Int
    {
        return fist*10+second
    }
    fun WriteLog()
    {
        Log.e("Number", "State $state")
        Log.e("Number", "First Number $firstNumber")
        Log.e("Number", "Second Number $secondNumber")
    }
    fun result(fist: Int, second:Int):String
    {
        return "$fist + $second = ${fist+second}"
    }
    fun reset() : String
    {
        firstNumber = 0
        secondNumber = 0
        state = CounterState.WAITINGFIRSTNUMBER
        return resetMessage
    }
}