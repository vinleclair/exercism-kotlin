object ScrabbleScore { 

    fun scoreWord(word: String) = word.toUpperCase().sumBy {
        when (it) {
            'Q', 'Z' ->  10
            'J', 'X' -> 8
            'K' -> 5
            'F', 'H', 'V', 'W', 'Y' -> 4
            'B', 'C', 'M', 'P' -> 3
            'D', 'G' -> 2
            else -> 1 
        }
    }
}
