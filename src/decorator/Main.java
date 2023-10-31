package decorator;

// Step 2: Create Concrete Component (SimpleCoffee)
class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.cost() + ", Description: " + coffee.description());

        Coffee milkCoffee = new Milk(coffee);
        System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        Coffee sugarMilkCoffee = new Sugar(milkCoffee);
        System.out.println("Cost: $" + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.description());
    }
}


