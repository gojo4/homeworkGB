package homework6;
/**
 *Доработать проект, который начали на уроке.
 *
 * Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по шкале (1, 2, ..., 10).
 * Кот хочет съесть то количество еды, каков его текущий голод. Например, если аппетит кота = 100, а голод 5, то он съест 50.
 * Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70, он съест 50.
 *
 * Пример.
 * Кот, его аппетит = 100
 * Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц еды.
 * Пусть в тарелке 25 единиц еды.
 * После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
 */

import java.util.HashSet;

public class OOPMain {
    public static void main(String[] args) throws Exception {
        Cat murzik = new Cat("Вжух", 100, 5);
        Cat lulu = new Cat("Борис", 20, 7);
        Cat kleo = new Cat("Томас", 50, 4);

        Plate plate = new Plate(200);

        murzik.eat(plate);
        lulu.eat(plate);
        kleo.eat(plate);

        System.out.println(murzik);
        System.out.println(lulu);
        System.out.println(kleo);
        System.out.println(plate);

//        Cat first = new Cat("Name", 150, 5);
//        Cat second = new Cat("Name", 100, 10);
//
//        System.out.println(first == second); // false
//        System.out.println(first.equals(second));
//
//        System.out.println(first.hashCode());
//        System.out.println(second.hashCode());

//        HashSet<Cat> cats = new HashSet<>();
//        cats.add(first);
//        cats.add(second);
//        System.out.println(cats);

    }
}
