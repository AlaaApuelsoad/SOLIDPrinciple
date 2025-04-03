package org.example.alaa.srp.problem;

public class Invoice {

    Book book;
    int quantity;
    double discountRate;
    double taxRate;
    double total;


    public Invoice(Book book, int quantity, double discountRate, double taxRate, double total) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.price - book.price * discountRate) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }

    public void printInvoice() {
        System.out.println(quantity + "x " + book.name + " " + book.price + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }


    /*
    this invoice class contains fields about invoicing and 3 methods
    - calculateTotal: which calculates total price
    - printInvoice: that should print the invoice to console
    - saveToFile: responsible for writing the invoice into the file

    this is violating the Single Responsibility Principle contains more than one purpose
    the SRP states that our class should only have a single reason to change and that reason
    should be a changing in the invoice calculation for our class
    methods printInvoice and SaveToFile are violates the SRP for class


    To Solve this problem we should create 2classes for InvoicePrinter and InvoicePersistence
     */


}
