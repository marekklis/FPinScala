package chapter3

import chapter3.Tree.size
import org.scalatest.FunSpec

class TreeTest extends FunSpec {

  describe("size") {
    it("should be 7") {
      assert(size(Branch(Branch(Leaf("a"), Leaf("b")), Branch(Leaf("c"), Leaf("d")))) == 7)
    }
  }

}
