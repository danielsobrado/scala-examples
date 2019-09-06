package jds.basics

import jds.basics.MultipleInheritance.Employee

/**
 *  Created by J. Daniel Sobrado
 *
 *  Anonymous Classes
 */
object AnonymousClasses extends App {

  trait Buyer {
    def buysFrom(v: Employee): Unit
  }

  // Create an Anonymous Class
  val buyer = new Buyer {
    override def buysFrom(v: Employee): Unit = println("Anonymous buyer...")
  }

  buyer buysFrom new Employee
}
