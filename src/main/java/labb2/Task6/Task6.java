package labb2.Task6;

import java.util.concurrent.ThreadLocalRandom;

public class Task6 {
    public static void main(String[] args) {
        RailwayCrossing crossing = new RailwayCrossing();

        Thread train = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 7001));
                    crossing.trainArrives();

                    Thread.sleep(5000);
                    crossing.trainDeparts();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Поезд остановлен");
            }
        });

        // Машины
        Thread[] cars = new Thread[5];
        for (int i = 0; i < cars.length; i++) {
            int carId = i + 1;
            cars[i] = new Thread(() -> {
                try {
                    while (true) {
                        crossing.carArrives(carId);

                        Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 6000));
                        System.out.println("Машина " + carId + " вернулась к переезду");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Машина " + carId + " остановлена");
                }
            });
            cars[i].start();
        }

        train.start();
    }
}
