package org.example.alaa.ocp.solve;

import org.example.alaa.ocp.Invoice;

public class FilePersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        System.out.println("file persisted");
    }
}
