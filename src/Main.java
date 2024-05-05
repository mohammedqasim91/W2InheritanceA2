//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Invoice class
        Invoice invoice = new Invoice("123456", "Hammer", 5, 10.99);

        // Display the initial values
        System.out.println("Initial Part Number: " + invoice.getPartNum());
        System.out.println("Initial Part Description: " + invoice.getPartDesc());
        System.out.println("Initial Quantity: " + invoice.getQuantity());
        System.out.println("Initial Price: " + invoice.getPrice());
        System.out.println("Initial Invoice Amount: " + invoice.getInvoiceAmount());

        // Update values using setter methods
        invoice.setPartNum("789012");
        invoice.setPartDesc("Screwdriver");
        invoice.setQuantity(10);
        invoice.setPrice(5.99);

        // Display the updated values
        System.out.println("\nUpdated Part Number: " + invoice.getPartNum());
        System.out.println("Updated Part Description: " + invoice.getPartDesc());
        System.out.println("Updated Quantity: " + invoice.getQuantity());
        System.out.println("Updated Price: " + invoice.getPrice());
        System.out.println("Updated Invoice Amount: " + invoice.getInvoiceAmount());
    }
}