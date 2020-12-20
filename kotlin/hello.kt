// kotlinc-jvm hello.kt -include-runtime -d app.jar
// java -jar app.jar 

fun hello() {
    println("hoge")
//fun main(args:Array<String>) {
fun main() {
    hello()
}

fun st() {
    var s: String = "hoge"
    val t: String = "huga"

    println(s)
    println(t)

    var a: Int = 10
    val b: Boolean = true

    println(a)
    println(b)
}
