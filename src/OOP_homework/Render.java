package OOP_homework;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {
        // Не должно быть упоминания конкретных классов!!!
        if (object instanceof Healthcare) {
            Healthcare healthObject = (Healthcare) object;
            System.out.println("Current Health: " + healthObject.getCurrentHealth() + " | " + "Max Health: " + healthObject.getMaxHealth());
        }

        if (object instanceof MagicEnergy) {
            MagicEnergy energyObject = (MagicEnergy) object;
            System.out.println("Current Energy: " + energyObject.getCurrentEnergy() + " | " + "Max Energy: " + energyObject.getMaxEnergy());
        }
    }
}

