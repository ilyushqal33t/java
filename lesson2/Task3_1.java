import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();

        writeStriing(repeatString(text));
        sc.close();
    }

    private static String repeatString(String part) {
        StringBuilder fullMaker = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            fullMaker.append(part);
        }
        return fullMaker.toString();
    }

    private static void writeStriing(String string) {
        try (FileWriter file = new FileWriter("test.txt")) {
            file.append(string);
            System.out.println("Файл успешно создан");

        } catch (IOException ex) {
            System.err.println("Ошибка :" + ex);
        }
    }
}