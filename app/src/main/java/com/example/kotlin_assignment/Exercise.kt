package com.example.kotlin_assignment

import android.net.wifi.WifiManager
import java.util.*


fun main() {
   exerciseOne()
}

fun exerciseOne(){
    do {
        val scanner = Scanner(System.`in`)
        print("Please Enter Palindrome number \n")

        val value = scanner.nextLong()

        var temp = value
        var holder: Long = 0L
        var holderTwo: Long
        while (!temp.equals(0L)) {
            holderTwo = temp % 10
            holder = holder * 10 + holderTwo
            temp = temp / 10
        }
        if (value == holder) {
            print("The text you entered is Palindrome and you pass the test.")
            break
        } else {
            print("You fail!, Please try with other text...\n")
        }
    } while (value != holder)
}

