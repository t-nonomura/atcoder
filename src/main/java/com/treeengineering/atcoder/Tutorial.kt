package main.java.com.treeengineering.atcoder

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b,c) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine() ?: ""
    println("${a + b + c} $s")
}