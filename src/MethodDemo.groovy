//named parameter method
void foo(Map args){
    println "name is $args.name"+ " age is $args.age"
}
def defaultParam(int a,int b=0,int c){
    a+b+c
}
foo(name:"souvik",age: 24)
print defaultParam(5,3)