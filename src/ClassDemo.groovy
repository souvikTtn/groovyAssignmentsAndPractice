/*
class ClassDemo {
    static int i
    static void main(String []args){
        println ClassDemo.class.getDeclaredField("i").type
        println ClassDemo.i.class
    }
}
*/
class Person{
    String name;
    Integer age;
    def increaseAge(Integer years){
        age+=years
    }
}
println("hello world this is groovy script")
def p=new Person(name: "souvik",age: 0)
println(p.increaseAge(12))
