package chapter5

import org.scalatest.FunSpec

class StreamTest extends FunSpec {

  describe("toList") {
    it("should return List(1,2,3,4) - recursive") {
      assert(Stream(1, 2, 3, 4).toListRecursive == List(1, 2, 3, 4))
    }

    it("should return List(1,2,3,4)") {
      assert(Stream(1, 2, 3, 4).toList == List(1, 2, 3, 4))
    }
  }

}
