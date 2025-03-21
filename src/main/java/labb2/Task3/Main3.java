package labb2.Task3;

public class Main3 {
    public static void main(String[] args) {
        try {
            Transport businessCar = TransportFactory.createTransport("business");
            System.out.println(businessCar.getSpecifications());

            Transport familyVan = TransportFactory.createTransport("family");
            System.out.println(familyVan.getSpecifications());

            Transport motorbike = TransportFactory.createTransport("delivery");
            System.out.println(motorbike.getSpecifications());

            Transport unknown = TransportFactory.createTransport("unknown");
            System.out.println(unknown.getSpecifications());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
