package collection

object CollectionIssueTwo {

  /**
   * Создать функцию, принимающую два числа,
   * которая выполняет сложение пары числе
   * из положительного диапазона, сумма которых равна
   * количеству элементов диапазона
   * в результате в консоль нужно вывести - (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
   * Используется конструкция for-yield
   * */

  def main(args: Array[String]): Unit = {
    foo(10, 10) foreach {
      case (i, j) =>
        println(s"($i, $j) ")
    }
  }

  def foo(n: Int, v: Int) = {
    for (i <- 0 until n;
         j <- 0 until n if i + j == v)
      yield(i, j)
  }

  def foo1(n: Int, v: Int): IndexedSeq[(Int, Int)] = {
    (Predef.intWrapper(0).until(n))
      .flatMap((i: Int) =>
        (Predef.intWrapper(i).until(n))
      .withFilter((j: Int) => i.+(j).==(v))
      .map((j: Int) => Tuple2.apply(i, j))
      )

  }




}
