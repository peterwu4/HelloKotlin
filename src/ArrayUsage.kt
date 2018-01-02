fun main(args: Array<String>) {
/*
ByteArray
ShortArray
IntArray
LongArray
FloatArray
DoubleArray
CharArray
BooleanArray
*/
    val ages: IntArray = IntArray(3)
    ages[0] = 35; ages[1] = 12; ages[2] = 27

    for(element in ages) {
        println(element)
    }

    for(i in ages.indices) {
        println("[$i]: ${ages[i]}")
    }

    //
    val ages2 = intArrayOf(35, 17, 24)
    for((i, v) in ages2.withIndex()) {
        println("[$i]: $v")
    }
    var total = 0;
    for (age in ages2) {
        total += age
    }

    var average = total / ages.size

    println("Total: $total, Average: $average")

/*
val <name>: Array<String?> = arrayOfNulls<String>(<元素個數>)
val <name> = arrayOfNulls<String>(<元素個數>)
val <name>: Array<String?> = arrayOfNulls(<元素個數>)
 */
    val names: Array<String?> = arrayOfNulls<String>(3)
    names[0] = "Simon"; names[1] = "Mary"; names[2] = "Peter"

    for(element in names) {
        println(element)
    }
    println()
/*
val <name>: Array<String> = arrayOf<String>(String,...)
val <name>: Array<String> = arrayOf(String,...)
val <name> = arrayOf<String>(String,...)
val <name> = arrayOf(String,...)
 */
    val names2: Array<String> = arrayOf<String>("Chili", "Peter", "IU")
    for ((i, v) in names2.withIndex()) {
        println("[$i]: $v")
    }
    println()
}