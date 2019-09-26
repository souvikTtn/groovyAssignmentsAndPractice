package groovyAssignments.assignment2

def list1=[]
list1.addAll(11..14)
def list2=[]
list2.addAll(13..15)
//elements from list1 that are not in list 2
println(list1-list2)

//finding if two lists have common elements
println(!list1.disjoint(list2))

//removing all elements from list whose index is odd
println(list1)
def l2=[]
list1.eachWithIndex{
    value,index->if(index%2!=0)l2.add(value)
}
println l2
list1.removeAll(l2)
println list1
