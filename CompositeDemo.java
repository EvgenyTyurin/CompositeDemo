/**
 * Composite pattern demo
 * Mar 2019 Evgeny Tyurin
 */

public class CompositeDemo {

    /** App run point*/
    public static void main(String[] args) {
        // New package to client
        Package aPackage = new Package("Delivery №1");
        // Put a book
        aPackage.addContent(new Good("book", 500));
        // Get box for electronic equipment
        Package electronicsPackage = new Package("Electronic box");
        // Put smartphone and headphones
        electronicsPackage.addContent(new Good("smartphone", 200));
        electronicsPackage.addContent(new Good("headphones", 30));
        // Put electronic box to a package
        aPackage.addContent(electronicsPackage);
        // Get final list and total weight, and ready to deliver
        System.out.println("Delivery list: " + aPackage.getLabel());
        System.out.println("Total weight : " + aPackage.getWeight());
    }

}
