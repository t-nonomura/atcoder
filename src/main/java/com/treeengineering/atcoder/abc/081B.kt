package main.java.com.treeengineering.atcoder.abc

// TODO TLE改善
fun main(args: Array<String>) {
    readLine()
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var count = 0
    while (numbers.filter { it > 0 && it % 2 == 0 }.size == numbers.size) {
        count++
        numbers.map { it / 2 }
    }
    println("$count")
}