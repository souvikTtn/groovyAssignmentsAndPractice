class GroovyPractice {
    static void main(String[] args) {
        println("hello world from groovy")
        //print ho 3 times
        3.times { println "ho" }
        def firstName = "souvik"
        //example of g string
        println("${firstName} chakraborty")

        def multiLineString = '''\
Line one
Line Two
Line Three
'''
        print(multiLineString)
        def sum = "The sum of 2 and 3 equals ${2 + 3}"
        print(sum)
        def number =3.14
        println("$number")
        //gstring without interpolation
        println("\$firstName")

        def sParameterLessClosure = "1 + 2 == ${-> 3}"
        println(sParameterLessClosure)
        //<< used to append to w
        def sOneParamClosure = "1 + 2 == ${ w -> w << 3}"
        println(sOneParamClosure)

        //example of lazy evaluation
        def number1 = 1
        def eagerGString = "value == ${number1}"
        def lazyGString = "value == ${ -> number1}"
        println(eagerGString+" "+lazyGString)
        number1=2
        println(eagerGString+" "+lazyGString)
        def i=new Integer('13')
        println(i instanceof Integer)
        BigDecimal bigDecimal=new BigDecimal(10)
        println(bigDecimal-10)

        def hell={
             println it
        }
        hell("wor")
    }
}
