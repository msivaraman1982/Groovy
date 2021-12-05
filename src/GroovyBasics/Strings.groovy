package GroovyBasics

//Single quoted Strings '...'
def name1 = "Manoj"
println "==============Single quote example=================="
println name1  
println 'My name is ' + name1
println 'My name is $name1' //No Interpolation - Cannot use variables inside a single quoted string 
//Double quoted strings "...."
def name="Manoj"
println "==============Double quote example=================="
println name
println "My name is " + name
println "My name is ".concat(name)
println "My name is ${name}" //Interpolation - Can use variables inside a double quoted string 
println "My name is $name"

//Triple single quote strings '''....''' and //Triple double quote strings """...."""
//Both are same
def s1= '''This is a Groovy code to printing
triple quotes for testing'''
println s1

def s2= """This is a Groovy code to printing
triple double quotes for testing"""
println s2

println s1.length()
println name[2]
println name[-2]
println name.indexOf('n')
println name[0..4]
println name[4..2]
println name.substring(2)
println s2.substring(5, 20)

def str="This is a Groovy class"
println str.split(" ")
println str-("Groovy ")
println str.replace("Groovy class", "groovy session")
println str.toLowerCase()
println str.toUpperCase()
println str.toList()
println "Groovy " * 3
println str.equals("Manoj")
println "ABC".equalsIgnoreCase("abc")

def n1= "Manoj"
//Slashy string /..../
def a1 =/a blue sky $n1/
//$ slashy string $/...../$
def a2 = $/A beautifil day $n1/$
println a1
println a2
