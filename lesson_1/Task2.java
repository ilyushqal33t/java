public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1 };
        int count = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;                //Подсчет длины текущей цепочки
            } else {
                if (count > res) {      //Проверка текущей цепочки к предыдущей
                    res = count;
                }
                count = 0;              //Обнуляем счетчик по окончании текущей цепочки
            }
        }
        if (count > res) {              //Если последняя цепочка больше итоговой 
            res = count;
        }
        System.out.println(res);
    }
}
