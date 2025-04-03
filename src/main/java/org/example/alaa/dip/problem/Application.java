package org.example.alaa.dip.problem;

public class Application {

    private MySQLDatabase database = new MySQLDatabase();

    public void saveData(String data){
        database.save(data);
    }
}
