package java1.lesson6;


public abstract class Animal {

    String name;
    int limRun;
    int limJump;
    int limSwim;

    public Animal(String name, int limRun, int limJump, int limSwim) {
        this.name = name;
        this.limRun = limRun;
        this.limJump = limJump;
        this.limSwim = limSwim;
    }

    final public void Jump(int task) {
        if (limJump >= task) {
            System.out.println(name + " can jump " + task + "m.");
        } else {System.out.println(name + " can't jump " + task + "m.");}
    }


    final public void Run(int task) {
        if (limRun >= task) {
            System.out.println(name + " can run " + task + "m.");
        } else {System.out.println(name + " can't run " + task + "m.");}
    }


    final public void Swim(int task) {
        if (limSwim >= task) {
            System.out.println(name + " can swim " + task + "m.");
        } else {System.out.println(name + " can't swim " + task + "m.");}
    }

}
