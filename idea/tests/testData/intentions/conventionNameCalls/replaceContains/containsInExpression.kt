// IGNORE_FE10_BINDING_BY_FIR
fun <T> doSomething(a: T) {}

fun test() {
    class Test{
        operator fun contains(a: Int) : Boolean = true
    }
    val test = Test()
    doSomething(test.c<caret>ontains(0).toString())
}
