package groovyAssignments.assignment1

class ExtendedPerson extends Person {
    Integer empId
    String company
    Double salary
    @Override
    String toString() {
        return """\
$name is a $gender aged $age who lives at $address.
He works for $company with employee id $empId and 
draws $salary lots of money !!!!."""
    }
}