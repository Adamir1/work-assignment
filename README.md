# Answers

## QUESTION 1
1. Did you write that as if you were writing production code?
2. What assumptions does your implementation make about the input parameter? 
3. Are you using all the information you have about the input array?
4. What is the algorithmic complexity ("big O") of your function?

### Answers: 
1. Yes
2. Integers of equal value are grouped in the input array.
3. Info used: array length, checks for negative integers in array, checks empty array
4. Asymptotic linear : O(n).

## QUESTION 3
1. Why can't the next estimate, xx, be computed as a / x, where x is the
   previous estimate?
2. What happens, in your implementation, if a = 0?
3. What value does your program give for square_root(2, 1e-6)?

### Answers:
1. Using newton interpolation equation.
2. 0
3. 1.4142135623746899
