// 2520 is the smallest number that can be divided by each of the numbers
// from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible divisible
// with no remainder by all of the numbers from 1 to 20?

val numbers = 1 to 20

LazyList.from(numbers.max, numbers.max)
  .find: m =>
    numbers.forall(m % _ == 0)
