import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList();
        notebooks.add(new Notebook(123123, 3212, "win", "red"));
        notebooks.add(new Notebook(231, 02, "Mac", "green"));

        findNoteBook(notebooks);
 
    }
    private static void findNoteBook(ArrayList<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите необходимое значение memory: ");
        int memory = Integer.parseInt(sc.nextLine());
        System.out.println("Введите необходимое значение disk: ");
        int disk = Integer.parseInt(sc.nextLine());
        System.out.println("Введите необходимое os: ");
        String os = sc.nextLine();
        System.out.println("Введите необходимый color: ");
        String color =  sc.nextLine();
        
        sc.close();

        Notebook searchedNotebook = new Notebook(memory, disk, os, color);
        Notebook findedNotebook = null;

        for (Notebook notebook : notebooks) {
            if (notebook.equals(searchedNotebook)) {
                findedNotebook = notebook;
            }
        }

        System.out.println(findedNotebook != null ? findedNotebook : "Не найден");
    }
}