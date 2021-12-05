package OOPS

abstract class Car {
	String name
	String color
	String model
	def startEngine(){
		println "Engine Started for $name"	
	}
	def stopEngine(){
		println "Engine Stopped for $name"
	}
	def acce() {
		println "Engine accelerating for $name"
	}
	abstract def topSpeed()
}
