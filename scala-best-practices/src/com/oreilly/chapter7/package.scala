package com.oreilly.chapter7

package object chapter7 {
  /*trait Foo

  case class Foo1Impl(bar : String) extends Foo

  case class Foo2Impl(bar : Int) extends Foo

  case class Foo3Impl(bar : Long) extends Foo*/

  type StringedFoo = Foo[String]
  type LongFoo = Foo[Long]
}
