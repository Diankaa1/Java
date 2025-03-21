package labb2.Task8;

public class Task8 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        TrafficLightController controller = new TrafficLightController(trafficLight);
        controller.start();

        for (int i = 1; i <= 5; i++) {
            new Car(i, trafficLight).start();
        }
    }
}
