package decorator;

 class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }
     public String description() {
         return "Simple Coffee";
     }
}