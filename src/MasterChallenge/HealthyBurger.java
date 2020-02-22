package MasterChallenge;

public class HealthyBurger extends Hamburger{

    private boolean cheese;
    private boolean bacon;

    private double cheesePrice;
    private double baconPrice;

    private double price;
    private double basePrise;

    public HealthyBurger(boolean meat, double price) {
        super("Brown rye", meat, price);
        this.price = price;
        this.basePrise = price;
    }

    public void addCheese(double price) {
        this.cheese = true;
        this.cheesePrice = price;
        this.price += price;
    }

    public void addBacon(double price) {
        this.bacon = true;
        this.baconPrice = price;
        this.price += price;
    }

    @Override
    public void showInformation() {
        System.out.println("Healthy Burger Ordered. Price of burger without the additions: £" + this.basePrise);

        if(!isLettuce() && !isTomato() && !isOnions() && !isPickles()) {
            System.out.println("No additions made.");
        } else {
            System.out.println("Additions:");

            if(isLettuce()) {
                System.out.println("Lettuce £" + getLettucePrice());
            }
            if(isTomato()) {
                System.out.println("Tomato £" + getTomatoPrice());
            }
            if(isOnions()) {
                System.out.println("Onions £" + getOnionsPrice());
            }
            if(isPickles()) {
                System.out.println("Pickles £" + getPicklesPrice());
            }
            if(isBacon()) {
                System.out.println("Bacon: £" + getBaconPrice());
            }
            if(isCheese()) {
                System.out.println("Cheese: £" + getCheesePrice());
            }
            System.out.println("Price of burger with additions: £" + (this.price + getAdditionPrice()));
        }
        System.out.println();
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isBacon() {
        return bacon;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getBaconPrice() {
        return baconPrice;
    }
}
