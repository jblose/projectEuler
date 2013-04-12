'''
Created on Feb 8, 2013
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.

@author: jblose
'''


number1 = 100
number2 = 100
palindrome = 0

while number1 <= 1000 :
    number = number1 * number2 
    if str(number) == str(number)[::-1] :
        print "%d is a palindrome" % number
        print "%d x %d" % (number1,number2)
        if number > palindrome :
            palindrome = number
    
    number2 = number2 + 1
    if number2 >= 1000 :
        number1 = number1 + 1
        number2 = 100
         
print "Highest Palindrome: %d " % palindrome
    