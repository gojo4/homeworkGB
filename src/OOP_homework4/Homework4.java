package OOP_homework4;

public class Homework4 {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(10));
        orangeBox.add(new Orange(5));
        orangeBox.add(new Orange(15));

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(5));
        appleBox.add(new Apple(10));
        appleBox.add(new goldenApple(12));

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Box<goldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new goldenApple(13));
        goldenAppleBox.add(new goldenApple(7));
        goldenAppleBox.add(new goldenApple(4));

        System.out.println("Вес коробки с золотыми яблоками: " + goldenAppleBox.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.transferTo(orangeBox1);
        System.out.println("Содерджимое из одной коробки пересыпали в другую: ");
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());
    }
}
