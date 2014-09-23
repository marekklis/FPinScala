package chapter2

object Ex1 {
  def fib(n: Int): Int = {
    def go(prev: Int, cur: Int, n: Int): Int = {
      if (n == 0) {
        prev
      } else {
        go(cur, cur + prev, n - 1)
      }
    }

    go(0, 1, n)
  }
}
