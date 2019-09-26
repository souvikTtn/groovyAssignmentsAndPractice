package groovyAssignments.assignment2

List<Employee> employeesGenerator(){
    List<Employee> employeeList=[]
    for(i in 1..10){
        int age=Math.abs( new Random().nextInt() % (60 - 20) ) + 20
        int salary=Math.abs( new Random().nextInt() % (200000 - 100000) ) + 200000
        Employee employee=new Employee(name: "name$i",age:age,salary:salary )
        employeeList.add(employee)
    }
    employeeList
}

def employeeList=employeesGenerator()
employeeList.each {
    println it
}

Employee oldestEmployee=employeeList.max{
    it.age
}
Employee youngestEmployee=employeeList.min{
    it.age
}

Employee richestEmployee=employeeList.max{
    it.salary
}

println "employee with max age $oldestEmployee"
println "employee with min age $youngestEmployee"
println "employee with max salary $richestEmployee"

List<String> employeeNameList=[]
employeeList.each {
    employeeNameList.add(it.name)
}
println employeeNameList
