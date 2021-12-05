package GroovyBasics
//Closures are block of codes that can take parameters,refer variables,return values 
//and can be passed as a parameter to a Method
//https://medium.com/@dis_is_patrick/practical-uses-for-closures-c65640ae7304
//https://www.quora.com/What-exactly-is-a-closure-in-JavaScript

def Myclosure = {println "Hello world"}
Myclosure.call()

def str = "Hello"
def Myclosure1 = {name -> println "$str $name"}
Myclosure1.call("Manoj")

//A closure can be passed as a object to a method as below

def myMethod(closcall) {
	closcall.call("this is a Groovy closure")
}
myMethod(Myclosure1)

//Can als used to return values
def Myclosure2 = {
	a,b,c ->
	return(a+b+c)
}
println (Myclosure2.call(10,3,3))
//Can be used in functions
def Mylist = [1,2,3,4]
println Mylist.each { it }
println Mylist.find { item -> item==3 } //Returns the value if found. Else returns Null
println Mylist.find { item -> item==6}
println Mylist.findAll {item -> item > 2 }
println Mylist.any { item -> item > 1 }
println Mylist.every { item -> item >3 }
println Mylist.collect { item -> item*2 }