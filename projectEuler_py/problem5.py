'''
Created on Feb 11, 2013

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

@author: jblose
'''

found = False
number = 20
while found == False : 
    remainder = False
    for n in range(11,21) :
        if number % n != 0 and remainder == False:
            remainder = True
    if remainder ==  False :
        print number
        found = True
    else :
        number += 20

#232792560        