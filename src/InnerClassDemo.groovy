class InnerClassDemo {
    private String name
    def methodB(){
        new InnerClass().methodA()
    }
    class InnerClass{
        def methodA(){
            println name
        }
    }
     static void main(String[] args) {
        new InnerClassDemo(name: "souvik").methodB()
         //get all the properties of a class
         println InnerClassDemo.properties
    }
}

