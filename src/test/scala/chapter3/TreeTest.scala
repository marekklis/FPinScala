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
      assert(depth(Branch(Leaf(1), Branch(Leaf(2), Branch(Leaf(3), Branch(Leaf(4), Leaf(5)))))) == 4)
    }
  }

  describe("map") {
    it("should remap") {
      assert(map(Branch(Branch(Leaf(1), Leaf(7)), Branch(Leaf(6), Leaf(5))))(_ * 2) ==
        Branch(Branch(Leaf(2), Leaf(14)), Branch(Leaf(12), Leaf(10))))
    }
  }

  describe("fold") {
    it("should sizeViaFold") {
      assert(sizeViaFold(Branch(Branch(Leaf("a"), Leaf("b")), Branch(Leaf("c"), Leaf("d")))) == 7)
    }
  }

}
