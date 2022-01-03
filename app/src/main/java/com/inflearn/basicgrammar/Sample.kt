package com.inflearn.basicgrammar

fun main() {

//    3. Template String

    val name = "jungi"
    val lastname = "Kim"
    println("my name is ${name + lastname} I'm 26")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")

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