class OperatorOverloadingDemo {
     static void main(String[] args) {
         Complex c1=new Complex(real:2,img:3)
         Complex c2=new Complex(real: 5,img: 6)
         Complex c3=c1+c2
         println "new complex number is $c3.real + i$c3.img"
     }
}
class Complex{
     private int real
     private int img

    //constructors are added by default
    //getters and setters are added by default
    /*Complex(int real,int img){
        this.real=real
        this.img=img
    }
    Complex(){

    }*/
    Complex plus(Complex complex){
        Complex complex1=new Complex()
        complex1.real=this.real+complex.real
        complex1.img=this.img+complex.img
        complex1
    }
}