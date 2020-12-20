// kotlinc-jvm hello.kt -include-runtime -d app.jar
// java -jar app.jar

//fun main(args:Array<String>) {
fun main() {
    hello()
    st()
}

fun hello() {
    println("hoge")
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

    val st: String = a.toString()
    println("hoge " + st)
}
