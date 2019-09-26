package groovyAssignments.assignment2

//creating an empty list
//list=new ArrayList()

Map map=[1:"souvik",2:"sanjeev",3:"prateek"]
def list= []
list.add(1)
list << 2
list+=3
//push adds element at the start of the list
list.push(4)
list.push(4)
list<<5

println list.tail()
println list.size()
println(list.getAt(0..5))
//convert list to unique list
println list.unique()

String string="hello my name is souvik  chakraborty thank you"
//converts string to list
def stringList=string.tokenize(" ")
println stringList
//converts string to list
println stringList.join(" ")
println stringList.reverse()
//declaring a set

def mySet=stringList as Set
println mySet

