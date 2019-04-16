import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(date: LocalDateTime) {
    constructor(initialDate: LocalDate) : this(initialDate.atStartOfDay())

    val date = date.plusSeconds(1e9.toLong())
}
