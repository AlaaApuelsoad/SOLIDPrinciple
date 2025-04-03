package org.example.alaa.ocp.problem;

import org.example.alaa.ocp.Invoice;

public class InvoicePersistence {

    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }

    /*
    Asking for adding feature that invoices to be saved to a database so that we can search them easily.
    The problem is we didn't design the classes to be easily extendable in the future so in order to add this feature
    we have modified the InvoicePersistence class.
    If our class design obeyed the Open-Closed principle we would not need to change this class.

    solution is change the InvoicePersistence to interface and add save method Each persistence class will implement
    this save method
     */
}
