public class JavaClass {
    public void takeStringAsArgument(String string){
        System.out.println(string);
        System.out.println(string.hashCode() +" after calling method ");
        System.out.println(string instanceof String);
    }
}
