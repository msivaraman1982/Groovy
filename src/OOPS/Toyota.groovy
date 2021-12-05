package OOPS

class Toyota extends Cars {
	int topSpeed
	def topSpeed() {
		println "Top speed is $topSpeed "
	}
	
	static void main(arg) {
		Toyota car1 = new Toyota()
		car1.name ="Toyota"
		car1.model ="2018"
		car1.color ="Blue"
		car1.topSpeed = 200
		car1.startEngine()
		car1.acce()
		car1.topSpeed()
		car1.stopEngine()
	}
}
