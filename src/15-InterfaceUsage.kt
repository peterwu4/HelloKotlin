

interface Greeting01 {
    fun greet(name: String): String
}

class Greeting01Imp1 : Greeting01 {
    override fun greet(name: String): String {
        return "Hello! $name"
    }
}

// 宣告一個接收Greeting01物件參數的函式
fun sayHello(greeting: Greeting01) {
    println(greeting.greet("Peter"))
}

fun main(args: Array<String>)
{
    val greeting01 = Greeting01Imp1()
    println("greeting01 : ")
    sayHello(greeting01)


    val greeting02 = Greeting02Impl()
    println("greeting02 : ")
    println("${greeting02.name}, ${greeting02.upperName}")
    greeting02.displayName()
    greeting02.displayGreeting()
    sayHello02(greeting02)
}

interface Greeting02 {
    // 抽象屬性變數
    val name : String
    // 一般屬性變數
    val upperName : String
        get() = name.toUpperCase()
    // 抽象函式
    fun message() : String
    // 一般函式
    fun displayName() {
        println("Name: $name")
    }
    // 一般函式
    fun displayGreeting() {
        println("Hello, $upperName")
    }
}

class Greeting02Impl : Greeting02 {
    override val name = "Simon"
    override fun message(): String {
        return "Hello! $name"
    }
}

fun sayHello02(greeting02: Greeting02) {
    println(greeting02.message())
}