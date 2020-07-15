import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Files {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            File file = new File("NewFile.txt");


            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Everything is working");
            pw.println("Hello, world");
            pw.println("Hello world!");
            pw.close();

            br = new BufferedReader(new FileReader("NewFile.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {

            try {
                br.close();

            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
    }
}
