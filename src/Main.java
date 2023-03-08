public class Main {
    public static void main(String[] args) {

        /**
         * Напишите пример перехвата и обработки исключения с использованием собственных исключений.
         */

        int nums[] = new int[4];
        try {
            System.out.println("Сгенирировать исключение");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Индекс вне пределов досягаемости");
        }
    }
}







