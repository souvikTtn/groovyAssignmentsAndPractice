trait SpeakingDuck {
    String speak() { quack() }
}
class Duck implements SpeakingDuck {
    String quack(){
        "QUACK"
    }
}

Duck d=new Duck();
d.speak()