fun main() {
    val color: Color = Color.YELLOW

    when(color){
        Color.YELLOW -> print("Color is Yellow")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    YELLOW(0xFAFF0E),
    BLUE(0x0000FF),
    GREEN(0x00FF00)
}