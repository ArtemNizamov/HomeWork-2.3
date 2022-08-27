public class Truck extends Transport implements Wheelable, Engineable, Trailerable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик" + getModelName());
        checkWheels();
        checkEngine();
        checkTrailer();
    }
}