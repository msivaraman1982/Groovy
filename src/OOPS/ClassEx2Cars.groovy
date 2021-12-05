package OOPS

class ClassEx2Cars {
	String Carname
	String model
	String color
	
	def getCarDetails() {
		println "You are driving a $Carname model $model of color $color "
	}
	
	def starteninge() {
		println "Starting engine for $Carname"
	}

	static void main(args) {
	ClassEx2Cars suzuki = new ClassEx2Cars()
	ClassEx2Cars ford = new ClassEx2Cars()
	suzuki.Carname = "Suzuki"
	ford.Carname = "Ford"
	suzuki.model = "2021"
	suzuki.color ="Blue"
	ford.model = "2019"
	ford.color = "White"
	
	suzuki.getCarDetails()
	suzuki.starteninge()
	println "========================"
	
	ford.getCarDetails()
	ford.starteninge()
	}
}
