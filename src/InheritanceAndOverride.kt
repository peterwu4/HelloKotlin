fun main(args: Array<String>) {
    // 使用繼承設計的類別
    // open關鍵字：可以被繼承的父類別(super class)
    open class Item(val id: Long,
                    var title: String,
                    var content: String) {

        // 傳回簡短的記事內容
        // 因為不需要讓子類別覆寫，所以不需要加入open關鍵字
        fun getReducedContent(length: Int = 5) =
                "${content.substring(0 until length)} ..."

        // 加入open關鍵字讓子類別可以覆寫這個函式
        // 因為子類別需要加入額外的資訊，例如ImageItem的imageFile
        open fun getDetails() = "id=$id, title=$title, content=$content"
    }
    //
    val subclass_format: String = """
        # class 類別名稱(參數名稱: 參數型態, ... val|var 屬性名稱: 屬性型態): 父類別名稱(參數, ...)
        #""".trimMargin("#")
    println(subclass_format)

    class ImageItem(id: Long,
                    title: String,
                    content: String,
                    var imageFile: String): Item(id, title, content) {

        // 不用覆寫繼承自父類別的getReducedContent函式

        // 加入override關鍵字覆寫父類別的函式
        //  顯示繼承自父類別的id、title與content  // 用super.fun() 呼叫父類別的函式
        //  還有自己宣告的imageFile
//        override fun getDetails() = "id=$id, title=$title, content=$content, imageFile=$imageFile"
        override fun getDetails() = "${super.getDetails()}, imageFile=$imageFile"
    }

    val i = Item(1, "Hello", "Hello Kotlin!")
    println("id=${i.id}, title=${i.title}, content=${i.content}")

    val i02 = ImageItem(2, "Hi", "Good morning", "Kotlin.jpg")
    println("id=${i02.id}, title=${i02.title}, content=${i02.content}," +
            "imageFile=${i02.imageFile}")

    println(i.getDetails())
    println(i.getReducedContent())

    println(i02.getDetails())
    println(i02.getReducedContent(4))


}