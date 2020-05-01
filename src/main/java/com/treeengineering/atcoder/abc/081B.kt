package main.java.com.treeengineering.atcoder.abc

fun main(args: Array<String>) {
    readLine()
    var numbers = readLine()!!.split(" ").map { it.toInt() }

    var c = 0

    var flag = true
    while (true) {
        for (n in numbers) {
            if (n % 2 == 1) {
                flag = false
                break
            }
        }
        if (flag) {
            numbers = numbers.map { it / 2 }
            c++
        } else {
            break
        }
    }
    println("$c")
}