package collection

import scala.util.Random

/**
 * Заполнить массив заданной длины произвольными положительными числами.
 * Провести анализ списка и найти все числа, которые делятся на два, делятся на три и делятся и на два, и на три.
 * При срабатывании условия выводить соответствующую запись в консоль.
 * Фильтрацию сделать двумя способами:
 * 1) паттерн-матчинг
 * 2) filter
 * */

object CollectionIssueOne{

  def main(args: Array[String]): Unit = {
    Seq.fill(100)(Random.nextInt(100)).map(matchTest).foreach(_ match {
      case Some(y) => println(y)
      case None => None
    })
  }

  def matchTest(x: Int): Option[String] = x match {
    case x if x % 6 == 0 => Some(x + " Число делится на два и на три")
    case x if x % 2 == 0 => Some(x + " Число делится на два")
    case x if x % 3 == 0 => Some(x + " Число делится на три")
    case _ => None

  }

  def rands(n: Int): IndexedSeq[Int] = {
    val r = new Random()
    1 to n map (_ => r.nextInt(100))
  }
}
