package com.oreilly.chapter7

import com.oreilly.chapter7.chapter7.{LongFoo, StringedFoo}

trait Foo[A]{
  def bar: A
}

case class Foo1Impl(bar : String) extends StringedFoo

case class Foo2Impl(bar : Int) extends Foo[Int]

case class Foo3Impl(bar : Long) extends LongFoo
