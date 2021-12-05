package GroovyBasics

//Method is a named block of code to make code modular and reusable
//It can take parameters and have a return type

def methodname() {
	println "Hello World using Method"
}

methodname()

def Sum(int a, int b) {
	println "Sum is: " + (a+b)
}
Sum(5, 6)

def sub (int a, int b) {
	def c = a-b
	return c
}

def result = sub(10, 5)
println "Result is " + result 