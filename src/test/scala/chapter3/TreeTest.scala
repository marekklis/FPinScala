package chapter3

import chapter3.Tree._
import org.scalatest.FunSpec

class TreeTest extends FunSpec {

  describe("size") {
    it("should be 7") {
      assert(size(Branch(Branch(Leaf("a"), Leaf("b")), Branch(Leaf("c"), Leaf("d")))) == 7)
    }
  }

  describe("maximum") {
    it("should be 7") {
      assert(maximum(Branch(Branch(Leaf(1), Leaf(7)), Branch(Leaf(6), Leaf(5)))) == 7)
    }
  }

}
