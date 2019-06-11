class Anagram(private val word: String) {

    fun match(possibleAnagrams: List<String>): List<String> =
        possibleAnagrams
                .filter { it.length == word.length }
                .filter { isAnagram(it.toLowerCase(), word.toLowerCase()) }

    fun isAnagram(string_a: String, string_b: String) = string_a.groupingBy { it }.eachCount() == string_b.groupingBy { it }.eachCount()
}

