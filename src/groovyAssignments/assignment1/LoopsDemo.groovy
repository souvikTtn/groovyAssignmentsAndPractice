package groovyAssignments.assignment1

//simple upto loop

//1 is starting 10 is the max no of iteration
1.upto(10,{
    print(it)
})
//Print multiple of 3 upto 10 terms in at least three different ways using groovy special methods
//using upto method
println("\nupto loop")
1.upto(10,{
    print(it*3)
})
println("\ntimes loop")
//starts with 0
10.times {
    print ((it+1)*3)
}
println("\nstep loop")
3.step(31,3,{
    print(it)
})

