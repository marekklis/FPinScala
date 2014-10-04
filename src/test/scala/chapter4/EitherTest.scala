package chapter4

import chapter4.Either._
import org.scalatest.FunSpec

class EitherTest extends FunSpec {

  describe("sequence") {

    it("should return Left(\"error\") if Left(\"error\") element exists on list") {
      assert(sequence(List(Right(1), Left("error"), Right(3))) == Left("error"))
    }

    it("should return Right((1,2,3))") {
      assert(sequence(List(Right(1), Right(2), Right(3))) == Right(List(1, 2, 3)))
    }
  }

  describe("traverse") {
    //    it("should return Left") {
    //      assert(traverse(List("1", "two", "3"))(i => Try(i.toInt)) == Left(new NumberFormatException("For input string: \"two\"")))
    //    }

    it("should return Right((1,2,3))") {
      assert(traverse(List("1", "2", "3"))(i => Try(i.toInt)) == Right(List(1, 2, 3)))
    }

  }

}
