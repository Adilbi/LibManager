public class CoffeMachine {
    private double volume = 300.0; // Oбъём чашки может быть "зашит" в программу
    private boolean isAlmondMilk = true; // Машина может работать с разными видами молока
    private void cleanMachine() {
        System.out.println("Очистка машины..");
    }
    private void warmWater() {
        System.out.println("Нагрев воды..");
    }
    private void grindGrain() {
        System.out.println("Дробление зёрен..");
    }
    private void addMilk() {
        System.out.println("Добавление молока..");
    }
    private void createFoam() {
        System.out.println("Добавляем пену..");
}

    public String getCappuccino() {
        cleanMachine(); // Тут, например, дополнительно происходит очистка
        warmWater(); // Нагреваем воду в нагревателе
        grindGrain(); // Размельчаем зерна
        addMilk(); // А здесь мы дополнительно добавляем молоко
        createFoam(); // Создаём пенку
        return "Капучино!";
    }
    public String getLatte() {
        cleanMachine();
        warmWater();
        grindGrain();
        addMilk(); // В латте гораздо меньше пены, поэтому отдельный метод не вызываем
        return "Латте!";
    }
    }
