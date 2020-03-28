package by.sugako.lesson16.serialisible;

import java.io.FileOutputStream;
import java.io.IOException;

public class PrintToFile {

    public boolean printToFile(String data, String fileName) {

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data.getBytes());
            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = new PrintToFile().printToFile("Hello Java 2", "readme.txt");
        if (result) System.out.println("Finished");
        else System.out.println("Error");
    }
}
