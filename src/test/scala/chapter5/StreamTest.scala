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

  describe("map") {
    it("should return Stream(2,4,6,8)") {
      assert(Stream(1, 2, 3, 4).map(_ * 2).toList == List(2, 4, 6, 8))
    }
  }

  describe("filter") {
    it("should return Stream(2,4)") {
      assert(Stream(1, 2, 3, 4).filter(_ % 2 == 0).toList == List(2, 4))
    }
  }

  describe("append") {
    it("should return Stream(1,2,3,4,5)") {
      assert(Stream(1, 2, 3).append(Stream(4, 5)).toList == List(1, 2, 3, 4, 5))
    }
  }

  describe("Stream") {
    it("constant") {
      assert(Stream.constant(4).take(5).toList == List(4, 4, 4, 4, 4))
    }
  }

}
