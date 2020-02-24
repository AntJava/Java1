package java1.lesson6;

public class Test {

    public static void main(String[] args) {
        Cat[] arrC = new Cat[3];
        arrC[0] = new Cat(300, 3, 5);
        arrC[1] = new Cat(500, 5, 0);
        arrC[2] = new Cat(700, 7, 7);
        Dog[] arrD = new Dog[3];
        arrD[0] = new Dog(500, 3, 100);
        arrD[1] = new Dog(700, 2, 50);
        arrD[2] = new Dog(300, 5, 30);

        for (int i = 0; i < arrC.length; i++) {
            arrC[i].Run((int) (Math.random() * 1000));
            arrC[i].Jump((int) (Math.random() * 8));
            arrC[i].Swim((int) (Math.random() * 10));
            System.out.println("");
        }
        for (int i = 0; i < arrD.length; i++) {
            arrD[i].Run((int) (Math.random() * 1000));
            arrD[i].Jump((int) (Math.random() * 8));
            arrD[i].Swim((int) (Math.random() * 150));
            System.out.println("");
        }

    }
}
