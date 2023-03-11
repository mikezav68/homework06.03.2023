public class ServiceStation {

    private void replaceWheels (Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        replaceWheels(bicycle);
    }

    public void check(Car car) {
            System.out.println("Обслуживаем " + car.getModelName());
            replaceWheels(car);
            car.checkEngine(); }

    public void check(Truck truck) {
            System.out.println("Обслуживаем " + truck.getModelName());
            replaceWheels(truck);
            truck.checkEngine();
            truck.checkTrailer(); }

}