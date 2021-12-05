package OOPS

class Suzuki extends Car {
	int topSpeed
	@Override
	public Object topSpeed() {
		println "Topspeed for $name is $topSpeed" 
	}
	
	static void main(args) {
		Suzuki car1 = new Suzuki()
		car1.name = "Maruthi Suzuki"
		car1.model = "2021"
		car1.color = "Blue"
		car1.topSpeed = 210
		car1.startEngine()
		car1.acce()
		car1.topSpeed()
		car1.stopEngine()		
	}
}
