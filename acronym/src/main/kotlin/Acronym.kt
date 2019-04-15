object Acronym {
    fun generate(phrase: String) : String = 
        Regex("\\b\\w")
                .findAll(phrase)
                .joinToString("") {it.value.toUpperCase()}
    }

