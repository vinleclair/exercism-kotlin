object Isogram {
    fun isIsogram(str: String) = str.toLowerCase()
                .filter(Char::isLetter)
                .let { it.toSet().size == it.length }
            }
