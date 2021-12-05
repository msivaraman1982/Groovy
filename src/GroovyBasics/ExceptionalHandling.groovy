package GroovyBasics
//Try-catch
try {
int i
i=1/0
} 
catch(ArithmeticException Arexp) {
	println " Arithmetic exception " + Arexp.getMessage()
}

catch(Exception exp) {
	println "Exception block " + exp.getCause()
	println exp.getMessage()
	println exp.stackTrace
}
 println "Next line after exception	"

 //Try-catch-finally
try {
int x
x=1/0
}
catch(ArithmeticException exp1) {
	println "Exception in try-catch-finally"
}
finally {
	println "Into finally loop"  //Executes each time irrespective or exception occurrence
}

//Try-finally