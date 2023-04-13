package Java_Singleton_Class;

import javax.xml.crypto.Data;

public class Database {
    private static Database dbObject;

    private Database() {

    }

    public static Database getInstance() {
        if(dbObject == null) {
            dbObject = new Database();
        }
        return dbObject;
    }
}
