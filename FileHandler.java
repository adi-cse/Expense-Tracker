import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE_NAME = "data.txt";

    public static void save(ArrayList<Transaction> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    public static ArrayList<Transaction> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Transaction>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
