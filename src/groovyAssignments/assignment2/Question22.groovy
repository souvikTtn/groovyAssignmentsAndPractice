package groovyAssignments.assignment2

List<Employee2> getEmployees() {
    List<Employee2> employee2List = []
    for (int i = 0; i < 50; i++) {
        Employee2 employee2 = new Employee2(name: "employee$i", age: i + 20, departmentName: "department" + (i % 10),
                employeeNumber: "e$i", salary: i + 20000)
        employee2List<<employee2
    }
    employee2List
}
//splitting list
def (list1, list2) = getEmployees().split { it.salary>20000 && it.salary<=20025 }
println list1
println list2

Map<String,List<Employee2>> map=[:]
map=getEmployees().groupBy {
    it.departmentName
}
map.each {
    print(it.key)
    println(" no of employees " +it.value.size())
}
//employees whose age is greater than 18 and less than 35
println getEmployees().findAll {
    it.age>=18 && it.age<=35
}

//Group the employees according to the alphabet with which their first name starts
println "*************************************************************"
 getEmployees().groupBy {
    it.name.charAt(0)
}.entrySet().each {
     println it.value.size()
}

