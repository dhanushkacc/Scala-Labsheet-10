def countLetterOccurrences(list: List[String]): Int = {
  val LengthsOfWords = list.map(word => word.length)
  val WordsCount = LengthsOfWords.reduce((count1, count2) => count1 + count2)
  WordsCount
}

object Q2 extends App {

  val list = List("apple", "banana", "cherry", "date")
  val LettersCount = countLetterOccurrences(list)
  println(s"Total count of letter occurrences: $LettersCount")

}
