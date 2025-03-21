package labb2.Task2;

// Декораторы для добавок
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 50;
    }
}
