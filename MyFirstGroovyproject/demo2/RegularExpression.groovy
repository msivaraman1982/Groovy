package com.test.demo2
//regex - patterns that is used to find the substrings in text
//~ "expression"

def match = "Groovy" =~ "G"
if (match) {
	def i=0
	while(match) {
		println match[i]
		i++
	}
}
else {
	println "No match found"
}