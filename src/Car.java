public class Car extends Transport implements Wheelable, Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем машину " + getModelName());
        checkWheels();
        checkEngine();
    }
}