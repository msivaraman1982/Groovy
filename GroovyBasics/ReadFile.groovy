package GroovyBasics

//Reading a file 
String filePath = "C:/Eclipse/Groovy programs/MyFirstGroovyproject/Data file 1.txt"
File Myfile= new File(filePath)

//as String
println Myfile.text

// as List
def list =  Myfile.collect { it }
println "List : $list"

// as Array
def array = Myfile as String[]
println "Array : $array"

//into a list of strings
def lines= Myfile.readLines()
println "Line: $lines"

// as Line by line
Myfile.eachLine { line -> 
	println "Line : $line"
} 

Myfile.eachLine {line, lineno -> println "$lineno: $line"  }

def lineno1 = 2..4
def linelist =[]
Myfile.eachLine{ line, lineno ->
	if (lineno1.contains(lineno)) {
		linelist.add(line)
	}
}
println "$linelist"

//Read with a reader
def line
Myfile.withReader { reader -> 
	while((line = reader.readLine())!= null) {
		println "$line"
	}
}

// Reading with New reader -> We have to close the file manually after this operation
def outputFile = "Data file 2.txt"
def reader = Myfile.newReader()
new File(outputFile).append(reader)
reader.close()

//When working with binary files, read or show contents as bytes
byte[] contents = Myfile.bytes
println contents

println Myfile.length() // Check the size in bytes

//Check if its a file or directory
println Myfile.isFile()
println Myfile.isDirectory()

//Get list of files from a directory
new File("C:/Eclipse/Groovy programs/MyFirstGroovyproject").eachFile{
	file -> println file.getAbsolutePath()
}

//Recursively display all files in a dir and its Subdirectoty
new File("C:/Eclipse/Groovy programs/MyFirstGroovyproject").eachFileRecurse { 
	file -> println file.getAbsolutePath()
}

//Copy file data to another file
def newFile =  new File("Data file 3.txt")
newFile << Myfile.text 

//deleting a file
newFile.delete()
