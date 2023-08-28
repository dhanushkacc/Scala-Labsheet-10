def calculateAverage(temp: List[Int]): Double = {
  val averageF = temp
    .map(celsius => (celsius * 9 / 5) + 32)
    .reduce((totalTemp, currentTemp) => totalTemp + currentTemp) / temp.length
  averageF
}

object Q1 extends App {
  val tempInCelcius = List(10, 10)
  val averageF = calculateAverage(tempInCelcius)
  println(s"Average Fahrenheit temperature is $averageF")
}
