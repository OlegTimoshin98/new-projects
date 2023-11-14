import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет факториала целого числа");
        System.out.println("Введите число от 1 до 12:");
        int value = new Scanner(System.in).nextInt();
        int result = 1;

        if (value < 1 || value > 12) {
            System.out.println("Вы ввели число выходящее за рамки условий, введите другое число!");
        } else {
            for (int i = 1; i <= value; i++) {
                result = result * i;
            }
            System.out.println("Результат: " + result);
        }


    }
}