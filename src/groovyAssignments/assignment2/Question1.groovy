package groovyAssignments.assignment2

//initialising an empty list
def myList=[]
myList[11]="my element"
println myList[11]
println myList.size()
println myList.get(5)
println myList
//initialising a list using range
def range= 1..10
println "$range"
//finding all elements which are even
println(range.findAll{
    it%2==0
})

myList.clear()
myList.addAll(1..10)
myList << 10
println (myList as Set)
println(myList.unique())


