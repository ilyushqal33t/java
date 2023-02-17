import java.util.Scanner;

public class Task3 {
    /*
     * Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Double num1 = sc.nextDouble();
        System.out.println("Введите знак операции (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        Double num2 = sc.nextDouble();

        calculate(num1, operation, num2);

        sc.close();

    }
    private static void calculate(double num1, char operation, double num2) {
        double res = 0;
        switch (operation){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
            System.out.println("Некорректные данные");
        }
        System.out.printf("%.1f %c %.1f = %.1f", num1, operation, num2, res);
    }
}
