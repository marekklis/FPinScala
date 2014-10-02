package chapter4

import org.scalatest.FunSpec

class OptionTest extends FunSpec {

  describe("map") {
    it("should return Some(4)") {
      assert(Some(2).map(_ * 2) == Some(4))
    }
    it("should return None()") {
      assert(None.map((a: Int) => a * 2) == None)
    }
  }

}
