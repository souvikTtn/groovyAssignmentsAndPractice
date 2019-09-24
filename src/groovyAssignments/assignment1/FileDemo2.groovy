package groovyAssignments.assignment1

def newFile=new File("../../files/groovyFile.txt")
if(!newFile.exists()){
    newFile.createNewFile()
}

def newFile2=new File("../../files/noWhiteSpace.txt")
newFile2.text=newFile.text.replaceAll("\\s","")

newFile2.eachLine {
    print it
}
