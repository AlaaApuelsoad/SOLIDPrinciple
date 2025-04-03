package org.example.alaa.ocp.solve;

import org.example.alaa.ocp.Invoice;

public class DatabasePersistence implements InvoicePersistence{

    @Override
    public void save(Invoice invoice) {
        System.out.println("saving to database");
    }
}
