fun main() {
    val timeAgo = 888
    println("Был(а) ${timeGo(timeAgo)}")
}
fun timeGo(timeAgo: Int): String {
    val timeInMin = timeAgo / 60
    val timeInHour = timeInMin / 60
    val finishString = when (timeAgo) {
        in 1..60 -> "только что"
        in 61..60 * 60 ->
            printMin(timeAgo)

        in 60 * 60 + 1..24 * 60 * 60 ->
            when (timeInHour) {
                2, 3, 4, 22, 23, 24 -> "в сети $timeInHour часа назад"
                in 6..20 -> "в сети $timeInHour часов назад"
                else -> "в сети $timeInHour час назад"
            }

        in 24 * 60 * 60 + 1..48 * 60 * 60 -> "в сети вчера"
        in 48 * 60 * 60 + 1..72 * 60 * 60 -> "в сети позавчера"
        else -> "в сети давно"
    }
    return finishString
}

fun printMin(timeAgo: Int): String {
    val timeInMin = timeAgo / 60
    val stringMin = when (timeInMin) {
        1, 21, 31, 41, 51 -> "минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "$timeInMin минуты назад"
        else -> "$timeInMin минут назад"
    }
    return stringMin
}