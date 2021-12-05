package GroovyBasics

//Loops
//for
//forin
//while

//Keywords
//upto
//times
//step
int i =1
//For Loop
for(int a=1; a<5; a++){
	println a
}
println i
//For in
for (a in 1..5) {
	println a	
}

7.upto(10) { println"$it"  //$it is to print the iteration number
}

i.times{println "times"}

2.step(10, 2) { println "$it" }
int y=1
while(y <5) {
	print y
	y=y+1
}

