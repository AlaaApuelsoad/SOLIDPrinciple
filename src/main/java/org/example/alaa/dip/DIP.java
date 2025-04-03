package org.example.alaa.dip;

import org.example.alaa.dip.solve.Application;
import org.example.alaa.dip.solve.Database;
import org.example.alaa.dip.solve.MySQLDatabase;
import org.example.alaa.dip.solve.PostgreSQLDatabase;


public class DIP {
    public static void main(String[] args) {
        System.out.println("Dependency Inversion");


        /*
        The Dependency Inversion principle states that our classes should depend upon
         interfaces or abstract classes instead of concrete classes and functions.
         */

        Database mySQL = new MySQLDatabase();
        Application app1 = new Application(mySQL);
        app1.saveData("data");

        Database postgreSQL = new PostgreSQLDatabase();
        Application app2 = new Application(postgreSQL);
        app2.saveData("data");
    }
}
