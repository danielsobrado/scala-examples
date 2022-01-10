package jds.basics

/**
 *  Created by J. Daniel Sobrado
 *
 *  Example of Multiple Inheritance
 *
 *  By using traits
 */
object MultipleInheritance extends App {

  // Define a simple class
  class Person

  trait Buyer {
    def buysFrom(v: Employee): Unit
  }

  trait Seller {
    def sellsTo(v: Person): Unit
  }

  // Define a subclass
  class Employee extends Person with Buyer with Seller {
    override def buysFrom(p: Employee): Unit = println("Buying...")
    override def sellsTo(p: Person): Unit = println("Selling...")
  }

  // Define a subclass
  class Customer extends Person with Buyer {
    override def buysFrom(p: Employee): Unit = println("Buying...")
  }

  val employee = new Employee

  val customer = new Customer

  customer.buysFrom(employee)
  customer buysFrom employee  // Same as before but closer to natural language

  employee buysFrom employee
  employee sellsTo employee
  employee sellsTo customer
  customer buysFrom employee

}
