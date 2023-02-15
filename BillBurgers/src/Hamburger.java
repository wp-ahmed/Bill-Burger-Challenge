public class Hamburger {
    final private String name;
    final private String meat;
    final private double price;
    final private String breadRollType;
    private String addition1Name;
    private double addition1Price = 0.00;
    private String addition2Name;
    private double addition2Price = 0.00;
    private String addition3Name;
    private double addition3Price = 0.00;
    private String addition4Name;
    private double addition4Price = 0.00;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getName() {
        return name;
    }
    public double getBasePrice(){
        return price;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String topping, double price){
        addition1Name = topping;
        addition1Price = price;
    }
    public void addHamburgerAddition2(String topping, double price){
        addition2Name = topping;
        addition2Price = price;
    }
    public void addHamburgerAddition3(String topping, double price){
        addition3Name = topping;
        addition3Price = price;
    }
    public void addHamburgerAddition4(String topping, double price){
        addition4Name = topping;
        addition4Price = price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double itemizeHamburger(){
        printHamburger();
        printAddedToppings();

        return getBasePrice() + getAllToppingPrice();
    }
    protected void printHamburger() {
        System.out.println(getName() + " hamburger on a " + getBreadRollType() + " roll with " + getMeat() + ", prices is " + getBasePrice());
    }
    protected void printTopping(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
    }
    protected double getAllToppingPrice() {
        return getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price();
    }
    protected void printAddedToppings() {
        if(getAddition1Name() != null){
            printTopping(getAddition1Name(),getAddition1Price());
        }
         if(getAddition2Name() != null){
             printTopping(getAddition2Name(),getAddition2Price());
         }
         if(getAddition3Name() != null){
             printTopping(getAddition3Name(),getAddition3Price());
         }
         if(getAddition4Name() != null){
             printTopping(getAddition4Name(),getAddition4Price());
         }
    }
}
