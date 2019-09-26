package groovyAssignments.assignment2

def stringParser(String str){
    def list=str.tokenize(/\&\?/)
    list
}
Map map = new HashMap();
stringParser("http://www.google.com?name=johny&age=20&hobby=cricket").each {
    String[] pairs = it.tokenize("=")
    map.put(pairs[0], pairs.length == 1 ? "" : pairs[1]);
}
println map

