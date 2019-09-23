package groovyAssignments.assignment1

ExtendedPerson extendedPerson=new ExtendedPerson()
extendedPerson.@name="souvik"
println extendedPerson.name
println extendedPerson.getName()
println extendedPerson.@name
int i=5

for(int j=1;j<=8;j*=2){
    j.times { print "*"}
    println()
}

