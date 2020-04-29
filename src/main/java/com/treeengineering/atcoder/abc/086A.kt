package main.java.com.treeengineering.atcoder.abc

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(if (a * b % 2 == 0) "Even" else "Odd")
}