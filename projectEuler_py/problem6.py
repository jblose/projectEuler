'''
Created on Feb 11, 2013

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

@author: jblose
'''
sums = 0
sumsq = 0

for n in range(1,101) :
    sums = sums + n
    sumsq = sumsq + (n**2)
sums = sums**2
answer = sums - sumsq
print answer

#25164150


