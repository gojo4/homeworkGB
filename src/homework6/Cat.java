package homework6;

import java.util.Collections;
import java.util.Objects;

import static java.lang.Math.min;

public class Cat {
    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)
    private final int SATIETY_MIN = 1;
    private final int SATIETY_MAX = 10;
    private final int SATIETY_RANGE = SATIETY_MAX - SATIETY_MIN + 1;

    public Cat(String name, int appetite, int satiety) throws Exception {
        if ((satiety < SATIETY_MIN) || (satiety > SATIETY_MAX))
            throw new Exception();

        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        int hunger = min(plate.getFood() / (appetite / SATIETY_RANGE), SATIETY_RANGE - this.satiety);
        int eatenFood = this.appetite * hunger / SATIETY_RANGE;
        plate.decreaseFood(eatenFood);
        this.satiety += hunger;
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "Сытость " + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            Cat anotherCat = (Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }
}
