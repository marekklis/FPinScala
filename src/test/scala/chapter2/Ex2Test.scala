package chapter2

import chapter2.Ex2._
import org.scalatest.FlatSpec

class Ex2Test extends FlatSpec {

  def orderedInt(p: Int, q: Int) = p <= q

  "(1,2,3)" should "be sorted" in {
    assert(isSorted(Array(1, 2, 3), orderedInt))
  }

  "(1,4,3)" should "be not sorted" in {
    assert(!isSorted(Array(1, 4, 3), orderedInt))
  }

}
