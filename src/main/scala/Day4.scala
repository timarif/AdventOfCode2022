object Day4 {


  def main(args: Array[String]): Unit = {
    //I was having issues finding the correct Scala syntax on this , found an awesome function that does all the hard work!
    def parse(line: String): (Int, Int, Int, Int) =
      val Array(a, b, c, d) = line.split("\\D").map(_.toInt)
      (a, b, c, d)

    val file = io.Source.fromFile("src/input/day4.txt").getLines().toSeq

    println(file.map(parse).count((a, b, c, d) => (a >= c && b <= d) || (c >= a && d <= b)))
    println(file.map(parse).count((a, b, c, d) => a <= d && c <= b))

  }
}



