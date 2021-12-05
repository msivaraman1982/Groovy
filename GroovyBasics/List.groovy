package GroovyBasics

//List is a structure to store collection of data items
//Syntax : [obj1, obj2....] Obj can be of any data type
def A= [1,2,3,4]
def b=["Groovy","Manoj","Text"]
def c=[1,2,3,["A",'B',"Groovy"],4] //Nested heterogeneous List
def d=[1,2,"a",1.3] //Heterogeneous list

println A[0,1,2,3]
println b.get(2)
println c[3][2]
println c.get(3).get(2)
println d[1..3]
println c[4..1]
println c.contains(1)
println c.contains("Groovy")
println c[3].contains("Groovy")
println d.size()
d.add("Add")
println d	
c<<35.5
println c
A.add(2, 2.5)
println A
A.remove(2)
println A
b = b + ["Add","To","List"]
println b
b = b - ["Add","To","List"]
println b
d = d.plus(["Add",10])
println d
c.pop() //removes first item from the list
println c
d = d.minus([10])
println d
d.removeLast() //removes last item
println d

println (A.intersect(c))
d=d.reverse()
println d

d=d.sort()
println d

println(d.empty)
println(d.isEmpty())

d.clear()
println(d.isEmpty())
