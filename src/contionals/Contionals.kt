package conditionals

fun main() {
  // whenBasic()
  whenAdvanced()
}

fun whenBasic() {
    val mode = 9
    when(mode) {
        1 -> println("The mode is lazy")
        2 -> println("The mode is 2")
        else -> println("I don't know that mode")
    }
}

fun whenAdvanced() {
  val x = 10 
  when(x) {
    5 -> println("x is 5")
    3 * 12 -> println("x is 3 * 12")
    "Hey there".length -> println("x is the length of the string 'Hey there'")
    in 1..10 -> println("x is between 1 and 10")
    !in 1..9 -> println("x is not between 1 and 9")
  }
}