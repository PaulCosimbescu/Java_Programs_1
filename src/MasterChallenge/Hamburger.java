package MasterChallenge;

public class Hamburger {

    private String bread;
    private boolean meat;

    private boolean lettuce;
    private boolean tomato;
    private boolean onions;
    private boolean pickles;

    private double lettucePrice;
    private double tomatoPrice;
    private double onionsPrice;
    private double picklesPrice;

    private double price;
    private double basePrice;
    private double additionPrice;

    public Hamburger(String bread, boolean meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.basePrice = price;
    }

    public void addLettuce(double price) {
        this.lettuce = true;
        this.lettucePrice = price;
        this.price += price;
        this.additionPrice += price;
    }

    public void addTomato(double price) {
        this.tomato = true;
        this.tomatoPrice = price;
        this.price += price;
        this.additionPrice += price;
    }

    public void addOnions(double price) {
        this.onions = true;
        this.onionsPrice = price;
        this.price += price;
        this.additionPrice += price;
    }

    public void addPickles(double price) {
        this.pickles = true;
        this.picklesPrice = price;
        this.price += price;
        this.additionPrice += price;
    }

    public void showInformation() {
        System.out.println("Normal Burger Ordered. Price of burger without the additions: £" + this.basePrice);

        if(!this.lettuce && !this.tomato && !this.onions && !this.pickles) {
            System.out.println("No additions made.");
        } else {
            System.out.println("Additions:");

            if(this.lettuce) {
                System.out.println("Lettuce £" + this.lettucePrice);
            }
            if(this.tomato) {
                System.out.println("Tomato £" + this.tomatoPrice);
            }
            if(this.onions) {
                System.out.println("Onions £" + this.onionsPrice);
            }
            if(this.pickles) {
                System.out.println("Pickles £" + this.picklesPrice);
            }
            System.out.println("Price of burger with additions: £" + this.price);
        }
        System.out.println();
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnions() {
        return onions;
    }

    public boolean isPickles() {
        return pickles;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getOnionsPrice() {
        return onionsPrice;
    }

    public double getPicklesPrice() {
        return picklesPrice;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }
}
