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

  describe("drop") {

    it("should be Nil when dropping 3 elements from (1,2)") {
      assert(drop(List(1, 2), 3) == Nil)
    }

    it("should be (4,5) when dropping 3 elements from (1,2,3,4,5)") {
      assert(drop(List(1, 2, 3, 4, 5), 3) == List(4, 5))
    }
  }

  describe("dropWhile") {

    it("should be Nil when dropping from (1,2,3,4,5)") {
      assert(dropWhile(List(1, 2, 3, 4, 5), (a: Int) => a < 10) == Nil)
    }

    it("should be (1,2,3,4,5) when dropping from (1,2,3,4,5)") {
      assert(dropWhile(List(1, 2, 3, 4, 5), (a: Int) => a < 0) == List(1, 2, 3, 4, 5))
    }

    it("should be (4,5) when dropping from (1,2,3,4,5)") {
      assert(dropWhile(List(1, 2, 3, 4, 5), (a: Int) => a < 4) == List(4, 5))
    }
  }

  describe("init") {

    it("should return (1,2,3) for (1,2,3,4)") {
      assert(init(List(1, 2, 3, 4)) == List(1, 2, 3))
    }
  }

  describe("length") {

    it("should be 0 for empty list") {
      assert(length(Nil) == 0)
    }

    it("should be 3 for (1,2,3)") {
      assert(length(List(1, 2, 3)) == 3)
    }
  }

  describe("reverse") {
    it("should be (3,2,1) from (1,2,3)") {
      assert(reverse(List(1, 2, 3)) == List(3, 2, 1))
    }
  }

}
