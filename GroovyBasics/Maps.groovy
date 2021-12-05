package GroovyBasics

//Un-Ordered collection of key-value pair

def Mymap = ['name': "Manoj",'subject' : "Groovy", 'Level': "Basics"]

println Mymap
println Mymap.name
println Mymap['subject']
println Mymap.get('Level')
println Mymap.getAt('subject')
println Mymap.size()

Mymap.put('Duration', 8)
println Mymap

println Mymap.containsKey('name')
println Mymap.containsValue("Groovy")
println Mymap.getClass()

def Mymap1 = Mymap.clone()
println Mymap1

Mymap.each{
	key, value -> println "$key : $value"
}

Mymap.eachWithIndex{
	key, value, i -> println "$i | $key : $value"
}

Mymap.each{ entry -> println "$entry.key : $entry.value" }
Mymap.eachWithIndex { entry, i -> println "$i | $entry.key : $entry.value" }

def map1 = ["a":1,"b":2]	
def entries = map1.entrySet()
entries.each { entry -> 
	assert entry.key in ['a','b']
	assert entry.value in [1,2,3]
}

Mymap1.clear()
println Mymap1