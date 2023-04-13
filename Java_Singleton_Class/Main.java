package Java_Singleton_Class;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String... args){
        Database db;
        db = Database.getInstance();
        db.getConnection();
    }
}