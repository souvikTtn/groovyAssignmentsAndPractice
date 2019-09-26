package groovyAssignments.assignment2

class Employee {
    String name
    Integer age
    Double salary

    @Override
     String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
