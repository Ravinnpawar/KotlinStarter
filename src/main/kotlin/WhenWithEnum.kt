fun main(){
    doOnDay(Day.Monday)
}
enum class Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

fun doOnDay(day: Day) {
    when(day) {
        Day.Sunday ->  print("SUN")
        Day.Monday ->print("MON")
        Day.Tuesday ->     print("TUE")
        Day.Wednesday ->  print("WED")
        Day.Thursday ->   print("Thu")
        Day.Friday ->     print("Fri")
        Day.Saturday ->   print("Sat")
    }
}