package labb2.Task7;

public class Task7 {
    public static void main(String[] args) {
        // Создаем общий склад
        Warehouse warehouse = new Warehouse();

        // Создаем и запускаем поток производителя
        Thread producerThread = new Thread(new Producer(warehouse));
        producerThread.start();

        // Создаем и запускаем поток потребителя
        Thread consumerThread = new Thread(new Consumer(warehouse));
        consumerThread.start();

        try {
            Thread.sleep(30000); // 30 секунд

            // Завершаем программу
            producerThread.interrupt();
            consumerThread.interrupt();

            // Ждем завершения потоков
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
