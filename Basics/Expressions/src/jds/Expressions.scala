package jds

/**
 *  Created by J. Daniel Sobrado
 *
 *  Example of expressions
 *
 *  Instructions are executed in sequence in imperative languages
 *  Expressions are executed as needed in functional languages
 */
object Expressions extends App {

  // Define a simple value
  val itIsFalse = false

  // Define a simple expression
  val itIsStringFalse = if (itIsFalse) "True" else "False"

  // Example of code block expression
  val expression = {
    if (itIsFalse) "True"
      "False"
  }

  // Is it True or False?
  println("Simple expression: "+itIsStringFalse)
  println("Code Block expression: "+expression)

}
