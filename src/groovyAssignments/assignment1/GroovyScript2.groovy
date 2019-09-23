package groovyAssignments.assignment1

ExtendedPerson extendedPerson = new ExtendedPerson(name: "sachin", age: 24, address: "delhi", company: "intelligrape",
        empId: 12, salary: 200000D, gender: Gender.MALE)
println extendedPerson

def test
for (int i = 0; i < 7; i++) {
    switch (i) {
        case 0: test = "Test"
            ifTesting(test)
            break
        case 1: test = "null"
            ifTesting(test)
            break
        case 2: test = null
            ifTesting(test)
            break
        case 3: test = 100
            ifTesting(test)
            break
        case 4: test = 0
            ifTesting(test)
            break
        case 5: test = []
            ifTesting(test)
            break
        case 6: test = new ArrayList<>()
            ifTesting(test)
            break
    }
}

void ifTesting(def test) {
    if (test) {
        println "$test test evaluated to true inside if"
    } else
        println "$test test evaluated to false inside if"
}
