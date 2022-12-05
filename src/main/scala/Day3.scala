import scala.collection.mutable.ListBuffer

object Day3 {

  def main(args: Array[String]): Unit = {
    val file = io.Source.fromFile("src/input/day3.txt").getLines().toSeq

    def part1(a:Seq[String]) : Int = {

      val splits = a.foldLeft(List[Int]()) {
        (emp, line) =>
          val count = line.toCharArray.length
          val splitcount = line.splitAt(count / 2).toList
            .reduce((a, b) => a intersect b).head
          val splitsum = if splitcount.isLower
          then splitcount - 'a' + 1
          else splitcount - 'A' + 27

          emp match
            case next => splitsum :: next
            case Nil => List(0)

      }
      splits.sum
    }

    def part2(b:Seq[String]) : Int = {
      b.grouped(3).toSeq
      .map(_.reduce((a, b) => a intersect b).head)
      .map(x => if x.isLower
      then x - 'a' + 1
      else x - 'A' + 27)
      .sum

  }


      println(part1(file))
      println(part2(file))


  }


}