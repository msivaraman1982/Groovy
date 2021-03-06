package GroovyBasics

File Myfile = new File('C:/Users/manok/Documents/GitHub/Groovy/Data file 3.txt')
Myfile.write("Line 1")
Myfile << "\nLine 2"
Myfile.text = "Line 3" // Overwrites everything in the file
Myfile.withWriter { writer ->  
	writer.writeLine("Line 4")
} //This will also overwrite
Myfile.append("Line 5")
println Myfile.length()
Myfile.bytes=[]
Myfile.renameTo(new File ("Data file3.txt"))
println Myfile.getName()
println Myfile.getAbsolutePath()
Myfile.delete()
