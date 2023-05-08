package collections 

fun listBasic() {
    // immutable list
    val list = listOf("Kotlin", "Java", "C++")
    println(list)
    println(list.size)
    println(list[2])
    println(list.contains("Kotlin"))
    println(list.contains("Python"))
    println(list.indexOf("Java"))
    println(list.isEmpty())
    println(list.isNotEmpty())
}

fun arrayBasic() {
  val array = arrayOf("Kotlin", "Java", "C++")
  println(array)

  val mixed = arrayOf("Kotlin", 1, 2, false)
  val numbers = intArrayOf(1, 2, 3, 4, 5)

  val str = "Kotlin"
  println(str[0])

  val arrayList = arrayListOf("Kotlin", "Java", "C++")
  println(arrayList)
}

fun main() {
    // listBasic()
    arrayBasic()
}