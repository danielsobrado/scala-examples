package jds.effects

import cats.effect.IOApp
import cats.effect.IO

object Main extends IOApp.Simple {

  def run: IO[Unit] =
    HelloWorld.say().flatMap(IO.println)
}
