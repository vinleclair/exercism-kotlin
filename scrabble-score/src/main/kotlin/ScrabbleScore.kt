object ScrabbleScore { 

    fun scoreWord(word: String) : Int {
        val letterValues = mapOf("AEIOULNRST" to 1,
                                "DG" to 2,
                                "BCMP" to 3,
                                "FHVWY" to 4,
                                "K" to 5,
                                "JX" to 8,
                                "QZ" to 10)
        var score = 0
        for (letter in word.toUpperCase()) {
            for ((letters, value) in letterValues){
                if (letters.contains(letter))
                        score += value 
                    }
        }
        return score 

    }

}
