public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price = 0.00;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0.00;
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "rye");
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void addHealthyAddition1(String topping, double price) {
        healthyExtra1Name = topping;
        healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String topping, double price) {
        healthyExtra2Name = topping;
        healthyExtra2Price = price;
    }
    @Override
    public double itemizeHamburger() {
        printHamburger();
        printAddedToppings();
        return getBasePrice()+getAllToppingPrice()+getHealthyToppingPrice();
    }
    private double getHealthyToppingPrice() {
        return getHealthyExtra1Price() + getHealthyExtra2Price();
    }
    @Override
    protected void printAddedToppings() {
        super.printAddedToppings();
        if(getHealthyExtra1Name() != null) {
            printTopping(getHealthyExtra1Name(),getHealthyExtra1Price());
        }
        if(getHealthyExtra2Name() != null) {
            printTopping(getHealthyExtra2Name(),getHealthyExtra2Price());
        }
    }

    @Override
    protected void printHamburger() {
        System.out.println(getName() + " hamburger on a " + getBreadRollType() + " roll with " + getMeat() + ", prices is " + getBasePrice());
    }
}
