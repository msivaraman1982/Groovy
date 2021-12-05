package OOPS

//Class is a collection of data and methods that represents a real world objects



class Fruits {
	private String Fruitname
	private String Fruitcolor
	
//	def setFruitName(String name) {
//		Fruitname = name
//	} 
//	
//	def setFruitColor(String color) {
//		Fruitcolor = color
//	}
	
	def setFruitName() {
		print "Enter Fruit name: "
		Fruitname = System.console().readLine()
	}
	def setFruitColor() {
		print "Enter Fruit Color: "
		Fruitcolor = System.console().readLine()
	}
	def getFruitName() {
		println "The Fruit name is $Fruitname"
	}
	def getFruitColor() {
		println "The Fruit Color is $Fruitcolor"
	}
	static void main(args) {
		Fruits Apple = new Fruits()
		Apple.setFruitName()
		Apple.setFruitColor()
		Apple.getFruitName()
		Apple.getFruitColor()
	}
}
