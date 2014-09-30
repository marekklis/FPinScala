package chapter3

import chapter3.List.tail
import org.scalatest.FlatSpec

class ListTest extends FlatSpec {

  "tail of Nil" should "rise error" in {
    intercept[RuntimeException] {
      tail(Nil)
    }
  }

  "tail of (1)" should "be Nil" in {
    assert(tail(List(1)) == Nil)
  }

  "tail of (1,2,3)" should "be (2,3)" in {
    assert(tail(List(1, 2, 3)) == List(2, 3))
  }

}
