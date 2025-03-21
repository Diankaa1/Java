package labb2.Task4;

public class Task4 {
    public static void main(String[] args) {
        int gasColumns = 2;

        GasStation station = new GasStation(gasColumns);

        for (int i = 1; i <= 5; i++) {
            new Car(station, "Машина " + i).start();
        }
    }
}
