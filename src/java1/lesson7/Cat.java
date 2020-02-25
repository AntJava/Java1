package java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean saturation = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite == 0) saturation = true;
        if(!saturation && p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            saturation = true;
            //System.out.println(name + " съел " + appetite + " еды из тарелки и больше не голоден. Осталось еды в тарелке: " + p.getFood());
        } //else if (!saturation && p.getFood() < appetite) {
            //System.out.println(name + " голоден, но в тарелке не хватает " + (appetite - p.getFood()) + " еды :(");
        //} else if (saturation) System.out.println(name + " не голоден.");
    }

    public boolean getSaturation() {
        return saturation;
    }

    public String getName() {
        return name;
    }

}
