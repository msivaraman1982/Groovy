package GroovyBasics

	def name = 'Testing variable'
	println name
	println 'Job is for ' + name
	println 'Job is for ${name}'
	println "Job is for ${name}"
	def my_name = "Manojkumar Sivaraman"
	def name1 = "My Name is "
	println name1 + my_name
	// Groovy is case sensitive
	def Number1 = 10
	def number1 = 20
	println Number1+number1
	println Number1
	println number1
	//Groovy is dynamically typed. 
	//A type of the variable can be changed dynamically. Variables are resolved at runtime
	def test_name = "Hello World"
	println test_name
	test_name = 100
	println test_name
	def (String a, int b, Double c) = [10,20,30]
	println a
	println b
	println c
	
 