// A palindromic number reads the same both ways. The largest palindrome
// made from the product of two 2-digit numbers is 9009 = 91 * 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

def isPalindrome(n: Int): Boolean =
  val s = n.toString()
  val (s1, s2) = s.splitAt(s.length() / 2)
  s1 == s2.reverse

val max = 999
val min = 100

val palindromes =
  for
    x <- LazyList.range(max, min, -1)
    y <- LazyList.range(max, min, -1)
    product = x * y
    if isPalindrome(product)
  yield product

// Using max makes LazyLists needless to use, the same could be achieved
// using ranges or other eager collections. However it is not terribly
// unefficient. Maybe one day I optimize it further.
palindromes.max
