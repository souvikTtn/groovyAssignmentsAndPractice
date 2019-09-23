class OptionalParameter {
     static void main(String[] args) {
         println addMethod(1,2)
         println addMethod(1,2,3)


    }
    static Integer addMethod(int a,int b,int c=0){
        return a+b+c;
    }
}
