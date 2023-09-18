// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
// we can see that the 6th prime is 13.
// What is the 10,001st prime number?


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

LazyList.from(1)
  .filter(isPrime)
  .take(10_001)
  .last
