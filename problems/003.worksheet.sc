// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143?

def isPrime(n: Long): Boolean =
  if n == 2 || n == 3 then
    true
  else if n <= 1 || n % 2 == 0 || n % 3 == 0 then
    false
  else
    val limit = Math.sqrt(n.toDouble).round
    LazyList.range(start = 5L, end = limit + 1L, step = 6L)
      .forall: i =>
        n % i != 0 && n % (i + 2) != 0

val n = 600_851_475_143L
val limit = Math.sqrt(n.toDouble).ceil.round
LazyList.range(limit, 1L, -1L)
  .filter(isPrime)
  .find(n % _ == 0)
