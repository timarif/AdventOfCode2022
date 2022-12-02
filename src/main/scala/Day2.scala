object Day2 {

  def main(args: Array[String]): Unit = {
    val file = io.Source.fromFile("src/input/day2.txt").getLines().toSeq
    //split files on " " and create an array of the Rock,Paper, Scissor Values
    val splits = file.map{line => val Array(x,y) =line.split(" ")
      (x,y)}
    //Apply case statements to the List of Array's
      val counts = splits.map
      {
        case ("A","X") => 3 + 1
        case ("A","Y") =>  6 + 2
        case ("A","Z") => 0 + 3
        case ("B", "X") => 0 + 1
        case ("B", "Y") => 3 + 2
        case ("B", "Z") => 6 + 3
        case ("C", "X") => 6 + 1
        case ("C", "Y" )=> 0 + 2
        case ("C", "Z") => 3 + 3

      }.sum
      val counts2 = splits.map
      {
        case ("A", "X") => 0 + 3
        case ("A", "Y") => 3 + 1
        case ("A", "Z") => 6 + 2
        case ("B", "X") => 0 + 1
        case ("B", "Y") => 3 + 2
        case ("B", "Z") => 6 + 3
        case ("C", "X") => 0 + 2
        case ("C", "Y") => 3 + 3
        case ("C", "Z") => 6 + 1

      }.sum
    println(counts)
    println(counts2)

  }
}