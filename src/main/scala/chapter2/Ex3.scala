package chapter2

object Ex3 {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  def uncarry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)
}
