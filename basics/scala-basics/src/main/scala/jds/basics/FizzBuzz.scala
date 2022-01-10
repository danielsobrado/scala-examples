package jds.basics

/**
 *  Created by J. Daniel Sobrado
 *
 *  Simple FizzBuzz!
 */

object FizzBuzz extends App {
  for (i <- Range.inclusive(1,100)) {
    println(
      if (i % 3 == 0 & i % 5 == 0) i+": FizzBuzz"
      else if (i % 3 == 0) i+": Fizz"
      else if (i % 5 == 0) i+": Buzz"
    )
  }
  
}
