package com.test.demo2
// Used to create a list of sequential values
def range = 1..10
println range
println range.size()
println range.getFrom()
println range.getTo()
println range.get(1)
println range[9]
println range.contains(10)
println range.isReverse()
if (range.isReverse() == false) {
	println "Range is in Ascending order" 
}
else {
	println "Range is in Descending order" 
}

def subrange = range.subList(3,5)

println range
println subrange
println subrange.size()
println subrange.getFrom()
println subrange.getTo()
for (i in subrange) {
	println i
}

range.eachWithIndex { i,j ->
	println "$j | $i "
}

range = range.reverse() // The range when reversed becomes a List
println range

//if (range.isReverse()== false) {
//	println "Range is in Ascending order"
//}
//else {
//	println "Range is in Descending order"
//}
//range = range.reverse()
