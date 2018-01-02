
fun main(args: Array<String>) {
    // 宣告與呼叫函式
    val fun_format: String = """
        # fun 函式名稱(參數名稱:參數型態, ...): 回傳值型態 {
        #   ...
        #   return ...
        #""".trimMargin("#")
    println(fun_format)

    fun hello() :Unit {
        println("Hello Kotlin!")
    }

    fun hello01() { //無回傳值 Unit可省略
        println("Hello Kotlin!")
    }

    fun getGreeting(): String {
        return "Hello Kotlin!"
    }

    hello()
    println()
    hello01()
    println()

    val greet = getGreeting()
    println(greet)

    // 單一運算式函式 (Single-Expression functions)
    val fun_format2: String = """
        # 單一運算式函式 (Single-Expression functions)
        # fun 函式名稱(參數名稱: 參數型態=預設值, ...): 回傳值型態 = 運算式
        #""".trimMargin("#")
    println(fun_format2)

    fun getHello01(): String = "Hello! Kotlin!"
    // 回傳值型態可省略
    fun getHello02() = "Hello! Kotlin!"

    println(getHello01())
    println(getHello02())

    // 參數(Parameters)
    fun sayHello(name: String) {
        println("Hello $name")
    }

    fun person01(name: String, age: Int, married: Boolean) {
        println("Nmae: $name, Age: $age, Married: ${if (married) "Yes" else "No"}")
    }

    sayHello("Peter")
    person01("Peter", 47, false)

    // 函式多載
    fun max(x:Int, y:Int) = if (x > y) x else y
    fun max(x: Double, y: Double) = if (x > y) x else y

    println("max(3, 5) = ${max(3, 5)}")
    println("max(3.2, 5.8) = ${max(3.2, 5.8)}")
    println()

    // 參數預設值
    fun person02(name: String, age: Int = 0, married: Boolean = false) {
        println("Name: $name, Age: $age, Married: ${if (married) "Yes" else "No"}")
    }

    person02("Mary")
    person02("Peter", 3)
    person02("Chili", 35, true)

    // 變動個數參數
    // vararg 參數名稱:參數型態
    // 使用vararg設定參數可以接收零到多個值
    // 參數的資料型態為陣列
    // 一個函式只能有一個vararg的參數
    // 如果除了vararg參數外還有其它參數，vararg參數必須宣告在所有參數的最後一個
    fun average(message: String, vararg ns: Int) {
        var total = 0

        for (n in ns) {
            total += n
        }

        val result =  total / ns.size

        println("$message: $result")
    }

    average("1+2+3的平均", 1, 2, 3)
    average("1~6的平均值", 1, 2, 3, 4, 5, 6)

}