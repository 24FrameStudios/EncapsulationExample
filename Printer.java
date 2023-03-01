public class Printer {
    private int tonerLevel;
    private double pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public double getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer (int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.tonerLevel = ((tonerLevel >= 0) && (tonerLevel <= 100)) ? tonerLevel : -1;
        this.pagesPrinted = 0.0;
    }

    public void addToner(int tonerAmount) {
        if ((tonerAmount <= 0) || (tonerAmount > 100)) {
            System.out.println("Invalid toner amount, please add an amount of toner between 0 and 100");
            return;
        }
        else if (tonerAmount + tonerLevel > 100) {
             System.out.println("Adding " + tonerAmount + " units of toner will result in an overflow. Please add a smaller amount");
             return;
        }
        else {
            tonerLevel += tonerAmount;
            System.out.println(tonerAmount + " units of toner successfully added");
            System.out.println("Current toner level: " + tonerLevel);
        }
    }

    public void printPages(double pages) {
        if (duplex) {
            System.out.println("This is a duplex printer");
            pages =  Math.ceil(pages / 2);
        }
        else {
            System.out.println("This is not a duplex printer");

        }
        System.out.println("Total number of papers used for current job: " + pages);
        pagesPrinted += pages;
        System.out.println("Total lifetime pages printed: " + pagesPrinted);
    }
}
