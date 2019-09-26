package groovyAssignments.assignment2

//sort list in ascending and descending order
def myList=[14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]
//ascending order
println(myList.unique().sort())
//descending order
println(myList.unique().sort().reverse())
println(myList.unique().sort{-it})
