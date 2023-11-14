import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Попробуйте угадать число от 0 до 100:");
        int value = new Random().nextInt(100);
        int attempt = new Scanner(System.in).nextInt();

        if (attempt < 0 || attempt > 100){
            System.out.println("Вы ввели число не подходящее под условие!");
        } else {
            while (attempt != value){
                if (attempt < value){
                    System.out.println("Загаданное число больше");
                    attempt = new Scanner(System.in).nextInt();
                } else if (attempt > value) {
                    System.out.println("Загаданное число меньше");
                    attempt = new Scanner(System.in).nextInt();
                }
            }
            System.out.println("Вы угадали!");
        }
    }
}