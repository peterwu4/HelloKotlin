
enum class Colors01 {
    LIGHTGREY,
    BLUE,
    PURPLE,
    GREEN,
    ORANGE,
    RED
}
// 如果列舉型態需要包含每一個成員對應的資料，
//   在宣告的時候加入成員對應資料的參數
enum class Colors02(val value: Int) {
    // 在每一個成員名稱後的左右刮號裡面填入對應的資料
    LIGHTGREY(0XD3D3D3), BLUE(0X33B5E5), PURPLE(0XAA66CC),
    GREEN(0X99CC00), ORANGE(0XFFBB33), RED(0XFF4444);

    // 為列舉型態加入函式，傳回顏色代碼十六進位的字串
    fun colorCode() = "0x${value.toString(16).toUpperCase()}"
}
fun main(args: Array<String>) {

    val c01: Colors01 = Colors01.RED
    val c02: Colors01 = Colors01.GREEN
    val c03: Colors01 = Colors01.BLUE
    println("$c01, $c02, $c03")

    val cs: Array<Colors01> = Colors01.values()

    for( c in cs) {
        println("${c.ordinal}: ${c.name}")  // 索引編號(Int)和名稱(String)
    }

    fun getColorCode(color: Colors01) =
            when (color) {
                Colors01.LIGHTGREY -> 0XD3D3D3
                Colors01.BLUE -> 0X33B5E5
                Colors01.PURPLE -> 0XAA66CC
                Colors01.GREEN -> 0X99CC00
                Colors01.ORANGE -> 0XFFBB33
                Colors01.RED -> 0XFF4444
            }

    // toString(16)把整數轉換為16進位字串
    println("$c01: ${getColorCode(c01)}, ${getColorCode(c01).toString(16)}")
    println("$c02: ${getColorCode(c02)}, ${getColorCode(c02).toString(16)}")
    println("$c03: ${getColorCode(c03)}, ${getColorCode(c03).toString(16)}")

    val c0x: Array<Colors01> = arrayOf(c01, c02, c03)
    for (c in c0x) {
        println("$c: ${getColorCode(c)}, ${getColorCode(c).toString(16)}")
    }

    val c21: Colors02 = Colors02.RED
    val c22: Colors02 = Colors02.GREEN
    val c23: Colors02 = Colors02.BLUE

    val c2x: Array<Colors02> = arrayOf(c21, c22, c23)
    for (c in c2x) {
        println("$c: 0x${c.value.toString(16)}")
    }

    // 接收顏色代碼參數，傳回對應的列舉型態變數
    fun parseColor(value: Int): Colors02 {
        var result: Colors02 = Colors02.LIGHTGREY
        for (c in Colors02.values()) {
            if (value == c.value) {
                result = c
                break
            }
        }
        return result
    }

    val c04 = parseColor(0XFF4444)
    val c05 = parseColor(0X33B5E5)
    val c06 = parseColor(0X000000)

    println("\n$c04, $c05, $c06")

    for (c in c2x) {
        println("$c: ${c.colorCode()}")
    }

    // 使用列舉型態
    class Item(val id: Long, var title: String, var content: String,
               var color: Colors02 = Colors02.LIGHTGREY) {

        fun getDetails() = "Item(id=$id, title=$title, content=$content, color=$color)"
    }

    val item01: Item = Item(1, "Hello", "World", Colors02.RED)
    println(item01.getDetails())
}
