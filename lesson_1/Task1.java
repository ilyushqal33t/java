import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String MyName = sc.nextLine();
        //System.out.println(String.format("Привет, %s!\n", MyName));
        System.out.printf("Привет, %s!\n", MyName);
        sc.close();
    }
}
