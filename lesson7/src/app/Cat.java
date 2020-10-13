package app;

public class Cat {

    protected final String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        System.out.println("Кот питается");

        if (plate.getFood() >= appetite) {
            doEat(plate);
        }

    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
