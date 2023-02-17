import java.util.Scanner;

public class Task1{
    /*
     * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        String str = sc.nextLine();

        int n = Integer.parseInt(str);
        printSum(n);
        sc.close();
    }
    private static void printSum(int n) {
        String str = "1";
        int res = 0;
        System.out.println("1 = 1");
        for (int i = 2; i < n; i++) {
            res = i * (i + 1) / 2;
            System.out.printf("%s + ", str);
            System.out.printf("%d", i);
            System.out.printf(" = %d", res);
            System.out.println();
            str += " + ";
            str += i;
        }
    }
}