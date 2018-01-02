
fun main(args: Array<String>) {
    // 宣告應用程式需要的類別
    // 宣告：
    // class 類別名稱 constructor(val|var 屬性名稱: 屬性型態, ...)
    // 使用：
    // val|var 變數名稱: 類別名稱 = 類別名稱(參數, ...)

    // 設定預設值
    class Item01 constructor(val id: Long = 0,
                             var title: String = "",
                             var content: String = "") {
        fun getDetails() = "Item01(id=$id, title=$title, content=$content)";
    }

    val item01 = Item01(1, "Hello", "Hello Kotlin!")
    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")

    val item02 = Item01(201)
    println(item02.getDetails())
    val item03 = Item01(202, "Hi")
    println(item03.getDetails())
    val item04 = Item01(203, "Test", "Test Info")
    println(item04.getDetails())

    // 使用初始化區塊
    // 主要建構式constructor關鍵字可以省略
    class Item02 (val id: Long = 0,
                  var title: String = "",
                  var content: String = "") {
        // 初始化，可以在此處檢查與處理屬性值
        init {
            title = if (title.isEmpty()) "Tile required" else title
            content = if (content.isEmpty()) "Content required" else content
        }

        fun getDetails() = "Item02(id=$id, title=$title, content=$content)";
    }

    val item0201 = Item02(101, "Hi", "Hello")
    println(item0201.getDetails())
    val item0202 = Item02(102)
    println(item0202.getDetails())

    // 物件陣列
    val items = arrayOf(
            Item02(2001),
            Item02(2002),
            Item02(2003)
    )

    // 其他建構式
    // 時機：建立物件時，執行一些額外的工作
    // 次要建構式的宣告後面，一定要使用this(...)呼叫主要建構式
    // constructor(參數名稱: 參數型態, ...): this(...) {...}
    class Item03 (val id: Long,
                  var title: String,
                  var content: String) {
        // 宣告次要建構式
        // 使用this呼叫主要建構式
        constructor(id: Long): this(id, "", "")

        fun getDetails() = "Item02(id=$id, title=$title, content=$content)";
    }

    val item0301 = Item03(301, "Hello", "Hello Kotlin!")
    println(item0301.getDetails())
    val item0302 = Item03(302)
    println(item0302.getDetails())

    // 宣告屬性與自定存取函式
    class Item04 (val _id: Long,
                  var _title: String,
                  var _content: String) {
        val id = _id
        var title = _title
        var content = _content

        fun getDetails() = "Item02(id=$id, title=$title, content=$content)";
    }

    // 實務上不必如此，Kotlin會自己為屬性加入預設的setter和getter函式，
    // 即使用物件屬性值的時候，會自動轉換為呼叫setter與getter
    class Item(var id: Int)

    val item = Item(100)
    item.id = 101 // 呼叫 setId
    println(item.id) // 呼叫 getId

    // 自定setter與getter函式
    // set, get, field
    class Item05 (val id: Long,
                  var _title: String,
                  var _content: String = "") {

        var title = _title
            set(value: String) {
                if (value.isNotEmpty()) {
                    field = value
                }
            }
        var content = _content
            get() {
                return if (field.isEmpty()) "Empty" else field
            }

        fun getDetails() = "Item02(id=$id, title=$title, content=$content)";
    }

    val item05 = Item05(5, "Nice day")
    println(item05.getDetails())

    item05.title = ""
    println("title=${item05.title}")
    item05.content = "Have a nice day"
    println("content=${item05.content}")
    item05.content=""
    println("content=${item05.content}")


}