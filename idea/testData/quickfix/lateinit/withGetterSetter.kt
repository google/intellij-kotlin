// "Remove getter and setter from property" "true"

class A {
    <caret>lateinit var str: String
        get() = ""
        set(value) {}
}
/* IGNORE_FIR */