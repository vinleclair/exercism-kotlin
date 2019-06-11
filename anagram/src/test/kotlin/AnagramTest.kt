import org.junit.Test
import org.junit.Ignore
import kotlin.test.assertEquals

class AnagramTest {

    @Test
    fun noMatches() {
        val detector = Anagram("diaper")
        assertEquals(listOf(), detector.match(listOf("hello", "world", "zombies", "pants")))
    }

    @Test
    fun detectsTwoAnagrams() {
        val detector = Anagram("master")
        val anagrams = detector.match(listOf("stream", "pigeon", "maters"))
        assertEquals(listOf("stream", "maters"), anagrams)
    }

    @Test
    fun doesNotDetectAnagramSubsets() {
        val detector = Anagram("good")
        assertEquals(listOf(), detector.match(listOf("dog", "goody")))
    }

    @Test
    fun detectsAnagram() {
        val detector = Anagram("listen")
        val anagrams = detector.match(listOf("enlists", "google", "inlets", "banana"))
        assertEquals(listOf("inlets"), anagrams)
    }

    @Test
    fun detectsThreeAnagrams() {
        val detector = Anagram("allergy")
        val anagrams = detector.match(listOf("gallery", "ballerina", "regally", "clergy", "largely", "leading"))
        assertEquals(listOf("gallery", "regally", "largely"), anagrams)
    }

    @Test
    fun doesNotDetectNonAnagramsWithIdenticalChecksums() {
        val detector = Anagram("mass")
        assertEquals(listOf(), detector.match(listOf("last")))
    }

    @Test
    fun detectsAnagramsCaseInsensitively() {
        val detector = Anagram("Orchestra")
        val anagrams = detector.match(listOf("cashregister", "Carthorse", "radishes"))
        assertEquals(listOf("Carthorse"), anagrams)
    }

    @Test
    fun detectsAnagramsUsingCaseInsensitiveSubject() {
        val detector = Anagram("Orchestra")
        val anagrams = detector.match(listOf("cashregister", "carthorse", "radishes"))
        assertEquals(listOf("carthorse"), anagrams)
    }

    @Test
    fun detectsAnagramsUsingCaseInsensitiveCandidates() {
        val detector = Anagram("orchestra")
        val anagrams = detector.match(listOf("cashregister", "Carthorse", "radishes"))
        assertEquals(listOf("Carthorse"), anagrams)
    }

    @Test
    fun doesNotDetectAnAnagramIfTheOriginalWordIsRepeated() {
        val detector = Anagram("go")
        val anagrams = detector.match(listOf("go Go GO"))
        assertEquals(listOf(), anagrams)
    }

    @Test
    fun anagramsMustUseAllLettersExactlyOnce() {
        val detector = Anagram("tapper")
        val anagrams = detector.match(listOf("patter"))
        assertEquals(listOf(), anagrams)
    }

    @Test
    fun doesNotDetectIdenticalUppercasedWordAsAnagram() {
        val detector = Anagram("BANANA")
        val anagrams = detector.match(listOf("Banana"))
        assertEquals(listOf("Banana"), anagrams)
    }
}
