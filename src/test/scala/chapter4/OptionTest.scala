package chapter4

import chapter4.Option.{map2, sequence}
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

  describe("map2") {
    it("should return None if first is None") {
      assert(map2(None, Some(2))((a: Int, b: Int) => a + b) == None)
    }
    it("should return None if second is None") {
      assert(map2(Some(2), None)(_ + _) == None)
    }
    it("should return 5") {
      assert(map2(Some(2), Some(3))(_ + _) == Some(5))
    }
  }

  describe("sequence") {

    it("should return None if None element exists on list") {
      assert(sequence(List(Some(1), None, Some(3))) == None)
    }

    it("should return Some((1,2,3))") {
      assert(sequence(List(Some(1), Some(2), Some(3))) == Some(List(1, 2, 3)))
    }
  }

}
