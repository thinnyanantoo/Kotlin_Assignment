package com.example.kotlin_assignment

import java.util.*

fun main() {
    var matchOne = 0
    var matchTwo = 0
    var matchThree = 0
    val value = arrayOf("\\(|\\)", "\\[|\\]", "\\{|\\}")
    val regexOne: Regex = Regex(value[0])
    val regexTwo: Regex = Regex(value[1])
    val regexThree: Regex = Regex(value[2])

    val scanner = Scanner(System.`in`)
    print("Please Enter {,(,[,},),] ")
    val symbol = scanner.next()
    for (i in 1..symbol.length) {
        if (symbol[i] == '(' || symbol[i] == ')' || symbol[i] == '{' || symbol[i] == '}' || symbol[i] == '[' || symbol[i] == ']') {
            if (symbol.length % 2 != 0) {
                print("It's not balanced")
                break
            } else {
                matchOne = regexOne.findAll(symbol).count()
                matchOne /= 2
                matchTwo = regexTwo.findAll(symbol).count()
                matchTwo /= 2
                matchThree = regexThree.findAll(symbol).count()
                matchThree /= 2
                print("It’s balanced. pair of { = ${matchThree} , pair of [ =  ${matchTwo} , pair of ( = ${matchOne}")
                break
            }
        } else {
            print("Invalid value")
            break
        }
    }
}










