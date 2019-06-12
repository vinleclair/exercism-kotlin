class Series(val digits: String) {
    
    init {
        require(digits.all { it.isDigit() })
    }

    fun getLargestProduct(substringLength: Int) : Int {
        require(substringLength <= digits.length) {"Substring cannot be longer than string."}
        return if (substringLength == 0 || digits.isEmpty()) 1 else maxProduct(substringLength)
    }
    
    private fun maxProduct(substringLength: Int) =
        digits.windowed(substringLength) {
            it.fold(1, { acc, value -> acc * (value - '0') })
        }.max() ?: 0
}

