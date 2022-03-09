class LazyProperty(val initializer: () -> Int) {
    var isFirstCall = true
    var value: Int? = null
    val lazy: Int
        get() {
            if (isFirstCall) {
                isFirstCall = !isFirstCall
                value = initializer()
            }
            return value!!
        }
}
