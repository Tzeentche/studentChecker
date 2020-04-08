package by.sugako.bits;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BitWiseOperations {

    public static void main(String[] args) {

        File file = new File("numbertext.txt");
        String text = read(file);
        List<String> numbers;
        numbers = findNumbers(text);
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Sum of numbers: " + countSum(numbers));
        System.out.println("Numbers with no duplicates: " + delDupl(numbers));
    }

    private static String read(File file) {
        StringBuilder builder = new StringBuilder();
        if (!file.exists()) {
            String text = "Косте выдали наряд: 1 шапка, 2 валенка, 1 ремень, 2 перчатки, а также 300 рублей";
            try {
                boolean created = file.createNewFile();
                FileWriter fw = new FileWriter(file);
                fw.write(text);
                fw.close();
            } catch (IOException e) {
                System.out.println("Problem occured while reading a file");
            }
            return read(file);
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = bufferedReader.readLine();
                while (line != null) {
                    builder.append(line);
                    builder.append("\n");
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                System.out.println("Problem occured while reading a file");
            }
            file.delete();
            return builder.toString();
        }
    }

    private static List<String> findNumbers(String text) {
        String numbers = text.replaceAll("[^\\d\\s]", "");
        if (!numbers.isBlank()) {
            return Stream.of(numbers.split("\\s+"))
                    .filter(s -> !s.isBlank()).map(String::new)
                    .collect(Collectors.toList());
        } else return new ArrayList<>();
    }

    private static int countSum(List<String> numbers) {
        if (!numbers.isEmpty()) {
            return numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .reduce(0, (a, b) -> (a + b));
        } else return 0;
    }

    private static List<String> delDupl(List<String> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
