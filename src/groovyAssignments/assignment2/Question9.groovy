package groovyAssignments.assignment2

String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()
//both the statements are equivalent
String string = "this string needs to be split"
println string.split(" ")
println string.split(/\s/)
println string.tokenize(" ")
println string.tokenize(/\s/)
String str = "are.you.trying.to.split.me.mister?"
println str.split(/\./)
println str.tokenize(".")
