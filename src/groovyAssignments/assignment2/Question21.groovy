package groovyAssignments.assignment2

Map m = [Computing : [Computing : 600, InformationSystems : 300], Engineering : [Civil : 200, Mechanical : 100], Management : [Management : 800] ]

//no of departments
int nDept=0
m.entrySet().each {
    nDept+=it.value.size()
}
println nDept

//no of programs delivered by the computing department

println m.Computing.size()
//no of students enrolled in civil engineering course
println m.Engineering.Civil