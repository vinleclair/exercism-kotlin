object Pangram {
    fun isPangram(str: String) = ('a'..'z').all { str.contains(it, ignoreCase = true)}
}
