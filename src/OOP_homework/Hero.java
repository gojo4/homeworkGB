package OOP_homework;

public class Hero implements Healthcare, MagicEnergy {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentEnergy() {
        return currentManaPoint;
    }

    @Override
    public int getMaxEnergy() {
        return maxManaPoint;
    }
}
