class Squares(val num: Int) {
    fun squareOfSum() = (0..num).sum().pow()

    fun sumOfSquares() = (0..num).sumBy { it.pow() } 
    
    fun difference() = squareOfSum() - sumOfSquares() 

    private fun Int.pow() = this * this
}
