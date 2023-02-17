
public class Task2 {
    /*
     * Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        int number = 1000;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                str.append(i);
                str.append(i == number - 3 ? "" : ", ");
            }
            
        }
        System.out.println(str.toString());
    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3)
            return true;
        if (num <= 1 || num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        return true;
    }
}
