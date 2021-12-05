package GroovyBasics

class MethodWithClassAndObject {

	static void main(args) {
		MethodWithClassAndObject Myfunc = new MethodWithClassAndObject()
		Myfunc.Mymethod()
	}
	def Mymethod() {
		println "Im inside Mymethod"
	}
}
