package MasterChallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White", true, 5.5);

        hamburger.addLettuce(1.2);
        hamburger.addOnions(1);
        hamburger.addPickles(1.4);
        hamburger.addTomato(1);

        hamburger.showInformation();

        HealthyBurger healthyBurger = new HealthyBurger(true, 7);

        healthyBurger.addLettuce(3);
        healthyBurger.addBacon(2);
        healthyBurger.addCheese(1);

        healthyBurger.showInformation();

        DeluxeHamburger deluxe = new DeluxeHamburger("White", true, 15);
        deluxe.addChips(3);
        deluxe.addDrink(1.3);
        deluxe.showInformation();

    }
}
