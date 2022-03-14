package org.jds.options

object Hello extends Greeting with App {
  println("-"*100)
  
  val option1 = Some("Hello");
  val option2 = Some("World");
  val option3 = 
    for {
      a <- option1.map(_.toUpperCase)
      b <- option2.map(_.toUpperCase)
    } yield s"$a $b"

  println(option3)

  println("-"*100)
}

trait Greeting {
  lazy val greeting: String = "Hello world!"
}
