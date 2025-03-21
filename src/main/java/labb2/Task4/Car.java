package labb2.Task4;

class Car extends Thread {
    private final GasStation gasStation;
    private String carName;

    public Car(GasStation gasStation, String name) {
        this.carName = name;
        this.gasStation = gasStation;
    }

    @Override
    public void run() {
        gasStation.refuel(this.carName);
    }
}
