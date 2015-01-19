package chapter6

import chapter6.RNG.{nonNegativeInt, Simple}
import org.scalatest.FlatSpec

class StateSpec extends FlatSpec {

  "nonNegativeInt" should "return only positive ints" in {
    val rng1 = nonNegativeInt(Simple(1))
    val rng2 = nonNegativeInt(rng1._2)
    val rng3 = nonNegativeInt(rng2._2)
    val rng4 = nonNegativeInt(rng3._2)

    // Simple(1) nextInt values: 384748, -1151252339, -549383847, 1612966641
    assert(rng1._1 == 384748)
    assert(rng2._1 == 1151252338)
    assert(rng3._1 == 549383846)
    assert(rng4._1 == 1612966641)
  }

}
