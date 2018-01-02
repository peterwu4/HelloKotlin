fun main(args: Array<String>) {
    // 記事資料類別
    open class Item(val id: Long,
                    var title: String,
                    var content: String) {

        fun getReducedContent(length: Int = 5) =
                "${content.substring(0 until length)} ..."

        open fun getDetails() = "id=$id, title=$title, content=$content"
    }
    // 照片記事資料類別
    class ImageItem(id: Long,
                    title: String,
                    content: String,
                    var imageFile: String): Item(id, title, content) {

        override fun getDetails() = "${super.getDetails()}, imageFile=$imageFile"
    }

    // 錄音記事資料類別
    class RecordItem(id: Long,
                     title: String,
                     content: String,
                     var recordFile: String): Item(id, title, content) {
        override fun getDetails() = "${super.getDetails()}, recordFile=$recordFile"
    }

    // 多型宣告
    // val 變數名稱: 父類別名稱 = 子類別名稱(...)
    val imageItem: Item = ImageItem(2, "Greeting", "Good morning",
            "kotlin.jpg")
    val recordItem: Item = RecordItem(3, "Shopping", "Out of milk",
            "notify.map")

    // 多型的使用前與使用後

    var items: Array<Item> = arrayOf(
            Item(1, "A", "X"),
            Item(2, "B", "Y"),
            Item(3, "C", "Z"),
            ImageItem(11, "IA", "IX", "F1"),
            ImageItem(12, "IB", "IY", "F2"),
            ImageItem(13, "IC", "IZ", "F3"),
            RecordItem(21, "RA", "RX", "RF1"),
            RecordItem(22, "RB", "RY", "RF2"),
            RecordItem(23, "RC", "RZ", "RF3")
    )

    for (i in items) {
        println(i.getDetails())
    }

    fun showItem(item: Item) {
//        println("Item: " + item.getDetails())
        if (item is ImageItem) {
            println("ImageItem: " + item.getDetails())
        } else if (item is RecordItem) {
            println("RecordItem: " + item.getDetails())
        } else {
            println("Item: " + item.getDetails())
        }
    }

    for (i in items) {
        showItem(i)
    }

    // 還原變數的型態-使用智慧轉型(Smart Casts)
    fun showItemElement(item: Item) {
        when (item) {
            is ImageItem ->
                println("ImageItem: " + item.id + ", " + item.imageFile)
            is RecordItem ->
                println("RecordItem: " + item.id + ", " + item.recordFile)
            else ->
                println("Item: " + item.id)
        }
    }

    for (i in items) {
        showItemElement(i)
    }

    // 物件變數 as 要轉換的類別名稱
    val i: Item = ImageItem(12, "A", "X", "IF.jpg")
    val r: Item? = null

    val x: ImageItem = i as ImageItem

    val z: RecordItem? = r as RecordItem?
    println(z?.getDetails())
}