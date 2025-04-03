package org.example.alaa.srp.solve;

public class InvoicePrinter {

    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println(invoice.quantity + "x " + invoice.book.name + " " + invoice.book.price + "$");
        System.out.println("Discount Rate: " + invoice.discountRate);
        System.out.println("Tax Rate: " + invoice.taxRate);
        System.out.println("Total: " + invoice.total);
    }
}
