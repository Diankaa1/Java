package labb2.Task5;

public class Task5 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Thread chef = new Thread(() -> {
            String[] meals = {"Суп", "Стейк", "Салат", "Пицца", "Рыба", "Курица", "Рагу", "Торт", "Рис", "Лапша"};
            for (int i = 0; i < meals.length; i++) {
                System.out.printf("Повар начинает готовить %s [%d/%d]. На подносе сейчас: %d\n",
                        meals[i], i + 1, meals.length, restaurant.getQueueSize());
                restaurant.cook(meals[i]);
                try {
                    Thread.sleep(500); // Имитация времени на приготовление блюда
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread waiter = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Официант проверяет поднос. Блюд сейчас: %d\n", restaurant.getQueueSize());
                restaurant.serve();
                try {
                    Thread.sleep(800); // Имитация времени на подачу блюда
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        chef.start();
        waiter.start();
    }
}
