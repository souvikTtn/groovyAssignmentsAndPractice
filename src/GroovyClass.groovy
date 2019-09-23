class GroovyClass {
    void takesGStringAsArgument(GString string){
        println string;
        println string.hashCode()+" after calling method"
        println string instanceof GString
    }
}
