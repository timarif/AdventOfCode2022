object Day1 {

  def main(args: Array[String]): Unit = {
    val file = io.Source.fromFile("src/input/day1.txt").getLines()
    // Foldleft - Applying the operation of creating a new list and adding sums of each elf into that list
    val listOfElves = file.foldLeft(List[Int]()){
      //Case statement to check values of list and create empty lists to add each each elf's calories in
      case (x,y) =>
        if (y.isBlank)
          0 +: x
        else
          x match
            case head :: next => (head + y.toInt) :: next
            case Nil => List(y.toInt)
    }
    //Sort descending to get highest value of calories
    val sortElf = listOfElves.sortBy(-_)
    println(sortElf.head)
    println(sortElf.take(3).sum)

  }
}


