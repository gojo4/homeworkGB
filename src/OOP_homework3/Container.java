package OOP_homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box> {
    List<Box> boxes;

    public Container() {
        boxes = new ArrayList<>();
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Box box : boxes) {
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int compareTo(Container other) {
        return Integer.compare(this.getWeight(), other.getWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
