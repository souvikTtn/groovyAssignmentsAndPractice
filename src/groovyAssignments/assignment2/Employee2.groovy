package groovyAssignments.assignment2

class Employee2 {
    String name
    Integer age
    String departmentName
    String employeeNumber
    Double salary


    @Override
     String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", departmentName='" + departmentName + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}


