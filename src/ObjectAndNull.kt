
fun main(args: Array<String>) {
    var name1: String = "Simon" // name1不能給null
    var name2: String? = null

    println("name1.isNullOrBlank(): ${name1.isNullOrBlank()}")
    println("name1.isNullOrEmpty(): ${name1.isNullOrEmpty()}")
    println("name2.isNullOrBlank(): ${name2.isNullOrBlank()}")
    println("name2.isNullOrEmpty(): ${name2.isNullOrEmpty()}")

    println("name2.isBlank(): ${name2?.isBlank()}")
    println("name2.isEmpty(): ${name2?.isEmpty()}")

    val length: Int
    if (name2 != null) {
        length = name2.length
    } else {
        length = 0
    }
    println("length: $length")

    println(name2?.length ?:99)
    name2 = "peter"
    println(name2?.length ?:0)

    // 陣列與元素
    // 變數與元素都不可以指定null值
    var names3: Array<String> = arrayOf("One", "Two", "Three")
    // 變數不可以指定null值，元素可以
    var names4: Array<String?> = arrayOf("One", "Two", "Three")
    // 變數與元素都可以指定null值
    var names5: Array<String?>? = arrayOf("One", "Two", "Three")

    // names3[0] = null // 不可
    for (element in names3) {
        print("${element.length}\t")
    }
    println()

    names4[0] = null
    for (element in names4) {
        print("${element?.length}\t")
    }
}