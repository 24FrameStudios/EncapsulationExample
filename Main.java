public class Main {
    public static void main(String[] args) {
        Printer brother = new Printer(75, true);

        System.out.println("\nBrother Printer:\n");
        System.out.println("Toner Level: " + brother.getTonerLevel());
        System.out.println("Pages Printed: " + brother.getPagesPrinted());

        brother.addToner(10);
        System.out.println("Toner Level: " + brother.getTonerLevel());

        brother.printPages(7.0);
        brother.printPages(5.0);
    }
}
