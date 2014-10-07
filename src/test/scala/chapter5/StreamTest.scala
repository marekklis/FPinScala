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

  describe("take") {
    it("should return Stream(1,2,3)") {
      assert(Stream(1, 2, 3, 4, 5).take(3).toList == List(1, 2, 3))
    }
  }

  describe("drop") {
    it("should return Stream(4,5)") {
      assert(Stream(1, 2, 3, 4, 5).drop(3).toList == List(4, 5))
    }
  }

  describe("takeWhile") {
    it("should return Stream(1,2,3)") {
      assert(Stream(1, 2, 3, 4, 5).takeWhile(_ != 4).toList == List(1, 2, 3))
    }
  }

  describe("forAll") {
    it("should return false") {
      assert(!Stream(1, 2, 3, 4, 5).forAll(_ != 2))
    }
  }

  describe("takeWhileViaFoldRight") {
    it("should return Stream(1,2,3)") {
      assert(Stream(1, 2, 3, 4, 5).takeWhileViaFoldRight(_ != 4).toList == List(1, 2, 3))
    }
  }

  describe("headOption") {
    it("should return Option(1)") {
      assert(Stream(1).headOption == Some(1))
    }
    it("should return Option(1) for Stream(1, 2, 3)") {
      assert(Stream(1, 2, 3).headOption == Some(1))
    }
    it("should return None") {
      assert(Stream.empty.headOption == None)
    }
  }

}
