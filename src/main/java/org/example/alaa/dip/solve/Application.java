package org.example.alaa.dip.solve;

public class Application {

    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void saveData(String data){
        database.save(data);
    }


}
