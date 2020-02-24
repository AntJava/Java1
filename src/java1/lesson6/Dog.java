package java1.lesson6;


public class Dog extends Animal{

    static int dogCounter = 1;

    public Dog(int limRun, int limJump, int limSwim) {
        super("dog " + dogCounter, limRun, limJump, limSwim);
        dogCounter++;
    }



}
