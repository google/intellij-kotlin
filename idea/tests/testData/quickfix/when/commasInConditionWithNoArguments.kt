// "Replace ',' with '||' in when" "true"
fun test(i: Int, j: Int) {
    var b = false
    when {
        i == 0 -> { /* code 1 */ }
        i > 0<caret>, j > 0 -> { /* code 2 */ }
        j == 0 -> { /* code 3 */ }
        i < 0, j < 0, j > i -> { /* code 4 */ }
        else -> { /* other code */ }
    }
}
/* IGNORE_FIR */
