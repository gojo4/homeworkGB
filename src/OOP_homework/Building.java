package OOP_homework;

public class Building implements Healthcare {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return maxHealthPoint;
    }
}
