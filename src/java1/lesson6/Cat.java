package java1.lesson6;

public class Cat extends Animal {

    static int catCounter = 1;

    public Cat( int limRun, int limJump, int limSwim) {
        super("cat " + catCounter, limRun, limJump, limSwim);
        catCounter++;
    }

}
