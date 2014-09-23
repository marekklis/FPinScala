package chapter2

import chapter2.Ex1._
import org.scalatest.FlatSpec

class Ex1Test extends FlatSpec {

  "0th element" should "be 0" in {
    assert(fib(0) == 0)
  }

  "1th element" should "be 1" in {
    assert(fib(1) == 1)
  }

  "7th element" should "be 13" in {
    assert(fib(7) == 13)
  }

  "12th element" should "be 144" in {
    assert(fib(12) == 144)
  }

}
