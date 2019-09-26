package groovyAssignments.assignment2

def myMap=[:]
String dummyFriendName="myFriend "
for(int i=0;i<10;i++){
    myMap.(dummyFriendName+i)=i+20
}
println myMap