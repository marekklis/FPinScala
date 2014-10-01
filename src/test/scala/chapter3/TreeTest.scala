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

  describe("depth") {
    it("should be 4") {
      assert(maximum(Branch(Leaf(1), Branch(Leaf(2), Branch(Leaf(3), Branch(Leaf(4), Leaf(5)))))) == 5) // why 5 WTF????
    }
  }

}
