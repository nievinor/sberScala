package collection

object CollectionIssueFour {

  def main(args: Array[String]): Unit = {

    val bufferedSource = io.Source.fromFile("hdata_stock.csv")
    var sumList = Tuple4(0.0, 0.0, 0.0, 0.0)
    var len: Int = 0

    for (line <- bufferedSource.getLines.drop(1)) {
      val row = line.split(";")

      if(row.length == 5) {
        sumList = (sumList._1 + row(1).toDouble, sumList._2 + row(2).toDouble,
          sumList._3 + row(3).toDouble, sumList._4 + row(4).toDouble)
        len = len + 1
      }
    }

    bufferedSource.close

    if(len > 0) {
      println("NASDAQ:GOOG = " + sumList._1 / len)
      println("NASDAQ:MSFT = " + sumList._2 / len)
      println("NASDAQ:AMZN = " + sumList._3 / len)
      println("NASDAQ:AMZN = " + sumList._4 / len)
    }
  }
}
