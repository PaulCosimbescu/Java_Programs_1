package MasterChallenge;

public class DeluxeHamburger extends Hamburger{

    private boolean chips;
    private boolean drink;

    private double chipsPrice;
    private double drinkPrice;

    private double price;
    private double basePrise;

    public DeluxeHamburger(String bread, boolean meat, double price) {
        super(bread, meat, price);
        this.price = price;
        this.basePrise = price;
    }

    public void addDrink(double price) {
        this.drink = true;
        this.drinkPrice = price;
        this.price += price;
    }

    public void addChips(double price) {
        this.chips = true;
        this.chipsPrice = price;
        this.price += price;
    }

    @Override
    public void showInformation() {
        System.out.println("Deluxe Burger Ordered. Price of burger without the additions: £" + this.basePrise);

        if(!this.chips && !this.drink) {
            System.out.println("No additions made.");
        } else {
            System.out.println("Additions:");

            if(this.chips) {
                System.out.println("Chips £" + this.chipsPrice);
            }
            if(this.drink) {
                System.out.println("Drink £" + this.drinkPrice);
            }
            System.out.println("Price of burger with additions: £" + this.price);
        }
        System.out.println();
    }


    @Override
    public void addLettuce(double price) {
    }

    @Override
    public void addTomato(double price) {
    }

    @Override
    public void addOnions(double price) {
    }

    @Override
    public void addPickles(double price) {
    }
}
