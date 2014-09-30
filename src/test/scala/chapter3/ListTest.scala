package chapter3

import chapter3.List._
import org.scalatest.FunSpec

class ListTest extends FunSpec {

  describe("tail") {
    it("should rise error for empty list") {
      intercept[RuntimeException] {
        tail(Nil)
      }
    }

    it("should return Nil for one element List") {
      assert(tail(List(1)) == Nil)
    }

    it("should return (2,3) for (1,2,3)") {
      assert(tail(List(1, 2, 3)) == List(2, 3))
    }
  }

  describe("setHead") {
    it("should be (7,2,3) for setHead((1,2,3),7)") {
      assert(setHead(List(1, 2, 3), 7) == List(7, 2, 3))
    }

    it("should rise exception for setHead(Nil,7)") {
      intercept[RuntimeException] {
        setHead(Nil, 7)
      }
    }
  }

}
