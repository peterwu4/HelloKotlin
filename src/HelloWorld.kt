fun main(args: Array<String>) {
    println("Hello World!")

    val colorCode: Char = 'R'
    var colorName: String

    // when 的各種寫法(用法)
    when (colorCode) {
        'R' -> colorName = "Red"
        'G' -> colorName = "Green"
        'B' -> colorName = "Blue"
        else -> colorName = "undefined"
    }

    when {
        colorCode == 'R' -> colorName = "Red"
        colorCode == 'G' -> colorName = "Green"
        colorCode == 'B' -> colorName = "Bluc"
        else -> colorName = "undefined"
    }

    colorName = when {
        colorCode == 'R' -> "Red"
        colorCode == 'G' -> "Green"
        colorCode == 'B' -> "Bluc"
        else -> "undefined"
    }

    println("colorCode: $colorCode, colorName: $colorName\n")
}
