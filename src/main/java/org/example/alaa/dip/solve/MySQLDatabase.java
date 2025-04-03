package org.example.alaa.dip.solve;

public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("save data in mysql database:"+data);
    }
}
