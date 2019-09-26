package groovyAssignments.assignment2

//finding number of occurances of character in a string

String str="hello my name is souvik chakraborty thank you"
int count=0
str.each {
    if(it=="a")
        count++
}
println(str.count("a"))
println(count)