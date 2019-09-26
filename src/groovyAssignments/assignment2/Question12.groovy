package groovyAssignments.assignment2

Range range="a".."z"
 println(range.findAll {
     it>="j"
 })
boolean flag=false
int index=0
range.eachWithIndex{ String entry, int i ->
    if(entry == "j"){
        index=i
        flag=true
    }
    if(i>=index && flag)
        println entry
}
