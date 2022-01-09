package jds.effects

import cats.effect.IO
import cats.effect.unsafe.implicits.global
import scala.concurrent.duration._

object HelloWorld {

  val program = for {
    fiber <- IO.println("Hello world!").foreverM.start
    _ <- IO.sleep(2.second)
    _ <- fiber.cancel
  } yield ("Hello world!")
}
