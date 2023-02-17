import java.util.Scanner;

/**
Напишите метод, который принимает на вход строку (String)
 и определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));;
        
        sc.close();

    }
    private static Boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() - i; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
