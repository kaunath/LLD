package decorator;

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
