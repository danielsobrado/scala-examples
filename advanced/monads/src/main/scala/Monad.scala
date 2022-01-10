package com.jds.advanced.monads;

object Monad {
  
  case class SafeValue[+T](private val internalValue: T) {
    def get: T = synchronized {
      internalValue
    }

    def transform[S]()
  }

  def gimmeSafeValue[T](value: T): SafeValue[T] = {
    SafeValue(value)
  }

  val safeString = gimmeSafeValue("Hello")

  // extract
  val string = safeString.get

  // transform
  val upperString = string.toUpperCase

  // re-wrap
  val safeUpperString = SafeValue(upperString)
  
}