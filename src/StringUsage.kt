fun main(args: Array<String>) {
    val literal: String = """
        for (c in name) {
            print(c)
        }
        """
    println(literal)

    val literal2: String = """
        |for (c in name) {
        |   print(c)
        |}
        """.trimMargin()
    println(literal2)

    // 比較與判斷
    val name: String = "simon"
    val name2 = "SIMON"

    println("name.equals(name2): ${name.equals(name2)}")
    println("name.equals(name2, ignarecase = true): ${name.equals(name2, true)}")

    val URL = "http://www.PRIME.peter.com.tw"

    println("URL.startsWith(\"http\"): ${URL.startsWith("http")}")
    println("URL.endsWith(\"tw\"): ${URL.endsWith("tw")}")

    println("URL.isBlank(): ${URL.isBlank()}")
    println("URL.isNotBlank(): ${URL.isNotBlank()}")
    println("URL.isEmpty(): ${URL.isEmpty()}")
    println("URL.isNotEmpty(): ${URL.isNotEmpty()}")

    // 長度、字元與搜尋
    for (i in name.indices) {
        print("${name.get(i)}\t")
    }
    println()
    for ( c in name) {
        print("$c\t")
    }
    println()
    println("name.length: ${name.length}")
    println("name.lastIndex: ${name.lastIndex}")

    println(URL)
    println("URL.indexOf(\"w\"): ${URL.indexOf("w")}")
    println("URL.lastIndexOf(\"w\"): ${URL.lastIndexOf("w")}")

    println("URL.indexOf(\"prime\"); ${URL.indexOf("prime")}")
    println("URL.indexOf(\"prime\", startPos:0, ignoreCase: true): " +
            "${URL.indexOf("prime", 0, true)}")

    // 轉換
    println("name.capitalize(): ${name.capitalize()}")
    println("name.decapitalize(): ${name.decapitalize()}")

    println("URL.toLowerCase(): ${URL.toLowerCase()}")
    println("URL.toUpperCase(): ${URL.toUpperCase()}")

    val intString = "35"
    val doubleString = "72.5"
    val booleanString = "true"

    val iv = intString.toInt()
    val dv = doubleString.toDouble()
    val bv = booleanString.toBoolean()

    val ns: CharArray = name.toCharArray()

    for (c in ns) {
        print(c); print(" ")
    }
    println()

    val ns2 = charArrayOf('x', 'x', 'x', 'x', 'x')
    // str.toCharArray(dest, dest offset, start, end(length?))
    name2.toCharArray(ns2, 0, 0, 3)
    for (c in ns2) { print(c); print(' ') }

    //內容
    println("name.repeat(3): ${name.repeat(3)}")
    println("name2.padStart(10): ${name2.padStart(10)}")
    println("name2.padStart(10, '-'): ${name2.padStart(10, '-')}")
    println("name2.padEnd(10): ${name2.padEnd(10)}")
    println("name2.padEnd(10, '-'): ${name2.padEnd(10, '-')}")

    println("URL.removePrefix(\"http://\"): ${URL.removePrefix("http://")}")
    println("URL.removeRange(0..6): ${URL.removeRange(0..6)}")

}