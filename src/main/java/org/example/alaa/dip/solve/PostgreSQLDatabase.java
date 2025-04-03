package org.example.alaa.dip.solve;

public class PostgreSQLDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("save data in postgres database:"+data);
    }
}
