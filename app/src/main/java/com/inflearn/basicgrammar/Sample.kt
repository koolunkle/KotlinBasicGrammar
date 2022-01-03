package com.inflearn.basicgrammar

fun main() {

//    3. Template String

    val name = "jungi"
    val lastname = "Kim"
    println("my name is ${name + lastname} I'm 26")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")

    forAndWhile()

}

//    4. 조건식

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {

    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b: ${b}")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}

//    5. Array and List

fun array() {

    val array = arrayOf(1, 2, 3)
    array[0] = 3
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)
    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

//    6. 반복문

fun forAndWhile() {

    val students = arrayListOf("jungi", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index}번째 학생 : ${name}")
    }

    var sum: Int = 0

    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    for (i in 10 downTo 1) {
        sum += i
    }
    println(sum)

    for (i in 1 until 100) {
        sum += i
    }
    println(sum)

    var index = 0

    while (index < 10) {
        println("current index : ${index}")
        index++
    }

}

//    1. 함수

fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//    2. 변수

fun valAndVar() {

    val a: Int = 10
    var b: Int = 9
    b = 100

    val c = 100
    var d = 100

    var e: String
    var name = "jungi"

}