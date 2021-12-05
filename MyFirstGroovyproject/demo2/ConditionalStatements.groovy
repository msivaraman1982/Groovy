package com.test.demo2
//Control structures
//Conditional Statements
//if-else
def num =10
	if (num == 10){
		println "Number is 10"
		num= 0	
	}
	else {
		println "Number is not 10"
	}	
	
//Nested if
	if (num >0) {
		println "Number is positive"
	}
	else if (num == 0) {
		println "Number is Zero"
	}
	else {
		println "Number is Negative"
	}
//switch-case
	def i = 1
	switch(i) {
		case 0:
			println "Number is Zero"
			break
		case {i>0}:
			println "Number is postive"
			break
		case {i<0}:
			println "Number is Negative"
			break
		default:
			println "Not a number"
	}
//Looping
//Exceptional handling