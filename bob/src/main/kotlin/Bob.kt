object Bob {
    fun hey(prompt: String) : String =
        when {
            prompt.isQuestion() and prompt.isYelling() -> "Calm down, I know what I'm doing!"
            prompt.isQuestion() -> "Sure."
            prompt.isYelling() -> "Whoa, chill out!"
            prompt.isSilence() -> "Fine. Be that way!"
            else -> "Whatever."
        }

        private fun String.isQuestion(): Boolean = trim(' ').endsWith("?")
        private fun String.isSilence(): Boolean = isBlank()
        private fun String.isYelling(): Boolean = !letters().isSilence() and letters().isUpperCase() 
        private fun String.isUpperCase(): Boolean = all(Char::isUpperCase)
        private fun String.letters(): String = filter(Char::isLetter)
    }

