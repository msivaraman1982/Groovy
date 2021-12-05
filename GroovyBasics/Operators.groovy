package GroovyBasics

//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbTdIc2wyZU8xUTB6amlNWnBfY1E2aHJGbjRkQXxBQ3Jtc0trbVM4UlQ4LUNNekpzWkpuc0k0T1ZEbjVkOVczUWZlTGZFVDlJblZPZGZoQ0I2ejVPRVVyc2dseWFRT2JpanRWVjQwUW80V0g2amUwTjVMSlpGUUgwQmxDSEhLMWFYZUFtT1FnODd1dUFobFpGczdMTQ&q=http%3A%2F%2Fdocs.groovy-lang.org%2Flatest%2Fhtml%2Fdocumentation%2Fcore-operators.html
/*
+ for addition
- for Subtraction
* for multiplication
/ for division intdiv() for integer division
% for reminder
** for pwer of
*/
// assert is used to check if the operation is true or not. If not ture will throw an error
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8
assert 9.intdiv(2) == 4

//Unary operators
assert +3 == 3
assert -4 == 0 - 4

// increment and decrement operators 
i=10
println i++ //(does after printing)
println i--
println i

//Assignment arithmetic operators
a=1
a +=3 //a= a+3
println a

b=2
b -=1
println b 

//+=
//-=
//*=
///=
//%=
//**=

// Relational operators
//1) == equal
//2) != different
//3) < less than
//4) <= less than or equal
//5) > greater than
//6) >= greater than or equal
//7) === identical (Since Groovy 3.0.0)
//8) !== not identical (Since Groovy 3.0.0)

//Logical operators
//Groovy offers three logical operators for boolean expressions:
//
//&&  logical "and"
//||  logical "or"
//!: logical "not"

//The logical "not" has a higher priority than the logical "and".
//The logical "and" has a higher priority than the logical "or".
//
//short-circuiting
//
//The logical || operator supports short-circuiting: if the left operand is true, 
//it knows that the result will be true in any case, so it won’t evaluate the right operand. 
//The right operand will be evaluated only if the left operand is false.
//
//Likewise for the logical && operator: if the left operand is false, 
//it knows that the result will be false in any case, 
//so it won’t evaluate the right operand. 
//The right operand will be evaluated only if the left operand is true.

//Bitwise Operators
int a1 = 20
int a2 =25
println (a1 & a2)
println Integer.toBinaryString(a1) //10100
println Integer.toBinaryString(a2) //11001
// applying bitwise operation on the above will give a result of  10000
println Integer.parseInt("10000",2)
