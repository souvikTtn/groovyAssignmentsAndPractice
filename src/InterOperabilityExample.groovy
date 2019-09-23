class InterOperabilityExample {
     static void main(String[] args) {
        JavaClass javaClass=new JavaClass()
        GroovyClass groovyClass=new GroovyClass()
        def firstName="souvik"
        def fullName="$firstName chakraborty"
         println fullName.hashCode()+" before calling method"
        javaClass.takeStringAsArgument(fullName)
         String fullName1="souvik chakraborty"
         println fullName1.hashCode()+" before calling method"
         groovyClass.takesGStringAsArgument("${fullName1}")
         //hashcode of javastring and gstring are not the same
         //gsting first calls toString() and then pas string as argument
    }
}
