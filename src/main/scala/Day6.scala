object Day6 {
//  had some issues with finding the proper way to slice the string , ending up being sliding.
// We use .toSet to remove duplicates, so if the set size = index count then we have the final character we are looking for
//Then we add the value of the size onto the index to give us the last characters index 
  def index(s: String, i: Int)= s.sliding(i).indexWhere(_.toSet.size == i) + i

  def main(args: Array[String]): Unit =
    val data = io.Source.fromFile("src/input/day6.txt").mkString
    println(index(data,4))
    println(index(data,14))
}


