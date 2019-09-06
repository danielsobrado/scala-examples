package jds.basics

/**
 *  Created by J. Daniel Sobrado
 *
 *  Tail Recursion: (See factTail)
 *  The compiler can  optimize this call into a while loop which eliminates the need for a stack to store the current state.
 */
object TailRecursion extends App {

  // Factorial Non Recursive
  def factNonRecursive(n: BigInt): BigInt = {
    var i: BigInt = n
    var result: BigInt = 1
    while (i > 1) {
      result = result * i
      i -= 1
    }
    result
  }

  // Factorial Recursive
  def fact(i: BigInt): BigInt = {
    if (i <= 1)
      1
    else
      i * fact(i - 1)  // Not tail-recursive
  }

  // You can add an annotation to ensure that your method is tail recursive
  @scala.annotation.tailrec
  def factTail(n: BigInt): BigInt = {
    def go(acc: BigInt, n: BigInt): BigInt = {
      if (n <= 1)
        acc
      else
        go(acc * n, n - 1)
    }
    go(1, n)
  }
  // The foldLeft and product methods are tail-recursion optimized already
  def factFold(i: BigInt): BigInt = (BigInt(1) to i).foldLeft(BigInt(1))(_ * _)
  def factProduct(i: BigInt): BigInt = (BigInt(1) to i).product
}
