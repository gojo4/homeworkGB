package OOP_homework3;

/**
 * Создать класс Контейнер - Container.
 * В контейнере могут быть ящики (класс Box).
 * <p>
 * У каждого ящика есть вес.
 * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.
 * <p>
 * Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
 * Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
 * Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
 * Container c = new Container(...);
 * // ...
 * for (Box box: c) {
 * box - это контейнер
 * }
 */
public class Homework3 {
    public static void main(String[] args) {
        Container container1 = new Container();
        container1.addBox(new Box(20));
        container1.addBox(new Box(25));
        container1.addBox(new Box(10));
        container1.addBox(new Box(5));

        Container container2 = new Container();
        container2.addBox(new Box(10));
        container2.addBox(new Box(15));
        container2.addBox(new Box(25));

        System.out.println("Вес первого контейнера: " + container1.getWeight());
        System.out.println("Вес второго контейнера: " + container2.getWeight());

        System.out.println("Сравнение контейнеров по весу:  " + container1.compareTo(container2));

        ContainerCountComparator comparator = new ContainerCountComparator();
        System.out.println("Сравнение контейнеров по кол-ву коробок " + comparator.compare(container1, container2));

        System.out.println("Вес коробок первого контейнера: ");
        for (Box box : container1) {
            System.out.println(box.getWeight());
        }
        System.out.println("Вес коробок второго контейнера:");
        for (Box box : container2) {
            System.out.println(box.getWeight());
        }
    }
}