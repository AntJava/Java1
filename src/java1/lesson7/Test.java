package java1.lesson7;

public class Test {
    public static void main(String[] args) {
        Cat [] cats = new Cat[15];
        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i + 1), (int) (1 + Math.random() * 25));
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + " saturation = " + cats[i].getSaturation());
        }
        plate.info();
        plate.increaseFood(50);
        plate.info();
    }
}
