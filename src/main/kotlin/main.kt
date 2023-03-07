fun main() {
    val timeAgo = 660
    println("Был(а) ${agoToText(timeAgo)}")
}

fun agoToText(timeAgo: Int): String {
    val finishString = when (timeAgo) {
        in 1..60 -> "только что"
        in 61..60 * 60 ->
            printMin(timeAgo)

        in 60 * 60 + 1..24 * 60 * 60 ->
            "в сети ${printHour(timeAgo)}"

        in 24 * 60 * 60 + 1..48 * 60 * 60 -> "в сети вчера"
        in 48 * 60 * 60 + 1..72 * 60 * 60 -> "в сети позавчера"
        else -> "в сети давно"
    }
    return finishString
}

fun printMin(timeAgo: Int) = when (val timeInMin = timeAgo / 60) {
    1, 21, 31, 41, 51 -> "минуту назад"
    2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "$timeInMin минуты назад"
    else -> "$timeInMin минут назад"
}

fun printHour(timeAgo: Int) = when (val timeInHour = timeAgo / 3600) {
    2, 3, 4, 22, 23, 24 -> " $timeInHour часа назад"
    in 6..20 -> " $timeInHour часов назад"
    else -> "$timeInHour час назад"
}
