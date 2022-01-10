package com.jds.cats.typeClasses

object Main extends App {
  val intSum = TypeClasses.sumList(List(1, 2, 3))
  println("Result: "+intSum)

  val stringSum = TypeClasses.sumList(List("1", "2", "3"))
  println("Result: "+stringSum)

  // Compile time error
  // val boolSum = TypeClasses.sumList(List(true, false, true))
  // println("Result: "+boolSum)

}