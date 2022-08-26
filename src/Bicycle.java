public class Bicycle extends Transport implements Wheelable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        checkWheels();
    }
}