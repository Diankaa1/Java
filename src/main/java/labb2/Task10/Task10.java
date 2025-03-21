package labb2.Task10;

import java.util.concurrent.*;

public class Task10 {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(5, () ->
                System.out.println("Стартуем!"));

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            executor.submit(new Runner(barrier, i));



        }

        executor.shutdown();
    }
}

