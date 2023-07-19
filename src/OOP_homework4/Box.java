package OOP_homework4;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public int getWeight(){
        int totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void transferTo(Box<T> anotherBox){
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}
