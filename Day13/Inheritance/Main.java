public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(false, "Black", 6, 4);
        c1.start();
        c1.carRunning();
        c1.displayCar();
        c1.displayVehicle();
        c1.stop();
    }
}
