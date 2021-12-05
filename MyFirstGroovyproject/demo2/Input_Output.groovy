package com.test.demo2

print "Enter your name: "
def name = System.console().readLine()
println "Hi $name"

print "Enter the first number: "
def num1 = System.console().readLine().toInteger()
print "Enter the second number: "
def num2 = System.console().readLine().toInteger()
println " The sum of $num1 and $num2 is : " + (num1 + num2) 

//Output
def name1 = "Manoj"
println "My name is $name1"
printf "My name is %s \n", name1

printf "%s | %s | %d | %.2f \n" , ["Manoj", "Groovy", 20 ,20.333]
//Padding . -10 for padding in right and 10 for padding in left
printf "%-10s | %10s | %d | %.2f \n" , ["Manoj", "Groovy", 20 ,20.333] 
//%c	character
//%d	decimal (integer) number (base 10)
//%e	exponential floating-point number
//%f	floating-point number
//%i	integer (base 10)
//%o	octal number (base 8)
//%s	a string of characters
//%u	unsigned decimal (integer) number
//%x	number in hexadecimal (base 16)
//%%	print a percent sign
//\%	print a percent sign

/*
\a	audible alert
\b	backspace
\f	form feed
\n	newline, or linefeed
\r	carriage return
\t	tab
\v	vertical tab
\\	backslash
*/