package com.jds.cats.typeClasses

object TypeClasses {

  trait Summable[A] {
    def sum(list: List[A]): A
  }

  implicit object IntSummable extends Summable[Int] {
    override def sum(list: List[Int]): Int = list.sum
  }
  
  implicit object StringSummable extends Summable[String] {
    override def sum(list: List[String]): String = list.mkString
  }
  
  def sumList[A](list: List[A])(implicit summable: Summable[A]): A = {
    summable.sum(list)
  }

}