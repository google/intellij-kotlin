// "Replace with dot call" "true"
fun foo(a: Any) {
    a<caret>?.equals(0)
}

/* IGNORE_FIR */