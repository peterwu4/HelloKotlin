fun main(a: Array<String>) {

    var i = 0

    while (i < 5) {
        print(i)
        i++
    }

    var j = 0
    var total = 0
    do {
        total += j++
    } while(j <= 10)

    print("\nTotal = $total\n")

    for (i in 0..4) {
        print(i)
    }
    println()

    for (c in 'A'..'E') { // 不用宣告，真好~
        print(c)
    }
    println()

    total = 1
    for (i in 1..10) {
        total *= i
    }
    println("Total: $total")

    //for loop 各種設定條件
    println("\nfor (i in 1..5)")
    for (i in 1..5) {
        print(i)    // 顯示：12345
    }

    println("\nfor (i in 1..5 step 2)")
    for (i in 1..5 step 2) {
        print(i)    // 顯示：135
    }

    println("\nfor (i in 1 until 5)")
    for (i in 1 until 5) {
        print(i)    // 顯示：1234
    }

    println("\nfor (i in 5..1)")
    for (i in 5..1) {   // 迴圈不會執行
        print(i)
    }

    println("\nfor (i in 5 downTo 1)")
    for (i in 5 downTo 1) {
        print(i)    // 顯示：54321
    }

    println("\nfor (i in 5 downTo 1 step 2)")
    for (i in 5 downTo 1 step 2) {
        print(i)    // 顯示：531
    }

}