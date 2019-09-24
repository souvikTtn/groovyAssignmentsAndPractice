package groovyAssignments.assignment1
def newFile=new File("../../files/groovyFile.txt")
def flag=false
if(!newFile.exists()){
    newFile.createNewFile()
}
else {
    new File("../../files/myFile").eachLine {
        if(flag){
            newFile.append(it)
            newFile.append("\n")
        }
        else {
            newFile.write(it)
            newFile.append("\n")
            flag=true
        }
    }
    new File("../../files/myFile2").eachLine {
        newFile.append(it)
        newFile.append("\n")
    }
}
newFile.eachLine {
    println(it)
}

def newFile2=new File("../../files/odd.txt")
if(!newFile2.exists()){
    newFile2.createNewFile()
}
flag=false
def lineCount=0
newFile.eachLine {
    lineCount ++
    if(flag && lineCount %2!=0){
        newFile2.append(lineCount+" : "+it)
        newFile2.append("\n")
    }
    else {
        if(lineCount %2!=0){
            newFile2.write(lineCount+" : "+it)
            newFile2.append("\n")
            flag=true
        }
    }
}

//eachLine gives line and lineNumber as arguments





