package groovyAssignments.assignment1

def isContainsList={
    a,b->b.contains(a)
}
def a=[1,2,3,4,5,6,7,8,9,10]
def num=3
println(a.class.name)
println(isContainsList(num,a))