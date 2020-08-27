fun main() {
    val nilai = 1.rangeTo(32) step 4
    nilai.forEachIndexed{ index, value ->
        println("value $value with index $index")
    }
}