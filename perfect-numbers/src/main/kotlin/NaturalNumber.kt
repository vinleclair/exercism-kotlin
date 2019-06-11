
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if (naturalNumber <= 0) throw RuntimeException("$naturalNumber is not a natural number.")

    val aliquotSum = getFactors(naturalNumber).sum()

    if (aliquotSum > naturalNumber) return Classification.ABUNDANT

    if (aliquotSum < naturalNumber) return Classification.DEFICIENT

    return Classification.PERFECT
}

fun getFactors(number: Int): MutableList<Int> {
    var factors = mutableListOf<Int>()

    for (num in 1..(number - 1)) {
        if (number % num == 0) {
            factors.add(num)
        }
    }

    return factors
}

