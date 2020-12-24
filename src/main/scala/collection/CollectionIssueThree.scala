package collection

/**
 * Считать из файла hdata_stock.csv данные в буфер
 * Преобразовать считанные данные в Tuple5
 * Вывести построчно в консоль считанные полученный результат
 */

object CollectionIssueThree {

  def main(args: Array[String]): Unit = {

//    val bufferedSource = io.Source.fromFile("../hdata_stock.csv")
    val bufferedSource = io.Source.fromFile("hdata_stock.csv")
//    val bufferedSource = io.Source.fromFile("C:/javaProjects/wardenka-scala-example-for-school-one-14d72ce26104/hdata_stock.csv")

    val list_prices = bufferedSource.getLines().map(_.split(";").map(_.trim)).collect( _ match {
      case Array(a, b, c, d, e) => (a, b, c, d, e)
    })

    list_prices.foreach(y => {
      println(y)
    })

    bufferedSource.close

  }
}
