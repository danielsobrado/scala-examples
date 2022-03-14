package com.jds.scala3.newTypes

@main def hello: Unit = 

  // 1 - literal types
  val aNumber = 2

  val four: 4 = 4 // 4 <: Int

  def myNumber(n: Int) = println(n)
  myNumber(5)
  myNumber(four)

  def myStrictNumber(n: 4) = println(n)
  myStrictNumber(four)
  // myStrictNumber(5) // error at compiler time

  val false: false = false // false <: Boolean

  val me: "Dani" = "Dani" // "Dani" <: String

  // 2 - Union types
  

