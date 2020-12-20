// kotlinc-jvm hello.kt -include-runtime -d app.jar
// java -jar app.jar

//fun main(args:Array<String>) {
fun main() {
    //hello()
    //st()
    //ar(1, "hoge")
    high()
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

fun ar(v1: Int, v2: String): Int {
    println("v1 " + v1)
    println("v2 " + v2)
    return 1
}

fun print(item: Int) {
    println(item)
}

fun high() {
    var ary = arrayOf(1,2,3,4)
    ary.forEach(::print)
    ary.forEach({num:Int -> println(num)})
}
