package GroovyBasics

class Student {
	String Name
	int Sub1marks
	int Sub2marks
	
	def printtotal() {
		println "$Name has total marks: " +(Sub1marks+Sub2marks) 
	}
	static void main(args) {
		Student student1 = new Student()
		student1.Name = "Manoj"
		student1.Sub1marks = 89
		student1.Sub2marks = 90
		student1.printtotal()
		
		Student student2 = new Student()
		student2.Name = "test"
		student2.Sub1marks = 99	
		student2.Sub2marks = 90
		student2.printtotal()
		
	}
}
