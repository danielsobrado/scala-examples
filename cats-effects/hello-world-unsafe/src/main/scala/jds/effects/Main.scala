package jds.effects

import cats.effect.unsafe.implicits.global

object Main extends App {

    HelloWorld.program.unsafeRunSync()
    
}
