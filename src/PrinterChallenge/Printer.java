package PrinterChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
//        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner() {
        if(this.tonerLevel == 100) {
            System.out.println("Printer toner already full");
        } else {
            int fill;
            fill = 100 - this.tonerLevel;
            this.tonerLevel += fill;
            System.out.println("Printer toner level is 100%");
        }
    }

    public boolean isDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
        return this.duplexPrinter;
    }

    public int printPage(int numberOfPages) {
        if(this.duplexPrinter) {
            this.pagesPrinted = numberOfPages / 2;
            System.out.println("The printer is a duplex printer.");
        } else {
            this.pagesPrinted += numberOfPages;
        }
        return this.pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
