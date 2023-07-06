package homework6;

import java.util.ArrayList;
import java.util.List;

public class CatTeam {
    private List<Cat> cats;

    public CatTeam() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void eat(Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
        }

//        cats.forEach(it -> it.eat(plate));
    }
}
